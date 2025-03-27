/**
 *      TestColecciones
 *      
 *      Muestras los métodos más importantes de la colecciones con dos implementaciones
 *      List -> ArrayList ( Lista implementada por un array )
 *      Set  -> TreeSet   ( Conjunto ordenado )
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestColecciones {

	public static void main(String[] args) {
		/*
		 * Creo dos colecciones con distintas implementaciones pero que ámbas tienen 
		 * interfaz común Collection, es decir tiene los mismos métodos
		 */
		
		Collection<String> lista     = new ArrayList<String>();
		Collection<String> conjunto  = new HashSet<String>();

		/*********  LIST ***************************/
		
		System.out.println(" OPERACIONES SOBRE UNA LISTA");
		
	
		lista.add("Pepe");
		lista.add("Luis");
		lista.add("Ana");
		lista.add("Luis");
		
		//System.out.println(lista.get(1)); 
		
		
		System.out.println(" Nº de elementos ="+lista.size());
		
		
		// Recorrido de una coleccion foreach
		System.out.println(" Contenido de la lista: 1º");
		for ( String cadena: lista) {
			System.out.println(">"+cadena);
		}
		
		/********************** SET ***********************************/
		
	
		System.out.println(" \n OPERACIONES SOBRE UN CONJUNTO");
		
		conjunto.add("Pepe");
		conjunto.add("Luis");
		conjunto.add("Ana");
		conjunto.add("Pedro");
		conjunto.add("Pedro");
		
		System.out.println(" Nº de elementos ="+conjunto.size());
		
		// Recorrido de una coleccion foreach
		System.out.println(" Contenido del conjunto: 1º");
		for ( String cadena: conjunto) {
			System.out.println(">"+cadena);
		}
		
	
       
		
		//lista.addAll(conjunto);   
		
		for (String cadena: conjunto) {
			if ( ! lista.contains(cadena)) {
				lista.add(cadena);
			}
		}
		
		
		// Añado todos los elementos del conjunto a la lista (HAY REPES)
		System.out.println(" Nº de elementos ="+lista.size());
		
		System.out.println(" Contenido de la lista: 2º");
		for ( String cadena: lista) {
			System.out.println(">"+cadena);
		}
		
		
		
		
		/*
		
		conjunto.addAll(lista); // Añado todos los elementos de la lista al conjunto (NO HAY REPES)
		System.out.println(" Nº de elementos ="+conjunto.size());
		
		System.out.println(" Contenido de la Conjunto: 3º");
		for ( String cadena: conjunto) {
			System.out.println(">"+cadena);
		}
		
	  */
	  
		
	}

}
