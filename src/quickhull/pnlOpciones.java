package quickhull;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pnlOpciones extends JPanel {

	private final int TAMTXTFIELDDENSIDAD = 10;
	private JTextField densidad;
	private botonContainer botones;
	private JTextField txtIntroducir;

	public pnlOpciones() {
		setLayout(new GridLayout(1, 4, 10, 10));
		setBackground(Color.BLACK);
		add(new jlbEspaciado(100, 110));

		botones = new botonContainer();
		for (JButton boton : getArrayButones().getArraybtn()) {
			add(boton);
		}
		/*getArrayButones().getIniciar().addActionListener(new controllerQuickhull.iniciar());
		getArrayButones().getEjecutar().addActionListener(new controllerQuickhull.ejecutar());
		getArrayButones().getPausa().addActionListener(new controllerQuickhull.pausar());
		getArrayButones().getPaso().addActionListener(new controllerQuickhull.pasoapaso());
		 */}

	public JTextField getDensidad() {
		return densidad;
	}

	public botonContainer getArrayButones() {
		return botones;
	}

	public JTextField gettxtIntroducir() {
		return txtIntroducir;
	}
}
