import java.util.Scanner;

public class PruebaNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println(" Introduce un valor ");
		
		numero = sc.nextInt();
	
	   try {
		   haceralgo(numero);
	   }
	   catch ( ExceptionNegativo mierror) {
		   System.out.println(mierror.getMessage());
	   }
		
	   System.out.println(" Fin del programa");
	   
	}

static void haceralgo ( int num) throws ExceptionNegativo {
	num--;
	if ( num < 0) {
		throw new ExceptionNegativo(num);
	}

}
	
}
