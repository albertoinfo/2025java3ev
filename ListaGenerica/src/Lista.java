public class Lista <T>
{
    Nodo<T> inicio;
    
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
    
    public void ponAlPrincipio ( T valor ){
        Nodo<T> nuevo = new Nodo<T>(valor,inicio);
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
    public void ponAlFinal (T valor ){
        // Si no hay ninguno.
        if ( inicio == null ) ponAlPrincipio(valor);
        else {
            Nodo paux = inicio;
            // Llego al ultimo elemento
            while (paux.siguiente != null){
                paux = paux.siguiente;
            }
            Nodo<T> nuevo = new Nodo<T>(valor,null);
            paux.siguiente = nuevo;
     
        }   
    }
    
    
    
    /**
     *  numElementos - Devuelve el numero de elemento de la lista
     */
    public int numelementos (){
        int cont = 0;
        Nodo<T> paux = inicio;
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
     Nodo <T> paux = inicio;
        while ( paux != null ){
            resu += "->"+paux.valor;
            paux = paux.siguiente;
        }
     resu +="->Null";
     return resu; 
    }

	public boolean esta(T valor) {
		boolean resu = false;
		Nodo <T> paux = inicio;
        while ( paux != null ){
        	if ( paux.valor.equals(valor) )  {
        		resu = true;
        		break;
        	}
            paux = paux.siguiente;
        }
		
		return resu;
	}    
    
    
}








