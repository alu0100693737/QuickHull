/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase pnlOpciones para representacion de los botones en la ventana
 */
package quickhull;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pnlOpciones extends JPanel {

	private JTextField cambiarNum;
	private static JLabel etiqueta;
	
	private botonContainer botones;

	public pnlOpciones() {
		setLayout(new GridLayout(1, 7, 10, 10));
		setBackground(Color.WHITE);
		cambiarNum = new JTextField();
		botones = new botonContainer();
		etiqueta  = new JLabel("NumPuntos") ;
		getEtiqueta().setBackground(Color.WHITE);
		getEtiqueta().setName("Etiqueta");
		getEtiqueta().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getEtiqueta().setPreferredSize(new Dimension(100, 30));
		add(getEtiqueta());
		add(getCambiarNum());
		
		for (JButton boton : getArrayButones().getArraybtn()) {
			add(boton);
		}
		
		getCambiarNum().addKeyListener(new controllerQuickhull.enviarCantidadPuntos());
		
		getArrayButones().getIniciar().addActionListener(new controllerQuickhull.nuevoQuickhull());/*getArrayButones().getEjecutar().addActionListener(new controllerQuickhull.ejecutar());
		*/getArrayButones().getEjecutar().addActionListener(new controllerQuickhull.ejecutar());
		/*getArrayButones().getPausa().addActionListener(new controllerQuickhull.pausar());
		getArrayButones().getPaso().addActionListener(new controllerQuickhull.pasoapaso());
		 */
		getArrayButones().getColor().addActionListener(new controllerQuickhull.cambioColor());
	}

	public botonContainer getArrayButones() {
		return botones;
	}
	
	public JTextField getCambiarNum() {
		return cambiarNum;
	}
	
	public JLabel getEtiqueta() {
		return etiqueta;
	}
}
