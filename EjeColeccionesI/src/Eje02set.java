/*
 * Realiza un programa en java que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.
 */

// VERSION CON TREESET ( Colección de valores ordenados no repetidos )
// Problema la tabla puede ser más pequeña por que no incluye valores repetidos.

import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Eje02set {

	public static void main(String[] args) {

		Random rd = new  Random();
		
		int tamaño = rd.nextInt(10, 41);
		
		TreeSet <Integer> ar = new TreeSet<Integer>();
		
		// Relleno
		for (int i = 0; i< tamaño; i++) {
			int num = rd.nextInt(0, 101);
			ar.add(num);
		}

		// Calcular max, min, media, total
		
		int suma = 0;
		// Ciclo for normal
		for (int valor: ar) {	
		  suma += valor;
		}	
		
		
		
		System.out.println(" Valor máximo = "+ Collections.max(ar));
		System.out.println(" Valor mínimo = "+ Collections.min(ar));
		System.out.println(" Suma total   = "+ suma);
		System.out.println(" Media  = "+ (float) suma / ar.size() );
		
		
		
		System.out.println(" LISTA DE VALORES");
		// Ciclo for each
		for (int valor:ar) {
			  System.out.print(valor+" ");
			}	
		
		

	}

}
