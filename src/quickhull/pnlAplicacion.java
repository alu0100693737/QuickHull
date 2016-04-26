/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase pnlAplicacion para la representacion de los puntos y el 
 * polyline con la solucion
 */

package quickhull;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;

import javax.swing.JPanel;

public class pnlAplicacion extends JPanel {

	private static final int RANGORGB = 255; // blanco con (0,	0,	0)
	private static final int RADIO = 5;
	private static final int DOS = 2;
	
	private Color colorActual;
	
	//variables para dimension
	private double tamanoXActual;
	private double tamanoYActual;
	
	//Variable margen. Facilitar poligonos quickhull
	private final static int MARGEN = 50;
	int numPuntos;
	ModeloQuickhull arrayPuntos;
	
	public pnlAplicacion(int numPuntos, int tamanox, int tamanoy) {
		
		setSize(new Dimension(tamanox, tamanoy));
		setPreferredSize(new Dimension(tamanox, tamanoy));
		System.out.println(getSize().getWidth() + " " + getSize().getHeight());
		setBackground(new Color(RANGORGB, RANGORGB, RANGORGB));
		setConjuntoPuntos(numPuntos);
		setArrayPuntos(new ModeloQuickhull());
		//color por defecto
		setColorActual(Color.RED);
	}

	public void paint(Graphics g) {
		//if ((getTamanoXActual() == getSize().getWidth()) && (getTamanoYActual() == getSize().getHeight())) {
			for (Punto punto : getArrayPuntos().getPuntosEvaluacion()) {
				g.fillOval((int)punto.getPunto().getX(), (int)punto.getPunto().getY(), punto.getRadio(), punto.getRadio());
			}
			//getArrayPuntos().solucionar();
			Polygon poligono1 = new Polygon();
			g.setColor(getColorActual());
			System.out.println("Cantidad solu" + getArrayPuntos().getPuntosSolucion().size());
			for (int i = 0; i < getArrayPuntos().getPuntosSolucion().size(); i++) {
				//g.fillOval((int)getArrayPuntos().getPuntosSolucion().get(i).getPunto().getX(), (int)getArrayPuntos().getPuntosSolucion().get(i).getPunto().getX(), 20, 20);
				poligono1.addPoint((int)getArrayPuntos().getPuntosSolucion().get(i).getPunto().getX() + getArrayPuntos().getPuntosSolucion().get(i).getRadio()/2, (int)getArrayPuntos().getPuntosSolucion().get(i).getPunto().getY() +  getArrayPuntos().getPuntosSolucion().get(i).getRadio()/2);
			}
			Graphics2D g2 = (Graphics2D) g;
      g2.setStroke(new BasicStroke(2));
      //g2.draw(new Line2D.Float(30, 20, 80, 90));
		g2.drawPolygon(poligono1);//(poligono1.xpoints, poligono1.ypoints, poligono1.npoints);

			System.out.println("HOLA" + getArrayPuntos().getPuntosSolucion().size());
			//g.drawPolygon(poligono1);//(poligono1.xpoints, poligono1.ypoints, poligono1.npoints);
			
		//} else {
		/*	getArrayPuntos().getPuntosEvaluacion().clear();
			generarPuntos();
			for (Punto punto : getArrayPuntos().getPuntosEvaluacion()) {
				g.fillOval((int)punto.getPunto().getX(), (int)punto.getPunto().getY(), punto.getRadio(), punto.getRadio());
			}
		}*/
	}
		
	public void paintComponent(Graphics g) { 
		super.paintComponent(g); 
		if ((getTamanoXActual() == getSize().getWidth()) && (getTamanoYActual() == getSize().getHeight())) {
			for (Punto punto : getArrayPuntos().getPuntosEvaluacion()) {
				g.fillOval((int)punto.getPunto().getX(), (int)punto.getPunto().getY(), punto.getRadio(), punto.getRadio());
			}
			//getArrayPuntos().solucionar();
			
			System.out.println("HOLA" + getArrayPuntos().getPuntosSolucion().size());
			//g.drawPolygon(poligono1);//(poligono1.xpoints, poligono1.ypoints, poligono1.npoints);
			
		} else {
			getArrayPuntos().getPuntosEvaluacion().clear();
			generarPuntos();
			for (Punto punto : getArrayPuntos().getPuntosEvaluacion()) {
				g.fillOval((int)punto.getPunto().getX(), (int)punto.getPunto().getY(), punto.getRadio(), punto.getRadio());
			}
		}
	}
	
	public void generarPuntos() {
		for (int i = 0; i < getConjuntoPuntos(); i++) {
			getArrayPuntos().getPuntosEvaluacion().add(new Punto(new Point((int)(Math.random() * (getSize().getWidth() - MARGEN) + RADIO), (int)(Math.random() * (getSize().getHeight() - MARGEN) + RADIO)), RADIO * DOS));
		}
		getArrayPuntos().solucionar();
	}
	
	public int getConjuntoPuntos() {
		return numPuntos;
	}
	
	public void setConjuntoPuntos(int npuntos) {
		numPuntos = npuntos;
	}
	
	public ModeloQuickhull getArrayPuntos() {
		return arrayPuntos;
	}
	
	public void setArrayPuntos(ModeloQuickhull nuevo) {
		arrayPuntos = nuevo;
	}
	
	public double getTamanoXActual() {
		return tamanoXActual;
	}
	
	public void setTamanoXActual(double valor) {
		tamanoXActual = valor;
	}
	
	public double getTamanoYActual() {
		return tamanoYActual;
	}
	
	public void setTamanoYActual(double valor) {
		tamanoYActual = valor;
	}
	
	public Color getColorActual() {
		return colorActual;
	}
	
	public void setColorActual(Color nuevo) {
		colorActual = nuevo;
	}
}
