
public class TestPescaderia {

	public static void main(String[] args) {

		NumerosPescaderia laGallega = new NumerosPescaderia(5);

	
     for ( int i = 0; i < 20; i++) {
		try {
			laGallega.cogerNumero();
			laGallega.cogerNumero();
			laGallega.cogerNumero();
			laGallega.cogerNumero();
			laGallega.cogerNumero();
			laGallega.dejarNumero();
			laGallega.dejarNumero();
			
			
		} catch (EstoySaturaoExcepción e) {
			System.out.println(e.getMessage());
		}
		
     }
		System.out.println(laGallega);

	}

}
