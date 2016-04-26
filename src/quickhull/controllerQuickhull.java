package quickhull;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class controllerQuickhull {

	private static final int RANGORGB = 255;
	private static final int FILTRORGB = 50;						//Utilizado para evitar tonos oscuros
	
	private static jfrAplicacion ventana;
	
	public controllerQuickhull(String arg) {
		ventana = new jfrAplicacion(Integer.parseInt(arg));
	}
	
	public static jfrAplicacion getVentana() {
		return ventana;
	}
	
	public void setVentana(jfrAplicacion nueva) {
		ventana = nueva;
	}

public static class cambioColor implements ActionListener {
		//crea un color aleatorio
		public void actionPerformed(ActionEvent arg0) {
			Random aux = new Random();
			Color colorNuevo = new Color(Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB);
			System.out.println("HOLA");
			System.out.println(getVentana().getpnlAplicacion().getConjuntoPuntos());
			//getVentana().getpnlOpciones().gettxtIntroducir().setBackground(colorNuevo);
			//getVentana().getpnlOpciones().getArrayButones().getColor().setBackground(colorNuevo);
		}	
	}

public static class enviarCantidadPuntos implements KeyListener {
	//(SEPARACION_PIXELES = (getSize().getWidth - MARGEN_CUADRICULA * 2) / densidad;, what)
	@Override
	public void keyPressed(KeyEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("HOLA");
			getVentana().getpnlAplicacion().generarPuntos();
			getVentana().getpnlAplicacion().repaint();
		} else {}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
}
}
