import java.util.Arrays;
import java.util.Random;

public class TestCafeteras {

	public static void main(String[] args) {
		
		Random azar = new Random();
		
		Cafetera tcafeteras [] = new Cafetera [4];
		
		// Creo las tabla de cafeteras
		tcafeteras[0] = new Cafetera( 2000);
		tcafeteras[1] = new Cafetera( 1000);
		tcafeteras[2] = new Cafetera( 1500);
		tcafeteras[3] = new Cafetera( 1000);
		
		
		
              // Relleno las cafeteras y sirvo y relleno 
		for (int i=0; i< tcafeteras.length; i++){
			tcafeteras[i].llenarCafetera();
			tcafeteras[i].servirTaza( azar.nextInt(100));
			tcafeteras[i].agregarCafe(azar.nextInt(100));
		}
		
		// Ordeno la tabla
		Arrays.sort(tcafeteras);
		
		// Genero el informe
		System.out.println("---------------------------------------");
		System.out.println("       Estado Actual de Cafeteras:     ");
		System.out.println("---------------------------------------");
		System.out.println("Nº Cantidad Actual    Capacidad Máxima");
		for (int i = 0; i < tcafeteras.length; i++) {
			System.out.printf("%2d %8d  \t \t %8d \n", i+1,     
                           tcafeteras[i].getCapacidadActual(), tcafeteras[i].getCapacidadMáxima());
		}
	}

}
