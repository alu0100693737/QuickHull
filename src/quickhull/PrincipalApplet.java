package quickhull;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PrincipalApplet {
		public static void main(String[] args) {
		// Create a frame
	    JFrame frame = new JFrame("Quickhull Applet");

	    // Create an instance of the applet
	    controllerQuickhull applet = new controllerQuickhull(args[0]);
	    
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // Add the applet instance to the frame
	    frame.add(applet.getVentana(), BorderLayout.CENTER);
	    frame.pack();
	    
	    frame.setVisible(true);
			//controllerQuickhull prueba = new controllerQuickhull(args[0]);
		}
	}

