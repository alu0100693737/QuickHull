package test.java.quickhull;

import static java.lang.String.format;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import quickhull.Boton;

/**
 * {@link Boton} specific assertions - Generated by CustomAssertionGenerator.
 */
public class BotonAssert extends AbstractAssert<BotonAssert, Boton> {

	/**
	 * Creates a new </code>{@link BotonAssert}</code> to make assertions on actual Boton.
	 * @param actual the Boton we want to make assertions on.
	 */
	public BotonAssert(Boton actual) {
		super(actual, BotonAssert.class);
	}

	/**
	 * An entry point for BotonAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
	 * With a static import, one's can write directly : <code>assertThat(myBoton)</code> and get specific assertion with code completion.
	 * @param actual the Boton we want to make assertions on.
	 * @return a new </code>{@link BotonAssert}</code>
	 */
	public static BotonAssert assertThat(Boton actual) {
		return new BotonAssert(actual);
	}

}
