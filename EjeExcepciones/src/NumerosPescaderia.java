
public class NumerosPescaderia {

	private int contClientes;
	private int limite;
	
	public NumerosPescaderia ( int limite) {
		this.limite = limite;
		contClientes = 0;
	}
	
	public void cogerNumero() throws EstoySaturaoExcepción{
		contClientes++;
		if ( contClientes >= limite ) {
			throw new EstoySaturaoExcepción(contClientes);
		}
		
	}
	
	public void dejarNumero(){
		contClientes--;
	}

	@Override
	public String toString() {
		return "NumerosPescaderia [contClientes=" + contClientes + ", limite=" + limite + "]";
	}
	
	
}
