/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase para la representacion de un punto
 */

package quickhull;

import java.awt.Graphics;
import java.awt.Point;

public class Punto {
	private final int DOS = 2;
	
	private Point punto;
	private int radio;
	
	public Punto(Point punt, int radi) {
		setPunto(punt);
		radio = radi;
	}

	public Point getPunto() {
		return punto;
	}
	
	public void drawPunto(Graphics g) {
		g.fillOval((int)getPunto().getX(), (int)getPunto().getY(), getRadio() * DOS, getRadio() * DOS);
	}
	
	public void setPunto(Point valor) {
		punto = valor;
	}
	
	public int getRadio() {
		return radio;
	}
	
	public void setRadio(int valor) {
		radio = valor;
	}
}

