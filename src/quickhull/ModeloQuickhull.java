/** Ivan Garcia Campos   alu0100693737@ull.edu.es
 * 25/04/16
 * Programacion de aplicaciones interactivas
 * 1.0v
 * Clase modeloQuickhull para el calculo del problema
 */
package quickhull;
import java.util.ArrayList;

//recordar incluir redimension, clear
public class ModeloQuickhull {
	private ArrayList<Punto> puntosSolucion;
	private ArrayList<Punto> puntosEvaluacion;
	public ModeloQuickhull() {
		setPuntosEvaluacion(new ArrayList<Punto>());
		setPuntosSolucion(new ArrayList<Punto>());
	}
	
	public int distance(Punto A, Punto B, Punto C) {
	    int ABx = (int)(B.getPunto().getX() - A.getPunto().getX());
	    int ABy = (int)(B.getPunto().getY() - A.getPunto().getY());
	    int num = (int)(ABx * (A.getPunto().getY() - C.getPunto().getY()) - ABy * (A.getPunto().getX() - C.getPunto().getX()));
	    if (num < 0)
	        num = -num;
	    return num;
	}

	public void hullSet(Punto A, Punto B, ArrayList<Punto> set,
	        ArrayList<Punto> hull) {
	    int insertPosition = hull.indexOf(B);
	    if (set.size() == 0)
	        return;
	    if (set.size() == 1) {
	        Punto p = set.get(0);
	        set.remove(p);
	        hull.add(insertPosition, p);
	        return;
	    }
	    int dist = Integer.MIN_VALUE;
	    int furthestPoint = -1;
	    for (int i = 0; i < set.size(); i++) {
	        Punto p = set.get(i);
	        int distance = distance(A, B, p);
	        if (distance > dist) {
	            dist = distance;
	            furthestPoint = i;
	        }
	    }
	    Punto P = set.get(furthestPoint);
	    set.remove(furthestPoint);
	    hull.add(insertPosition, P);

	    // Determine who's to the left of AP
	    ArrayList<Punto> leftSetAP = new ArrayList<Punto>();
	    for (int i = 0; i < set.size(); i++) {
	        Punto M = set.get(i);
	        if (pointLocation(A, P, M) == 1) {
	            leftSetAP.add(M);
	        }
	    }

	    // Determine who's to the left of PB
	    ArrayList<Punto> leftSetPB = new ArrayList<Punto>();
	    for (int i = 0; i < set.size(); i++) {
	        Punto M = set.get(i);
	        if (pointLocation(P, B, M) == 1)
	        {
	            leftSetPB.add(M);
	        }
	    }
	    hullSet(A, P, leftSetAP, hull);
	    hullSet(P, B, leftSetPB, hull);
	}

	public int pointLocation(Punto A, Punto B, Punto P) {
	    int cp1 = (int)((B.getPunto().getX() - A.getPunto().getX()) * (P.getPunto().getY() - A.getPunto().getY()) - (B.getPunto().getY() - A.getPunto().getY()) * (P.getPunto().getX() - A.getPunto().getX()));
	    if (cp1 > 0)
	        return 1;
	    else if (cp1 == 0)
	        return 0;
	    else
	        return -1;
	}
	
	public ArrayList<Punto> solucionar() {
		//limpiamos los datos anteriores
		getPuntosSolucion().clear();
    if (getPuntosEvaluacion().size() < 3)
        return (ArrayList) getPuntosEvaluacion().clone();

    int minPoint = -1, maxPoint = -1;
    int minX = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    for (int i = 0; i < getPuntosEvaluacion().size(); i++) {
        if (getPuntosEvaluacion().get(i).getPunto().getX() < minX) {
            minX = (int)getPuntosEvaluacion().get(i).getPunto().getX();
            minPoint = i;
        }
        if (getPuntosEvaluacion().get(i).getPunto().getX() > maxX) {
            maxX = (int)getPuntosEvaluacion().get(i).getPunto().getX();
            maxPoint = i;
        }
    }
    Punto A = getPuntosEvaluacion().get(minPoint);
    Punto B = getPuntosEvaluacion().get(maxPoint);
    getPuntosSolucion().add(A);
    getPuntosSolucion().add(B);
    //getPuntosEvaluacion().remove(A);
    //getPuntosEvaluacion().remove(B);

    ArrayList<Punto> leftSet = new ArrayList<Punto>();
    ArrayList<Punto> rightSet = new ArrayList<Punto>();

    for (int i = 0; i < getPuntosEvaluacion().size(); i++)
    {
        Punto p = getPuntosEvaluacion().get(i);
        if (pointLocation(A, B, p) == -1)
            leftSet.add(p);
        else if (pointLocation(A, B, p) == 1)
            rightSet.add(p);
    }
    hullSet(A, B, rightSet, getPuntosSolucion());
    hullSet(B, A, leftSet, getPuntosSolucion());
    for (int i = 0; i < getPuntosSolucion().size(); i++) {
    	System.err.println(getPuntosSolucion().get(i).getPunto().getX() + " " + getPuntosSolucion().get(i).getPunto().getY());
			
		}
    System.out.println("ESEEE " + getPuntosSolucion());
    return getPuntosSolucion();
}
	
	public ArrayList<Punto> getPuntosSolucion() {
		return puntosSolucion;
	}
	
	public void setPuntosSolucion(ArrayList<Punto> nuevo) {
		puntosSolucion = nuevo;
	}
	
	public ArrayList<Punto> getPuntosEvaluacion() {
		return puntosEvaluacion;
	}
	
	public void setPuntosEvaluacion(ArrayList<Punto> nuevo) {
		puntosEvaluacion = nuevo;
	}
}
