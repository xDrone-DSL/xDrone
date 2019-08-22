/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.tests;

import com.google.inject.Inject;
import ic.ac.uk.xdrone.tests.XDroneInjectorProvider;
import ic.ac.uk.xdrone.xDrone.Program;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(XDroneInjectorProvider.class)
@SuppressWarnings("all")
public class XDroneParsingTest {
  @Inject
  private ParseHelper<Program> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("fly(){");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("TAKEOFF()");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("LAND()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("environment(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("TABLE{");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("origin=(3.5,0.5,1.5)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("size=(1,1,1)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("color=\"#ff0000\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("SOFA_1{");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("origin=(2, 0.5, 1.5)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("size=(2,1,1)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("color=\"brown\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("SOFA_2{");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("origin=(3.5, 0.5, 0)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("size=(1, 1, 2)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("color=\"blue\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("PLANT{");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("origin=(-2.5, 1, -1.5)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("size=(1, 2, 1)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("color=\"green\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Program result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
