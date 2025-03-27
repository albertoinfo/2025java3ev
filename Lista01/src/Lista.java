public class Lista
{
    Nodo inicio;
    
    /**
     * Crea una lista sin elementos
     */
    public Lista()
    {
      inicio = null;
    }

    /**
     *  Pon un elemento al principio de la lista
     */
    
    public void ponAlPrincipio ( int valor ){
        Nodo nuevo = new Nodo(valor,inicio);
        inicio = nuevo;
    }
    /**
     *  Borrar el primer elemento de la lista
     *  Devuelve true si lo puede borrar o false si no
     *  hay ningun elemento.
     */
    public boolean borrarPrimero(){
       if (  inicio == null ) return false;
       inicio = inicio.siguiente;
       return true;
    }
 
    /** 
     * 
     */
    public void ponAlFinal (int valor ){
        // Si no hay ninguno.
        if ( inicio == null ) ponAlPrincipio(valor);
        else {
            Nodo paux = inicio;
            // Llego al ultimo elemento
            while (paux.siguiente != null){
                paux = paux.siguiente;
            }
            Nodo nuevo = new Nodo(valor,null);
            paux.siguiente = nuevo;
     
        }   
    }
    
    
    
    /**
     *  numElementos - Devuelve el numero de elemento de la lista
     */
    public int numelementos (){
        int cont = 0;
        Nodo paux = inicio;
        while ( paux != null ){
            cont++;
            paux = paux.siguiente;
        }
        return cont;
    }    
    
    /**
     *  toString - Devuelve un string con el contenido de la lista
     */
    
    public String toString(){
     String resu="";
     Nodo paux = inicio;
        while ( paux != null ){
            resu += "->"+paux.valor;
            paux = paux.siguiente;
        }
     resu +="->Null";
     return resu; 
    }

	public boolean esta(int valor) {
		boolean resu = false;
		Nodo paux = inicio;
        while ( paux != null ){
        	if ( paux.valor == valor) {
        		resu = true;
        		break;
        	}
            paux = paux.siguiente;
        }
		
		return resu;
	}    
    
    
}








