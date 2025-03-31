/* A partir igualmente de un ArrayList con 20 valores aleatorios entre (0, 100):
     a) Ordenar la lista, mostrar su contenido,  
     b) guardar  de la lista los valores no repetidos mediante una  colección auxiliar de tipo TreeSet y muestra el contenido de esta.
       
      Comprobar que los valores no se repiten y que están ordenados.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Ej04 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		ArrayList <Integer> ar = new ArrayList <Integer>();

		// Relleno el array list
		for (int i= 0; i< 20; i++) {
			int valor = rd.nextInt(0,101);
			ar.add(valor);
		}
		// a) Mostrar el contenido
        System.out.println(ar);
        
        ar.sort( (x,y) -> ( x - y ));
        System.out.println(ar);
        
        // Desordena
        Collections.shuffle(ar);
        System.out.println(ar);
        
        
        TreeSet<Integer> ts = new TreeSet<Integer>(ar);
        System.out.println(ts);
       
	}

}
