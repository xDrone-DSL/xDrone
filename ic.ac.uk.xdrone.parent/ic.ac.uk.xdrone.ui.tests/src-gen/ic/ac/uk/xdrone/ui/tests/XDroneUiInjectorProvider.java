/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.ui.tests;

import com.google.inject.Injector;
import ic.ac.uk.xdrone.ui.internal.XdroneActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class XDroneUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XdroneActivator.getInstance().getInjector("ic.ac.uk.xdrone.XDrone");
	}

}
