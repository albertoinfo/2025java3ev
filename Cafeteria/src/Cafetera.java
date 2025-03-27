
/**
 * Clase Cafetera
 * Simula una jara de cafe donde se puede añadir y quitar cafe
 * @author alberto
 * @version 0.0
 */
public class Cafetera implements Comparable <Cafetera>{

	private int capacidadMáxima;
	private int capacidadActual;
	
	/**
	 * Constructor de inicialización con los dos parámetros: con la capacidad máxima y la cantidad actual. 
	 * Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo
	 * @param valor  - capacidad máxima 
	 * @param cantidad - capacidad actual
	 */
	
	Cafetera( int valor, int cantidad){
		capacidadMáxima = valor;
		capacidadActual = (cantidad > valor)? cantidad: valor;
	}
	/**
	 *  Constructor común (sin parámetros): establece la capacidad máxima en 1000 (c.c.) 
	 *  y la actual en cero (cafetera vacía)
	 */
	Cafetera (){
		this(1000,0);
	}
	/**
	 * Constructor de inicialización que sólo recibe la capacidad máxima, poniendo la actual a cero
	 * @param valor - capacidad máxima
	 */
	
	Cafetera( int valor){
		this(valor,0);
	}
	
	/**
	 * Obtiene la capacidad máxima de la cafetera
	 * @return capacidad máxima
	 */
	public int getCapacidadMáxima() {
		return capacidadMáxima;
	}
	
	/**
	 * Obtiene la capacidad actual de la cafetera
	 * @return capacidad actual
	 */
	public int getCapacidadActual() {
		return capacidadActual;
	}

	/**
	 * Hace que la cantidad actual sea igual a la capacidad Máxima.
	 */
	public void llenarCafetera(){
		capacidadActual = capacidadMáxima;
	}

	/**
	 * Vacia la caferera, fija su capadad actual a 0
	 */
	
	public void vaciarCafetera(){
		capacidadActual = 0;
	}
	
	/**
	 * Simula la acción de servir una taza con la capacidad indicada.
	 *  Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede
	 * @param vtaza - cantidad de cafe a servir
	 */
	public void servirTaza ( int vtaza){
		capacidadActual -= vtaza;
		if ( capacidadActual <0) capacidadActual = 0;
	}
	
	/**
	 * añade a la cafetera la cantidad de café indicada. 
	 * Solo se puede llenar hasta la capacidad Máxima.
	 * @param vcafe - cantidad de café anadido a la cafetera
	 */
	public void agregarCafe ( int vcafe){
		capacidadActual += vcafe;
		if ( capacidadActual > capacidadMáxima) capacidadActual = capacidadMáxima;
	}

	
   
     /**
      * Método para ordenar cafeteras por capacidad Actual
      * @param o -  objeto caferera con el que comparar 
      * @return diferencia entre la capacidad actual de cada una de la cafeteras
      */
     public int compareTo(Cafetera o) {	
		return this.capacidadActual - o.capacidadActual;
	}
	
	
}