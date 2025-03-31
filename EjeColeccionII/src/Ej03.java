/*
 *     Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego realice las siguientes operaciones: 
       a) Mostrar el contenido
       b) Calcular la suma
       c)  Borrar aquellos números que serán pares y volver a mostrar el contenido
       d) Remplazar los números divisibles por 3 con el valor 0 y volver a mostrar el contenido
       d) Si aparece un valor divisible entre cinco, insertar en la posición anterior el valor 555 y volver a mostrar el contenido.
       
        El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive. 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Ej03 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int tamaño = rd.nextInt(10,21);
		ArrayList <Integer> ar = new ArrayList <Integer>();

		// Relleno el array list
		for (int i= 0; i< tamaño; i++) {
			int valor = rd.nextInt(0,101);
			ar.add(valor);
		}
		// a) Mostrar el contenido
        System.out.println(ar);
		
        // A -Calcular la suma
        // 1º
        int suma = 0;
        for ( int valor:ar) {
			suma += valor;
		}
		System.out.println(" Suma = "+ suma);
		
		// 2º
		suma = 0;
		for ( int i= 0; i< ar.size(); i++) {
			suma += ar.get(i);
		}
		System.out.println(" Suma = "+ suma);
		
		//3º
		Iterator<Integer> it = ar.iterator();
		suma = 0;
		while (it.hasNext()) {
			Integer valor = it.next();
		    suma += valor;
		}
		System.out.println(" Suma = "+ suma);
		
		// c)  Borrar aquellos números que serán pares y volver a mostrar el contenido
		
		//ar.removeIf( x -> (x % 2 == 0));
		Iterator<Integer> itb = ar.iterator();
		suma = 0;
		while (itb.hasNext()) {
			Integer valor = itb.next();
		    if ( valor %2  == 0) {
		    	itb.remove();
		    }
		}
		
		System.out.println(ar);
		
		// d) Remplazar los números divisibles por 3 con el valor 0 y volver a mostrar el contenido
	    for (int i= 0; i< ar.size(); i++) {
	    	int valor = ar.get(i);
	    	if ( valor % 3 == 0) {
	    		ar.set(i, 0);
	    	}
	    }
	    System.out.println(ar);
		
	    for (int i= 0; i< ar.size(); i++) {
	    	int valor = ar.get(i);
	    	if ( valor % 5 == 0 && valor != 0) {
	    		ar.add(i,555);
	    		i++; // Me salto el valor divisible
	    	}
	    }
	    System.out.println(ar);
	    
	    
	    
	    
	}

}
