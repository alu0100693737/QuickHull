package quickhull;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pnlOpciones extends JPanel {

	private botonContainer botones;

	public pnlOpciones() {
		setLayout(new GridLayout(1, 4, 10, 10));
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
