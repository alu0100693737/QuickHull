/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase modeloQuickhull para el calculo del problema
 */
package quickhull;

import java.awt.Point;
import java.util.ArrayList;

//recordar incluir redimension, clear
public class ModeloQuickhull {
	
	private ArrayList<Punto> puntosSolucion;
	private ArrayList<Punto> puntosEvaluacion;
	public ModeloQuickhull() {
		setPuntosEvaluacion(new ArrayList<Punto>());
		setPuntosSolucion(new ArrayList<Punto>());
	}
	
	public ArrayList<Punto> getPuntosSolucion() {
		return puntosSolucion;
	}
	
	public void setPuntosSolucion(ArrayList<Punto> nuevo) {
		puntosSolucion = nuevo;
	}
	
	public ArrayList<Punto> getPuntosEvaluacion() {
		return puntosEvaluacion;
	}
	
	public void setPuntosEvaluacion(ArrayList<Punto> nuevo) {
		puntosEvaluacion = nuevo;
	}
}
