/**
 *  Implemento una pila guarda valores enteros
 *  
 *  @author alberto
 *  @version 1.0
 */
public class PilaEnteros {

	 private int tabla[];
	 private int contador;
	/**
	 * Contructor de la clase
	 * @param tamaño - Tamaño del la pila
	 */
    public PilaEnteros (int tamaño){
    	tabla = new int[tamaño];
    	contador = 0;
    }
    
    /**
     * Introduce un entero en la lista. Devuelve verdadero si cabe o falso si la tabla está llena.
     * @param valor
     * @return
     */
    public boolean push(int valor) {
    	
    	return true;
    }
    
    public int  pop() {
    	return 0;
    }
    
    
    public int peek() {
    	return 0;
    }
    
    public boolean estaLleno() {
    	return true;
    }
    
    public boolean estaVacio() {
    	return true;
    }
    
    
	
}
