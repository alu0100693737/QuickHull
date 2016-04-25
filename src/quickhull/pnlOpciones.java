/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase pnlOpciones para representacion de los botones en la ventana
 */
package quickhull;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class pnlOpciones extends JPanel {

	private botonContainer botones;

	public pnlOpciones() {
		setLayout(new GridLayout(1, 5, 10, 10));
		setBackground(Color.BLACK);
		add(new jlbEspaciado(30, 80));

		botones = new botonContainer();
		for (JButton boton : getArrayButones().getArraybtn()) {
			add(boton);
		}
		
		add(new jlbEspaciado(30, 80));
		/*getArrayButones().getIniciar().addActionListener(new controllerQuickhull.iniciar());
		getArrayButones().getEjecutar().addActionListener(new controllerQuickhull.ejecutar());
		getArrayButones().getPausa().addActionListener(new controllerQuickhull.pausar());
		getArrayButones().getPaso().addActionListener(new controllerQuickhull.pasoapaso());
		 */}

	public botonContainer getArrayButones() {
		return botones;
	}
}
