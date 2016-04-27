package quickhull;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.channels.SelectableChannel;
import java.security.GeneralSecurityException;
import java.util.Random;
import javax.swing.Timer;

public class controllerQuickhull {

	private static final int RANGORGB = 255;
	private static final int FILTRORGB = 50;						//Utilizado para evitar tonos oscuros
	private static Timer tempo;
	private static jfrAplicacion ventana;
	private static Color colorNuevo;
	
	public controllerQuickhull(String numpuntos, String velocidad) {
		ventana = new jfrAplicacion(Integer.parseInt(numpuntos));
		tempo = new Timer(Integer.parseInt(velocidad), new pasoapaso());
	}

	public static jfrAplicacion getVentana() {
		return ventana;
	}

	public void setVentana(jfrAplicacion nueva) {
		ventana = nueva;
	}

	public static Timer getTempo() {
		return tempo;
	}

	public static Color getColorNuevo() {
		return colorNuevo;
	}

	public static void setColorNuevo(Color nuevo) {
		colorNuevo = nuevo;
	}

	public static class cambioColor implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			//Puntos con color anterior
			getVentana().getpnlAplicacion().setColorActual(getVentana().getpnlOpciones().getArrayButones().getColor().getBackground());
			Random aux = new Random();
			setColorNuevo(new Color(Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB, Math.abs(aux.nextInt() % (RANGORGB - FILTRORGB)) + FILTRORGB));

			//getVentana().getpnlOpciones().gettxtIntroducir().setBackground(colorNuevo);
			getVentana().getpnlAplicacion().setColorActual(colorNuevo);

			//Color de los botones nuevo color
			getVentana().getpnlOpciones().getArrayButones().getColor().setBackground(colorNuevo);
			getVentana().getpnlOpciones().getArrayButones().getIniciar().setBackground(colorNuevo);

			getVentana().getpnlOpciones().getArrayButones().getEjecutar().setBackground(colorNuevo);
			getVentana().getpnlOpciones().getArrayButones().getPaso().setBackground(colorNuevo);
			getVentana().getpnlOpciones().getArrayButones().getPausa().setBackground(colorNuevo);

			getVentana().repaint();
		}	
	}
	public static class nuevoQuickhull implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			getVentana().getpnlAplicacion().generarPuntos();
			getVentana().getpnlOpciones().getArrayButones().getEjecutar().setBackground(getColorNuevo());
			getVentana().getpnlOpciones().getArrayButones().getPaso().setBackground(getColorNuevo());
			getVentana().getpnlOpciones().getArrayButones().getPausa().setBackground(getColorNuevo());
			getVentana().getpnlOpciones().getArrayButones().getIniciar().setText("Reset");
			getVentana().getpnlAplicacion().getArrayPuntos().getPuntosSolucion().clear();
			getVentana().repaint();
		}
	}

	public static class ejecutar implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (getTempo().isRunning()) {
				getTempo().stop();
			}
			getVentana().getpnlAplicacion().getArrayPuntos().solucionar();
			getVentana().getpnlAplicacion().setEsEjecutar(true);
			getVentana().getpnlOpciones().getArrayButones().getEjecutar().setBackground(Color.WHITE);
			getVentana().getpnlOpciones().getArrayButones().getPaso().setBackground(Color.WHITE);
			getVentana().getpnlOpciones().getArrayButones().getPausa().setBackground(Color.WHITE);
			getVentana().repaint();
		}
	}

	public static class pausa implements ActionListener  {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == getVentana().getpnlOpciones().getArrayButones().getPausa()) {
				if (getTempo().isRunning()) {
					getTempo().stop();
					getVentana().getpnlOpciones().getArrayButones().getPausa().setText("Pausa");
				}
				else {
					getTempo().start();
					getVentana().getpnlOpciones().getArrayButones().getPausa().setText("Reanudar");
				}
			}
		}
	}

	public static class pasoapaso implements ActionListener {
		//pinta elemento a elemento del camino
		@Override
		public void actionPerformed(ActionEvent e) {
			if (getTempo().isRunning()) {
				if(getVentana().getpnlAplicacion().getNumIteracionesbntPaso() <= getVentana().getpnlAplicacion().getArrayPuntos().getPuntosSolucion().size()) {
					getVentana().getpnlAplicacion().setEsEjecutar(false);
					getVentana().repaint();
				} else {
					getVentana().getpnlOpciones().getArrayButones().getEjecutar().setBackground(Color.WHITE);
					getVentana().getpnlOpciones().getArrayButones().getPaso().setBackground(Color.WHITE);
					getVentana().getpnlOpciones().getArrayButones().getPausa().setBackground(Color.WHITE);
					getVentana().getpnlAplicacion().setNumIteracionesbntPaso(0);
					getTempo().stop();
				}
			} else {
				getVentana().getpnlAplicacion().getArrayPuntos().solucionar();
				getTempo().start();
			}
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
