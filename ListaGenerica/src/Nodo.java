public class Nodo <T>
{
    T valor;
    Nodo siguiente;
    
    Nodo ( T dato, Nodo<T> sig ){
        this.valor     = dato;
        this.siguiente = sig;
    }
    
}