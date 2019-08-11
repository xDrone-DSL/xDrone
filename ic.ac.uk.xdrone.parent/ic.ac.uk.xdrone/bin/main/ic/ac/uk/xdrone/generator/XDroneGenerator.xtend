/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ic.ac.uk.xdrone.xDrone.Fly
import ic.ac.uk.xdrone.xDrone.Command
import ic.ac.uk.xdrone.xDrone.Up
import ic.ac.uk.xdrone.xDrone.Down
import ic.ac.uk.xdrone.xDrone.Left
import ic.ac.uk.xdrone.xDrone.Right
import ic.ac.uk.xdrone.xDrone.Forward
import ic.ac.uk.xdrone.xDrone.Backward
import ic.ac.uk.xdrone.xDrone.RotateL
import ic.ac.uk.xdrone.xDrone.RotateR
import ic.ac.uk.xdrone.xDrone.Wait
import java.io.PrintWriter
import java.io.IOException
import java.io.File
import ic.ac.uk.xdrone.xDrone.Move
import ic.ac.uk.xdrone.xDrone.Environment
import ic.ac.uk.xdrone.xDrone.Drone

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class XDroneGenerator extends AbstractGenerator {

	def compile(Environment environment)'''
	function environment()
	{
		//resets drone location
		drone.position.x = 0;
		drone.position.z = 0;
		drone.position.y = 0;
		«FOR d : environment.drone»
			drone.position.x = «d.vector.x»
			drone.position.z = «d.vector.z»
			drone.position.y = «d.vector.y»
		«ENDFOR»
		«FOR ob : environment.objects»
«««			addCube("«ob.object_name»",«ob.sx», «ob.sy», «ob.sz», «ob.lx», «ob.ly», «ob.lz»)
			addCube("«ob.object_name»",«ob.size.vector.x», «ob.size.vector.y», «ob.size.vector.z», 
				«ob.origin.vector.x», «ob.origin.vector.y», «ob.origin.vector.z», "«ob.color.color_value»")
		«ENDFOR»
	}
	'''
	
	def compileJS(Fly fly)'''
		var commands = [];
		var currentDroneLocation = {x: drone.position.x, y: drone.position.y, z: drone.position.z};
		var goalDroneLocation = currentDroneLocation;
		var goalDroneRotation = drone.rotation.y;
		var currentFunction = "";
		var finishSimulation = false;

		//Drone's path
		var lineMaterial = new THREE.LineBasicMaterial({color: 0x1ACF10});
		var lineGeometry = new THREE.Geometry();
		lineGeometry.vertices.push(
			new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z)
		);
		var lastX = drone.position.x, lastY = drone.position.y, lastZ = drone.position.z;
		«FOR to : fly.takeoff»
			commands.push({x: 0, y: 0.7, z: 0}); 
			//lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY + 0.7, lastZ));
			lastY += 0.7;
		«ENDFOR»
		
		//commands.push({w: 2}); 
		
		//commands.push({x: 2, y: 0, z: 0}); 
		//lineGeometry.vertices.push(new THREE.Vector3(lastX + 2, lastY, lastZ));
		//lastX += 2;
		
		//commands.push({r: 90 / 90 * (Math.PI/2)}); 
		//commands.push({r: 90}); 
								
		
		//commands.push({x: -2, y: 0, z: 4}); 
		//lineGeometry.vertices.push(new THREE.Vector3(lastX + 2, lastY, lastZ));
		//lastX += 2;
		
		//IMPORTATNT 
		// -roation is right
		
		«FOR to : fly.land»
			commands.push({x: 0, y: -0.7, z: 0}); 
			//lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY - 0.7, lastZ));
			lastY -= 0.7;
		«ENDFOR»
		nextCommand();
		
		if(line)
			scene.remove( line );
		line = new THREE.Line( lineGeometry, lineMaterial );
		
		scene.add( line );
		function flySimulation(){
			if(!finishSimulation){
				if((currentFunction == "MOVE" && fly(goalDroneLocation))
					|| (currentFunction == "ROTATION" && rotation(goalDroneRotation))){
					nextCommand();
				}
			}
		}
		
		function nextCommand(){
			if(commands && commands[0]){
				if(commands[0].r){
					goalDroneRotation += commands[0].r;
					currentFunction = "ROTATION";
				}
				else if(commands[0].w){
					execute = false;
					setTimeout(function () {
						execute = true;
					    }, (commands[0].w * 1000));
				}
				else{
					goalDroneLocation.x = commands[0].x; //+
					goalDroneLocation.y = commands[0].y;
					goalDroneLocation.z = commands[0].z;
					currentFunction = "MOVE";
					lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
				}
				commands.shift();
			}
			else{
				finishSimulation = true;	
			}
		}
	'''
	

	def compilePython(Fly fly)'''
		#! /usr/bin/env python
		import sys
		sys.path.append('/opt/ros/indigo/lib/python2.7/dist-packages')
		import rospy
		
		from std_msgs.msg import Empty
		from ardrone_autonomy.msg import Navdata	
		from geometry_msgs.msg import Twist	
		PI = 3.1415926535897
		
		state = -1;
		
		def ReceiveNavdata(data):
			global state
			state = data.state
			
			def rotate(speed, angle, clockwise):
				vel_msg = Twist()
				velocity_publisher = rospy.Publisher('/cmd_vel', Twist, queue_size=1)
			
				angular_speed = speed*PI/360
				relative_angle = angle*PI/360
			
				vel_msg.linear.x=0
				vel_msg.linear.y=0
				vel_msg.linear.z=0
				vel_msg.angular.x = 0
				vel_msg.angular.y = 0
			
				if clockwise:
					vel_msg.angular.z = -abs(angular_speed)
				else:
					vel_msg.angular.z = abs(angular_speed)
			
				t0 = rospy.Time.now().to_sec()
				current_angle = 0
			
				while velocity_publisher.get_num_connections() < 1:
					rospy.sleep(0.1)
			
				while(current_angle < relative_angle):
					velocity_publisher.publish(vel_msg)
					t1 = rospy.Time.now().to_sec()
					current_angle = angular_speed*(t1-t0)
			
				vel_msg.angular.z = 0
				velocity_publisher.publish(vel_msg)
			
			
			#direction (true)- forward, left, up
			def move(speed, distance, direction, axis): 
				vel_msg = Twist()
				velocity_publisher = rospy.Publisher('/cmd_vel', Twist, queue_size=1)
			
				vel_msg.linear.x=0
				vel_msg.linear.y=0
				vel_msg.linear.z=0
				vel_msg.angular.x = 0
				vel_msg.angular.y = 0
				vel_msg.angular.z = 0
			
				if axis == "x":
					if direction:
						vel_msg.linear.x = abs(speed)
					else:
						vel_msg.linear.x = -abs(speed)
				elif axis == "y":
					if direction:
						vel_msg.linear.y = abs(speed)
					else:
						vel_msg.linear.y = -abs(speed)
				elif axis == "z":
					if direction:
						vel_msg.linear.z = abs(speed)
					else:
						vel_msg.linear.z = -abs(speed)
			
			
				while velocity_publisher.get_num_connections() < 1:
					rospy.sleep(0.1)
			
				t0 = rospy.Time.now().to_sec()
				current_distance = 0
			
				while(current_distance < distance):
					velocity_publisher.publish(vel_msg)
					t1 = rospy.Time.now().to_sec()
					current_distance = speed*(t1-t0)
			
				vel_msg.linear.x=0
				vel_msg.linear.y=0
				vel_msg.linear.z=0
				velocity_publisher.publish(vel_msg)
				
		
		rospy.init_node('test_node')
		empty = Empty()
		rospy.Subscriber('/ardrone/navdata', Navdata, ReceiveNavdata)
		
		while state == -1:
			rospy.sleep(0.1)
		
		if state == 0:
			reset = rospy.Publisher('/ardrone/reset', Empty, queue_size=1)
			while reset.get_num_connections() < 1:
				rospy.sleep(0.1)
			reset.publish(empty)
		
		while state == 0:
			rospy.sleep(0.1)
		
		«FOR to : fly.takeoff»  
			takeoff = rospy.Publisher('/ardrone/takeoff', Empty, queue_size=1)
			
			while takeoff.get_num_connections() < 1:
				rospy.sleep(0.1)
			
			takeoff.publish(empty)
			rospy.sleep(5)
		«ENDFOR»
		
		«FOR f : fly.commands»
			«IF f instanceof Command»
				«f.compile»
			«ENDIF»
		«ENDFOR»
		
		«FOR to : fly.land»  
			land = rospy.Publisher('/ardrone/land', Empty, queue_size=1)
						
			while land.get_num_connections() < 1:
				rospy.sleep(0.1)
			
			land.publish(empty)
		«ENDFOR»
	'''
	
	def compile(Command cmd) '''
		«IF cmd instanceof Up »
		move(0.1, «cmd.distance», True, "z")
	  	«ENDIF»
	  	«IF cmd instanceof Down»
	  	move(0.1, «cmd.distance», False, "z")
	  	«ENDIF»
	  	«IF cmd instanceof Left »
	  	move(0.1, «cmd.distance», True, "y")
	  	«ENDIF»
	  	«IF cmd instanceof Right»
	  	move(0.1, «cmd.distance», False, "y")
	  	«ENDIF»
	  	«IF cmd instanceof Forward»	
	  	move(0.1, «cmd.distance», True, "x")
	  	«ENDIF»
	  	«IF cmd instanceof Backward»	
	  	move(0.1, «cmd.distance», False, "x")
	  	«ENDIF»
	  	«IF cmd instanceof RotateL»	
		rotate(30, «cmd.angle», False)
	  	«ENDIF»
	  	«IF cmd instanceof RotateR»	
	  	rotate(30, «cmd.angle», True)
	  	«ENDIF»
	  	«IF cmd instanceof Wait»
	  	rospy.sleep(«cmd.seconds»)
	  	«ENDIF»
	  	«IF cmd instanceof Move»
	  	«ENDIF»
	'''


	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var result = "";
		var time = System.currentTimeMillis();
		for(fly : resource.allContents.toIterable.filter(Fly)) {
			result = fly.compilePython.toString; 
			fsa.generateFile('/xdrone/result.py', result); //Locally change path to 'result.py'
		}
		
		try {
			var file = new File("/xdrone/result.py");
			file.getParentFile().mkdirs();
			
			var writer = new PrintWriter(file, "UTF-8");
		    writer.println(result);
		    writer.close();   
		} catch (IOException e) {
		   // do something
		}
//		fsa.generateFile('result.py', result)

		
		result = "";
		for(fly : resource.allContents.toIterable.filter(Fly)) {
			result = fly.compileJS.toString; 
			fsa.generateFile('Webroot/simulator' + time +'.js', result); //locally change path to 'Webroot/simulator' + time +'.js'
		}
		
		try {
			var file = new File('Webroot/simulator' + time +'.js');
			file.getParentFile().mkdirs();
			
			var writer = new PrintWriter(file, "UTF-8");
		    writer.println(result);
		    writer.close();   
		} catch (IOException e) {
		   // do something
		}
//		fsa.generateFile('result.py', result)
		
		
		result = "";
		for(environment : resource.allContents.toIterable.filter(Environment)) {
			result = environment.compile.toString; 
			fsa.generateFile('Webroot/environment' + time +'.js', result); //locally change path to 'Webroot/simulator' + time +'.js'
		}
		
		try {
			var file = new File('Webroot/environment' + time +'.js'); //locally change path to 'Webroot/simulator' + time +'.js'
			file.getParentFile().mkdirs();
			
			var writer = new PrintWriter(file, "UTF-8");
		    writer.println(result);
		    writer.close();   
		} catch (IOException e) {
		   // do something
		}
		
//		fsa.generateFile('Webroot/simulator' + time +'.js', simulator)
	}
}