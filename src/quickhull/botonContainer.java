/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase para almacenar los botones creados para esta aplicacion
 */

package quickhull;

import java.awt.Font;
import java.util.ArrayList;

public class botonContainer {

	private ArrayList<Boton> botones;
	private Boton iniciar;
	private Boton ejecutar;
	private Boton pausa;
	private Boton paso;
	private Boton color;
	
	public botonContainer() {
		botones = new ArrayList<Boton>();
		iniciar = new Boton("Iniciar");
		ejecutar = new Boton("Ejecutar");
		pausa = new Boton("Pausa");
		paso = new Boton("Paso");
		color = new Boton("Color");

		getIniciar().setName("Iniciar");
		getEjecutar().setName("Ejecutar");
		getPausa().setName("Pausa");
		getPaso().setName("Paso");
		getColor().setName("Color");
		
		getIniciar().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getEjecutar().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getPausa().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getPaso().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		getColor().setFont(new Font("Comic Sans MS", Font.BOLD, 18));

		getArraybtn().add(getIniciar());
		getArraybtn().add(getEjecutar());
		getArraybtn().add(getPaso());
		getArraybtn().add(getPausa());
		getArraybtn().add(getColor());
	}
	
	public Boton getIniciar() {
		return iniciar;
	}
	
	public Boton getEjecutar() {
		return ejecutar;
	}
	
	public Boton getPausa() {
		return pausa;
	}
	
	public Boton getPaso() {
		return paso;
	}
	
	public Boton getColor() {
		return color;
	}

	public ArrayList<Boton> getArraybtn() {
		return botones;
	}
}
