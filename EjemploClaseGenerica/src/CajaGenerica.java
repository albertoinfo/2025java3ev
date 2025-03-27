
/**
 * Write a description of class CajaGenerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CajaGenerica <T>
{
   
    private T dato;

    public T quita() { return dato;};
    public void pon ( T dato){ this.dato =  dato;};
}
