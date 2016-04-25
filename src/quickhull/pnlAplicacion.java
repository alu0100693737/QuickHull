package quickhull;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class pnlAplicacion extends JPanel {

	private static final int RANGORGB = 255; // blanco con (0,	0,	0)
	private static final int RADIO = 5;
	private static final int DOS = 2;
	
	//variables para dimension
	private double tamanoXActual;
	private double tamanoYActual;
	
	//Variable margen. Facilitar poligonos quickhull
	private final static int MARGEN = 40;
	
	
	
	
	int numPuntos;
	ArrayList<Punto> arrayPuntos;
	
	public pnlAplicacion(int numPuntos, int tamanox, int tamanoy) {
		
		setSize(new Dimension(tamanox, tamanoy));
		setPreferredSize(new Dimension(tamanox, tamanoy));
		System.out.println(getSize().getWidth() + " " + getSize().getHeight());
		setBackground(new Color(RANGORGB, RANGORGB, RANGORGB));
		setConjuntoPuntos(numPuntos);
		setArrayPuntos(new ArrayList<Punto>());
	}

	public void paintComponent(Graphics g) { 
		super.paintComponent(g); 
		if ((getTamanoXActual() == getSize().getWidth()) && (getTamanoYActual() == getSize().getHeight())) {
			for (Punto punto : getArrayPuntos()) {
				g.fillOval((int)punto.getPunto().getX(), (int)punto.getPunto().getY(), punto.getRadio(), punto.getRadio());
			}
		} else {
			getArrayPuntos().clear();
			generarPuntos();
			for (Punto punto : getArrayPuntos()) {
				g.fillOval((int)punto.getPunto().getX(), (int)punto.getPunto().getY(), punto.getRadio(), punto.getRadio());
			}
		}
	}
	
	public void generarPuntos() {
		for (int i = 0; i < getConjuntoPuntos(); i++) {
			getArrayPuntos().add(new Punto(new Point((int)(Math.random() * (getSize().getWidth() - MARGEN) + RADIO), (int)(Math.random() * (getSize().getHeight() - MARGEN) + RADIO)), RADIO * DOS));
			System.out.println("Valor x: " + getArrayPuntos().get(i).getPunto().getX());
			System.out.print(" Valor y: " + getArrayPuntos().get(i).getPunto().getY());
		}
	}
	
	public int getConjuntoPuntos() {
		return numPuntos;
	}
	
	public void setConjuntoPuntos(int npuntos) {
		numPuntos = npuntos;
	}
	
	ArrayList<Punto> getArrayPuntos() {
		return arrayPuntos;
	}
	
	void setArrayPuntos(ArrayList<Punto> nuevo) {
		arrayPuntos = nuevo;
	}
	
	double getTamanoXActual() {
		return tamanoXActual;
	}
	
	void setTamanoXActual(double valor) {
		tamanoXActual = valor;
	}
	
	double getTamanoYActual() {
		return tamanoYActual;
	}
	
	void setTamanoYActual(double valor) {
		tamanoYActual = valor;
	}
}
