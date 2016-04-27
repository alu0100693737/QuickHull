package test.java.quickhull;

import static java.lang.String.format;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import quickhull.ModeloQuickhull;
import quickhull.pnlAplicacion;

import java.awt.Color;

/**
 * {@link pnlAplicacion} specific assertions - Generated by CustomAssertionGenerator.
 */
public class pnlAplicacionAssert extends AbstractAssert<pnlAplicacionAssert, pnlAplicacion> {

	/**
	 * Creates a new </code>{@link pnlAplicacionAssert}</code> to make assertions on actual pnlAplicacion.
	 * @param actual the pnlAplicacion we want to make assertions on.
	 */
	public pnlAplicacionAssert(pnlAplicacion actual) {
		super(actual, pnlAplicacionAssert.class);
	}

	/**
	 * An entry point for pnlAplicacionAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
	 * With a static import, one's can write directly : <code>assertThat(mypnlAplicacion)</code> and get specific assertion with code completion.
	 * @param actual the pnlAplicacion we want to make assertions on.
	 * @return a new </code>{@link pnlAplicacionAssert}</code>
	 */
	public static pnlAplicacionAssert assertThat(pnlAplicacion actual) {
		return new pnlAplicacionAssert(actual);
	}

	/**
	 * Verifies that the actual pnlAplicacion's arrayPuntos is equal to the given one.
	 * @param arrayPuntos the given arrayPuntos to compare the actual pnlAplicacion's arrayPuntos to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual pnlAplicacion's arrayPuntos is not equal to the given one.
	 */
	public pnlAplicacionAssert hasArrayPuntos(ModeloQuickhull arrayPuntos) {
		// check that actual pnlAplicacion we want to make assertions on is not null.
		isNotNull();

		// we overrides the default error message with a more explicit one
		String errorMessage = format("\nExpected <%s> arrayPuntos to be:\n  <%s>\n but was:\n  <%s>", actual, arrayPuntos,
				actual.getArrayPuntos());

		// check
		if (!actual.getArrayPuntos().equals(arrayPuntos)) {
			throw new AssertionError(errorMessage);
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual pnlAplicacion's colorActual is equal to the given one.
	 * @param colorActual the given colorActual to compare the actual pnlAplicacion's colorActual to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual pnlAplicacion's colorActual is not equal to the given one.
	 */
	public pnlAplicacionAssert hasColorActual(Color colorActual) {
		// check that actual pnlAplicacion we want to make assertions on is not null.
		isNotNull();

		// we overrides the default error message with a more explicit one
		String errorMessage = format("\nExpected <%s> colorActual to be:\n  <%s>\n but was:\n  <%s>", actual, colorActual,
				actual.getColorActual());

		// check
		if (!actual.getColorActual().equals(colorActual)) {
			throw new AssertionError(errorMessage);
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual pnlAplicacion is esEjecutar.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual pnlAplicacion is not esEjecutar.
	 */
	public pnlAplicacionAssert isEsEjecutar() {
		// check that actual pnlAplicacion we want to make assertions on is not null.
		isNotNull();

		// we overrides the default error message with a more explicit one
		String errorMessage = format("Expected actual pnlAplicacion to be esEjecutar but was not.", actual);

		// check
		if (!actual.getEsEjecutar())
			throw new AssertionError(errorMessage);

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual pnlAplicacion is not esEjecutar.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual pnlAplicacion is esEjecutar.
	 */
	public pnlAplicacionAssert isNotEsEjecutar() {
		// check that actual pnlAplicacion we want to make assertions on is not null.
		isNotNull();

		// we overrides the default error message with a more explicit one
		String errorMessage = format("Expected actual pnlAplicacion not to be esEjecutar but was.", actual);

		// check
		if (actual.getEsEjecutar())
			throw new AssertionError(errorMessage);

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual pnlAplicacion's numIteracionesbntPaso is equal to the given one.
	 * @param numIteracionesbntPaso the given numIteracionesbntPaso to compare the actual pnlAplicacion's numIteracionesbntPaso to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual pnlAplicacion's numIteracionesbntPaso is not equal to the given one.
	 */
	public pnlAplicacionAssert hasNumIteracionesbntPaso(int numIteracionesbntPaso) {
		// check that actual pnlAplicacion we want to make assertions on is not null.
		isNotNull();

		// we overrides the default error message with a more explicit one
		String errorMessage = format("\nExpected <%s> numIteracionesbntPaso to be:\n  <%s>\n but was:\n  <%s>", actual,
				numIteracionesbntPaso, actual.getNumIteracionesbntPaso());

		// check
		if (actual.getNumIteracionesbntPaso() != numIteracionesbntPaso) {
			throw new AssertionError(errorMessage);
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual pnlAplicacion's numPuntos is equal to the given one.
	 * @param numPuntos the given numPuntos to compare the actual pnlAplicacion's numPuntos to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual pnlAplicacion's numPuntos is not equal to the given one.
	 */
	public pnlAplicacionAssert hasNumPuntos(int numPuntos) {
		// check that actual pnlAplicacion we want to make assertions on is not null.
		isNotNull();

		// we overrides the default error message with a more explicit one
		String errorMessage = format("\nExpected <%s> numPuntos to be:\n  <%s>\n but was:\n  <%s>", actual, numPuntos,
				actual.getNumPuntos());

		// check
		if (actual.getNumPuntos() != numPuntos) {
			throw new AssertionError(errorMessage);
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual pnlAplicacion's tamanoXActual is equal to the given one.
	 * @param tamanoXActual the given tamanoXActual to compare the actual pnlAplicacion's tamanoXActual to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual pnlAplicacion's tamanoXActual is not equal to the given one.
	 */
	public pnlAplicacionAssert hasTamanoXActual(double tamanoXActual) {
		// check that actual pnlAplicacion we want to make assertions on is not null.
		isNotNull();

		// we overrides the default error message with a more explicit one
		String errorMessage = format("\nExpected <%s> tamanoXActual to be:\n  <%s>\n but was:\n  <%s>", actual,
				tamanoXActual, actual.getTamanoXActual());

		// check
		if (actual.getTamanoXActual() != tamanoXActual) {
			throw new AssertionError(errorMessage);
		}

		// return the current assertion for method chaining
		return this;
	}

	/**
	 * Verifies that the actual pnlAplicacion's tamanoYActual is equal to the given one.
	 * @param tamanoYActual the given tamanoYActual to compare the actual pnlAplicacion's tamanoYActual to.
	 * @return this assertion object.
	 * @throws AssertionError - if the actual pnlAplicacion's tamanoYActual is not equal to the given one.
	 */
	public pnlAplicacionAssert hasTamanoYActual(double tamanoYActual) {
		// check that actual pnlAplicacion we want to make assertions on is not null.
		isNotNull();

		// we overrides the default error message with a more explicit one
		String errorMessage = format("\nExpected <%s> tamanoYActual to be:\n  <%s>\n but was:\n  <%s>", actual,
				tamanoYActual, actual.getTamanoYActual());

		// check
		if (actual.getTamanoYActual() != tamanoYActual) {
			throw new AssertionError(errorMessage);
		}

		// return the current assertion for method chaining
		return this;
	}

}