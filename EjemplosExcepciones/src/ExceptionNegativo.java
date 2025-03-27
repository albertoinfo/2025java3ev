
/**
 * Definicion de excepciones 
 *  AL heredar de Exception debe ser manejada obligatoriamente dentro de try-catch
 * @author (Alberto Lopez) 
 * @version (16/04/2017)
 */
public class ExceptionNegativo extends Exception 
{
    public ExceptionNegativo(int nums){
        super(" El valor < 0 ->"+ nums + " no esta permitido");
    }
}
