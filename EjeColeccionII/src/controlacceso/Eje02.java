package controlacceso;

import java.util.HashMap;
import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) {

		HashMap <String,String> duser = new HashMap <String,String> ();
		
		duser.put("user01","12345");
		duser.put("user02","00000");
		duser.put("user03","secreto");
		duser.put("admin","admin");
		
		Scanner sc = new Scanner (System.in);
		String user;
		String password;
		String passwordInterna;
		
		int intentos = 0;
		boolean exito = false;
		
		while ( intentos < 3 && ! exito ) {
			System.out.println(" Introduce usuario y contraseña");
			user = sc.nextLine();
			password = sc.nextLine();
			passwordInterna =  duser.get(user);
			if ( passwordInterna != null && passwordInterna.equals(password)) {
				System.out.println("Ha accedido al área restringida");
				exito = true;
			} else {
			    System.out.println(" Usuario y contraseña incorrecta");
			    intentos++;
			}				
		}
		if ( !exito) {
			System.out.println("Lo siento, no tiene acceso al área restringida");
		}
			
	}

}
