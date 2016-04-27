/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase Principal, prueba de aplicacion quickhull
 */
package quickhull;

public class Principal {
	public static void main(String[] args) {
		try {
			controllerQuickhull prueba = new controllerQuickhull(args[0], args[1]);
		} catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("Debe introducir dos parametro para ejecutar este programa");
			System.out.println("Num de puntos, Velocidad en milisegundos");
		} 
		
	}
}
