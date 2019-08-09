/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.generator;

import com.google.common.collect.Iterables;
import ic.ac.uk.xdrone.xDrone.Backward;
import ic.ac.uk.xdrone.xDrone.Command;
import ic.ac.uk.xdrone.xDrone.Down;
import ic.ac.uk.xdrone.xDrone.Drone;
import ic.ac.uk.xdrone.xDrone.Environment;
import ic.ac.uk.xdrone.xDrone.Fly;
import ic.ac.uk.xdrone.xDrone.Forward;
import ic.ac.uk.xdrone.xDrone.Left;
import ic.ac.uk.xdrone.xDrone.Move;
import ic.ac.uk.xdrone.xDrone.Right;
import ic.ac.uk.xdrone.xDrone.RotateL;
import ic.ac.uk.xdrone.xDrone.RotateR;
import ic.ac.uk.xdrone.xDrone.SuperCommand;
import ic.ac.uk.xdrone.xDrone.Up;
import ic.ac.uk.xdrone.xDrone.Wait;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class XDroneGenerator extends AbstractGenerator {
  public CharSequence compile(final Environment environment) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function environment()");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//resets drone location");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("drone.position.x = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("drone.position.z = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("drone.position.y = 0;");
    _builder.newLine();
    {
      EList<Drone> _drone = environment.getDrone();
      for(final Drone d : _drone) {
        _builder.append("\t");
        _builder.append("drone.position.x = ");
        String _x = d.getX();
        _builder.append(_x, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("drone.position.z = ");
        String _z = d.getZ();
        _builder.append(_z, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("drone.position.y = ");
        String _y = d.getY();
        _builder.append(_y, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ic.ac.uk.xdrone.xDrone.Object> _objects = environment.getObjects();
      for(final ic.ac.uk.xdrone.xDrone.Object ob : _objects) {
        _builder.append("\t");
        _builder.append("addCube(\"");
        String _object_name = ob.getObject_name();
        _builder.append(_object_name, "\t");
        _builder.append("\",");
        String _sx = ob.getSx();
        _builder.append(_sx, "\t");
        _builder.append(", ");
        String _sy = ob.getSy();
        _builder.append(_sy, "\t");
        _builder.append(", ");
        String _sz = ob.getSz();
        _builder.append(_sz, "\t");
        _builder.append(", ");
        String _lx = ob.getLx();
        _builder.append(_lx, "\t");
        _builder.append(", ");
        String _ly = ob.getLy();
        _builder.append(_ly, "\t");
        _builder.append(", ");
        String _lz = ob.getLz();
        _builder.append(_lz, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileJS(final Fly fly) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var commands = [];");
    _builder.newLine();
    _builder.append("var currentDroneLocation = {x: drone.position.x, y: drone.position.y, z: drone.position.z};");
    _builder.newLine();
    _builder.append("var goalDroneLocation = currentDroneLocation;");
    _builder.newLine();
    _builder.append("var goalDroneRotation = drone.rotation.y;");
    _builder.newLine();
    _builder.append("var currentFunction = \"\";");
    _builder.newLine();
    _builder.append("var finishSimulation = false;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Drone\'s path");
    _builder.newLine();
    _builder.append("var lineMaterial = new THREE.LineBasicMaterial({color: 0x1ACF10});");
    _builder.newLine();
    _builder.append("var lineGeometry = new THREE.Geometry();");
    _builder.newLine();
    _builder.append("lineGeometry.vertices.push(");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z)");
    _builder.newLine();
    _builder.append(");");
    _builder.newLine();
    _builder.append("var lastX = drone.position.x, lastY = drone.position.y, lastZ = drone.position.z;");
    _builder.newLine();
    {
      EList<String> _takeoff = fly.getTakeoff();
      for(final String to : _takeoff) {
        _builder.append("commands.push({x: 0, y: 0.7, z: 0}); ");
        _builder.newLine();
        _builder.append("//lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY + 0.7, lastZ));");
        _builder.newLine();
        _builder.append("lastY += 0.7;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("//commands.push({w: 2}); ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//commands.push({x: 2, y: 0, z: 0}); ");
    _builder.newLine();
    _builder.append("//lineGeometry.vertices.push(new THREE.Vector3(lastX + 2, lastY, lastZ));");
    _builder.newLine();
    _builder.append("//lastX += 2;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//commands.push({r: 90 / 90 * (Math.PI/2)}); ");
    _builder.newLine();
    _builder.append("//commands.push({r: 90}); ");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//commands.push({x: -2, y: 0, z: 4}); ");
    _builder.newLine();
    _builder.append("//lineGeometry.vertices.push(new THREE.Vector3(lastX + 2, lastY, lastZ));");
    _builder.newLine();
    _builder.append("//lastX += 2;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//IMPORTATNT ");
    _builder.newLine();
    _builder.append("// -roation is right");
    _builder.newLine();
    _builder.newLine();
    {
      EList<String> _land = fly.getLand();
      for(final String to_1 : _land) {
        _builder.append("commands.push({x: 0, y: -0.7, z: 0}); ");
        _builder.newLine();
        _builder.append("//lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY - 0.7, lastZ));");
        _builder.newLine();
        _builder.append("lastY -= 0.7;");
        _builder.newLine();
      }
    }
    _builder.append("nextCommand();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if(line)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("scene.remove( line );");
    _builder.newLine();
    _builder.append("line = new THREE.Line( lineGeometry, lineMaterial );");
    _builder.newLine();
    _builder.newLine();
    _builder.append("scene.add( line );");
    _builder.newLine();
    _builder.append("function flySimulation(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(!finishSimulation){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if((currentFunction == \"MOVE\" && fly(goalDroneLocation))");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("|| (currentFunction == \"ROTATION\" && rotation(goalDroneRotation))){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("nextCommand();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function nextCommand(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(commands && commands[0]){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(commands[0].r){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("goalDroneRotation += commands[0].r;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("currentFunction = \"ROTATION\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else if(commands[0].w){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("execute = false;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("setTimeout(function () {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("execute = true;");
    _builder.newLine();
    _builder.append("\t\t\t    ");
    _builder.append("}, (commands[0].w * 1000));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("goalDroneLocation.x = commands[0].x; //+");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("goalDroneLocation.y = commands[0].y;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("goalDroneLocation.z = commands[0].z;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("currentFunction = \"MOVE\";");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("commands.shift();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("else{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("finishSimulation = true;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilePython(final Fly fly) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#! /usr/bin/env python");
    _builder.newLine();
    _builder.append("import sys");
    _builder.newLine();
    _builder.append("sys.path.append(\'/opt/ros/indigo/lib/python2.7/dist-packages\')");
    _builder.newLine();
    _builder.append("import rospy");
    _builder.newLine();
    _builder.newLine();
    _builder.append("from std_msgs.msg import Empty");
    _builder.newLine();
    _builder.append("from ardrone_autonomy.msg import Navdata\t");
    _builder.newLine();
    _builder.append("from geometry_msgs.msg import Twist\t");
    _builder.newLine();
    _builder.append("PI = 3.1415926535897");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state = -1;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def ReceiveNavdata(data):");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("global state");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("state = data.state");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def rotate(speed, angle, clockwise):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg = Twist()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("velocity_publisher = rospy.Publisher(\'/cmd_vel\', Twist, queue_size=1)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("angular_speed = speed*PI/360");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("relative_angle = angle*PI/360");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.x=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.y=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.z=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.angular.x = 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.angular.y = 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if clockwise:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("vel_msg.angular.z = -abs(angular_speed)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("vel_msg.angular.z = abs(angular_speed)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("t0 = rospy.Time.now().to_sec()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("current_angle = 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while velocity_publisher.get_num_connections() < 1:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("rospy.sleep(0.1)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while(current_angle < relative_angle):");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("velocity_publisher.publish(vel_msg)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("t1 = rospy.Time.now().to_sec()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("current_angle = angular_speed*(t1-t0)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.angular.z = 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("velocity_publisher.publish(vel_msg)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("#direction (true)- forward, left, up");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def move(speed, distance, direction, axis): ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg = Twist()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("velocity_publisher = rospy.Publisher(\'/cmd_vel\', Twist, queue_size=1)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.x=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.y=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.z=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.angular.x = 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.angular.y = 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.angular.z = 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if axis == \"x\":");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if direction:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("vel_msg.linear.x = abs(speed)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("vel_msg.linear.x = -abs(speed)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("elif axis == \"y\":");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if direction:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("vel_msg.linear.y = abs(speed)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("vel_msg.linear.y = -abs(speed)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("elif axis == \"z\":");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if direction:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("vel_msg.linear.z = abs(speed)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("vel_msg.linear.z = -abs(speed)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while velocity_publisher.get_num_connections() < 1:");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("rospy.sleep(0.1)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("t0 = rospy.Time.now().to_sec()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("current_distance = 0");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while(current_distance < distance):");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("velocity_publisher.publish(vel_msg)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("t1 = rospy.Time.now().to_sec()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("current_distance = speed*(t1-t0)");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.x=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.y=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("vel_msg.linear.z=0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("velocity_publisher.publish(vel_msg)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("rospy.init_node(\'test_node\')");
    _builder.newLine();
    _builder.append("empty = Empty()");
    _builder.newLine();
    _builder.append("rospy.Subscriber(\'/ardrone/navdata\', Navdata, ReceiveNavdata)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("while state == -1:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rospy.sleep(0.1)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if state == 0:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("reset = rospy.Publisher(\'/ardrone/reset\', Empty, queue_size=1)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("while reset.get_num_connections() < 1:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("rospy.sleep(0.1)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("reset.publish(empty)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("while state == 0:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rospy.sleep(0.1)");
    _builder.newLine();
    _builder.newLine();
    {
      EList<String> _takeoff = fly.getTakeoff();
      for(final String to : _takeoff) {
        _builder.append("takeoff = rospy.Publisher(\'/ardrone/takeoff\', Empty, queue_size=1)");
        _builder.newLine();
        _builder.newLine();
        _builder.append("while takeoff.get_num_connections() < 1:");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("rospy.sleep(0.1)");
        _builder.newLine();
        _builder.newLine();
        _builder.append("takeoff.publish(empty)");
        _builder.newLine();
        _builder.append("rospy.sleep(5)");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<SuperCommand> _commands = fly.getCommands();
      for(final SuperCommand f : _commands) {
        {
          if ((f instanceof Command)) {
            CharSequence _compile = this.compile(((Command)f));
            _builder.append(_compile);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<String> _land = fly.getLand();
      for(final String to_1 : _land) {
        _builder.append("land = rospy.Publisher(\'/ardrone/land\', Empty, queue_size=1)");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("while land.get_num_connections() < 1:");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("rospy.sleep(0.1)");
        _builder.newLine();
        _builder.newLine();
        _builder.append("land.publish(empty)");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Command cmd) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((cmd instanceof Up)) {
        _builder.append("move(0.1, ");
        String _distance = ((Up)cmd).getDistance();
        _builder.append(_distance);
        _builder.append(", True, \"z\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof Down)) {
        _builder.append("\t  \t");
        _builder.append("move(0.1, ");
        String _distance_1 = ((Down)cmd).getDistance();
        _builder.append(_distance_1, "\t  \t");
        _builder.append(", False, \"z\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof Left)) {
        _builder.append("\t  \t");
        _builder.append("move(0.1, ");
        String _distance_2 = ((Left)cmd).getDistance();
        _builder.append(_distance_2, "\t  \t");
        _builder.append(", True, \"y\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof Right)) {
        _builder.append("\t  \t");
        _builder.append("move(0.1, ");
        String _distance_3 = ((Right)cmd).getDistance();
        _builder.append(_distance_3, "\t  \t");
        _builder.append(", False, \"y\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof Forward)) {
        _builder.append("\t  \t");
        _builder.append("move(0.1, ");
        String _distance_4 = ((Forward)cmd).getDistance();
        _builder.append(_distance_4, "\t  \t");
        _builder.append(", True, \"x\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof Backward)) {
        _builder.append("\t  \t");
        _builder.append("move(0.1, ");
        String _distance_5 = ((Backward)cmd).getDistance();
        _builder.append(_distance_5, "\t  \t");
        _builder.append(", False, \"x\")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof RotateL)) {
        _builder.append("rotate(30, ");
        int _angle = ((RotateL)cmd).getAngle();
        _builder.append(_angle);
        _builder.append(", False)");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof RotateR)) {
        _builder.append("\t  \t");
        _builder.append("rotate(30, ");
        int _angle_1 = ((RotateR)cmd).getAngle();
        _builder.append(_angle_1, "\t  \t");
        _builder.append(", True)");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof Wait)) {
        _builder.append("\t  \t");
        _builder.append("rospy.sleep(");
        String _seconds = ((Wait)cmd).getSeconds();
        _builder.append(_seconds, "\t  \t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((cmd instanceof Move)) {
      }
    }
    return _builder;
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String result = "";
    long time = System.currentTimeMillis();
    Iterable<Fly> _filter = Iterables.<Fly>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Fly.class);
    for (final Fly fly : _filter) {
      {
        result = this.compilePython(fly).toString();
        fsa.generateFile("/xdrone/result.py", result);
      }
    }
    try {
      File file = new File("/xdrone/result.py");
      file.getParentFile().mkdirs();
      PrintWriter writer = new PrintWriter(file, "UTF-8");
      writer.println(result);
      writer.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    result = "";
    Iterable<Fly> _filter_1 = Iterables.<Fly>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Fly.class);
    for (final Fly fly_1 : _filter_1) {
      {
        result = this.compileJS(fly_1).toString();
        fsa.generateFile((("Webroot/simulator" + Long.valueOf(time)) + ".js"), result);
      }
    }
    try {
      File file = new File((("Webroot/simulator" + Long.valueOf(time)) + ".js"));
      file.getParentFile().mkdirs();
      PrintWriter writer = new PrintWriter(file, "UTF-8");
      writer.println(result);
      writer.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    result = "";
    Iterable<Environment> _filter_2 = Iterables.<Environment>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Environment.class);
    for (final Environment environment : _filter_2) {
      {
        result = this.compile(environment).toString();
        fsa.generateFile((("Webroot/environment" + Long.valueOf(time)) + ".js"), result);
      }
    }
    try {
      File file = new File((("Webroot/environment" + Long.valueOf(time)) + ".js"));
      file.getParentFile().mkdirs();
      PrintWriter writer = new PrintWriter(file, "UTF-8");
      writer.println(result);
      writer.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
