
public class PilaG <T>{

	 private T tabla[];
	 private int contador;
	/**
	 * Contructor de la clase
	 * @param tamaño - Tamaño del la pila
	 */
    public PilaG (int tamaño){
    	tabla = (T [] ) new Object [tamaño];
        contador = 0;  	
    }
    
    /**
     * Introduce un entero en la lista. Devuelve verdadero si cabe o falso si la tabla está llena.
     * @param valor
     * @return
     */
    public boolean push(T valor) {
    	
    	return true;
    }
    
    public T  pop() {
    	return null;
    }
    
    
    public  T peek() {
    	return null;
    }
    
    public boolean estaLleno() {
    	return true;
    }
    
    public boolean estaVacio() {
    	return true;
    }

	
}
