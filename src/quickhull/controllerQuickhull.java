package quickhull;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.channels.SelectableChannel;
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
		public void actionPerformed(ActionEvent arg0) {
			//Puntos con color anterior
			getVentana().getpnlAplicacion().setColorActual(getVentana().getpnlOpciones().getArrayButones().getColor().getBackground());
			Random aux = new Random();
			Color colorNuevo = new Color(Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB);
			
			//getVentana().getpnlOpciones().gettxtIntroducir().setBackground(colorNuevo);
			getVentana().getpnlAplicacion().setColorActual(colorNuevo);
			
			//Color de los botones nuevo color
			getVentana().getpnlOpciones().getArrayButones().getColor().setBackground(colorNuevo);
			getVentana().getpnlOpciones().getArrayButones().getEjecutar().setBackground(colorNuevo);
			getVentana().getpnlOpciones().getArrayButones().getIniciar().setBackground(colorNuevo);
			getVentana().getpnlOpciones().getArrayButones().getPaso().setBackground(colorNuevo);
			getVentana().getpnlOpciones().getArrayButones().getPausa().setBackground(colorNuevo);
			getVentana().repaint();
			
		}	
	}
	public static class nuevoQuickhull implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			getVentana().getpnlAplicacion().generarPuntos();
			
		}
	}
	
	public static class ejecutar implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			getVentana().repaint();
		}
	}

public static class enviarCantidadPuntos implements KeyListener {
	@Override
	public void keyPressed(KeyEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println("tusop");
			getVentana().getpnlAplicacion().setNumPuntos(Integer.parseInt(getVentana().getpnlOpciones().getCambiarNum().getText()));
			getVentana().getpnlAplicacion().generarPuntos();
			getVentana().repaint();
		} else {
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("PEPE");
		// TODO Auto-generated method stub
	}
}
}
