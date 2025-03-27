
public class EstoySaturaoExcepción extends Exception  {
	
	public EstoySaturaoExcepción (int nclientes) {
		super( " Estoy Saturao hay "+ nclientes + " esperando ");
	}

}
