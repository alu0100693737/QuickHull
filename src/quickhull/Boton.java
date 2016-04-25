/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase Boton para la representacion de un boton con formato
 */

package quickhull;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Boton extends JButton {
	public Boton(String text) {
		setText(text);
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		Border line = new LineBorder(Color.BLACK);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		setBorder(compound);
	}
}
