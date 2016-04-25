package quickhull;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class pnlAplicacion extends JPanel {

	private final int NUMPUNTOS = 30;
	private static final int RANGORGB = 255; // blanco con (0,	0,	0)
	private static final int RADIO = 5;
	private static final int DOS = 2;
	int numPuntos;
	ArrayList<Punto> arrayPuntos;
	
	public pnlAplicacion(int numPuntos) {
		setBackground(new Color(RANGORGB, RANGORGB, RANGORGB));
		setConjuntoPuntos(numPuntos);
		setArrayPuntos(new ArrayList<Punto>());
	}

	public void paint(Graphics g) { 
		super.paint(g); 
		for (Punto punto : getArrayPuntos()) {
			g.fillOval((int)punto.getPunto().getX(), (int)punto.getPunto().getY(), punto.getRadio(), punto.getRadio());
		}
	}
	
	public void generarPuntos() {
		for (int i = 0; i < getConjuntoPuntos(); i++) {
			getArrayPuntos().add(new Punto(new Point((int)(Math.random() * getSize().getWidth()), (int)(Math.random() * getSize().getHeight())), RADIO * DOS));
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
}
