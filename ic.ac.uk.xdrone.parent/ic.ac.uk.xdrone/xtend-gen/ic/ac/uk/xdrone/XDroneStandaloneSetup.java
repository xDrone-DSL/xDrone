/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone;

import ic.ac.uk.xdrone.XDroneStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class XDroneStandaloneSetup extends XDroneStandaloneSetupGenerated {
  public static void doSetup() {
    new XDroneStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
