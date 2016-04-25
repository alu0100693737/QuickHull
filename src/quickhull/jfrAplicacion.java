package quickhull;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class jfrAplicacion extends JFrame {
	private final int TAMANO_VENTANA_DEFECTO_WIDTH = 800;
	private final int TAMANO_VENTANA_DEFECTO_HEIGHT = 600; 			//tamanyo de la ventana por defecto
	private final int TAMANO_FIJO_HEIGHT_PNLOPCIONES = 80;
	
	private pnlAplicacion aplicacion;
	private pnlOpciones opciones;
	
	public jfrAplicacion(int numpuntos) {
		
		setLayout(new BorderLayout(5, 5));
		setTitle("Quickhull");
		
		setpnlAplicacion(new pnlAplicacion(numpuntos));
		setpnlOpciones(new pnlOpciones());
		
		setSize(TAMANO_VENTANA_DEFECTO_WIDTH, TAMANO_VENTANA_DEFECTO_HEIGHT);
		getpnlAplicacion().setPreferredSize(new Dimension((int)getSize().getWidth(), (int)getSize().getHeight() - TAMANO_FIJO_HEIGHT_PNLOPCIONES));
		getpnlAplicacion().setBorder(BorderFactory.createLineBorder(Color.BLACK));

		getpnlOpciones().setPreferredSize(new Dimension((int)getSize().getWidth(), TAMANO_FIJO_HEIGHT_PNLOPCIONES));
		getpnlOpciones().setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(getpnlAplicacion(), BorderLayout.CENTER);
		add(getpnlOpciones(), BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	public pnlAplicacion getpnlAplicacion() {
		return aplicacion;
	}
	
	public void setpnlAplicacion(pnlAplicacion nuevo) {
		aplicacion = nuevo;
	}
	
	public pnlOpciones getpnlOpciones() {
		return opciones;
	}
	
	public void setpnlOpciones(pnlOpciones nuevo) {
		opciones = nuevo;
	}
}
