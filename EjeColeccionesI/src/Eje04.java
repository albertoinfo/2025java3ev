
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Eje04 {

	public static void main(String[] args) {
				
	 Scanner sc = new Scanner(System.in);
     System.out.println("Introduce 10 palabra diferentes:");
     ArrayList <String> as = new ArrayList <String>();
     
     
     // 10 Palabras sin repetición
     int cont = 0;
     while ( cont < 10 ) {
        String palabra = sc.nextLine();
        if ( ! as.contains(palabra) ) {
        	as.add(palabra);
        	cont++;
        } else {
        	System.out.println(" > Palabra repetida ");
        }
     }
     
     /*
     // Se puede repetir palabras
     for (int i = 0; i<10; i++) {
    	 String palabra = sc.nextLine();
    	 as.add(palabra);
     }
     */
     
     Collections.sort(as);
     
     System.out.println("Lista de palabras:");
     System.out.println(as);
     
     
	}

}
