/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase jlbEspaciado que contiene una JLabel vacio con tamanyo determinado
 */
package quickhull;

import java.awt.Dimension;

import javax.swing.JLabel;

public final class jlbEspaciado extends JLabel {
	public jlbEspaciado(int x, int y) {
		setPreferredSize(new Dimension(x, y));
	}

}
