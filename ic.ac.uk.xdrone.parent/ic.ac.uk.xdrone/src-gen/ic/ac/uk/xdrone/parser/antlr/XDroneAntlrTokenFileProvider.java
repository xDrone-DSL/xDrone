/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XDroneAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ic/ac/uk/xdrone/parser/antlr/internal/InternalXDrone.tokens");
	}
}
