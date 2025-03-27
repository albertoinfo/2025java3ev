
/**
*  Versión básica de una calculadora
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Calculadora0 {
	// instance variables - replace the example below with your own
	public static void main(String argv[]) {

		int num1;
		int num2;
		int resu = 0;
		char operador, continuar;
		boolean error = false;
		Scanner sc = new Scanner(System.in);

		do {
			error = false;
			System.out.print("1º Valor:");
			num1 = leerNúmero(sc);
			System.out.print("2º Valor:");
			num2 = leerNúmero(sc);
			System.out.print("Introduce el operador [+-*/]:");
			operador = leerOperador(sc);

			// Trata la excepción de división por 0, en eso caso error se pondra a true
			// Completar.
			try {
				resu = operar(operador, num1, num2);
			} catch (ArithmeticException e) {
				System.out.println(" Error al dividir por 0");
				error = true;
			} catch (DesbordamientoException e) {
				System.out.println(e.getMessage());
				error = true;
			}

			if (!error)
				System.out.println("Resultado = " + resu);

			System.out.print(" ¿Desea continuar? (S/N):");
			continuar = sc.nextLine().charAt(0);

		} while (continuar == 's' || continuar == 'S');

		System.out.println("- Fin del programa -");
	}

	/**
	 * Lee número entero, si el valor es erróneo lo solita de nuevo hasta que sea
	 * correcto
	 * 
	 * @param sc - Scaner desde donde se leer el valor.
	 * @return número entero leido.
	 */
	static int leerNúmero(Scanner sc) {
		int numero = 0;
		boolean error = false;
		do {
			error = false;
			String valor = sc.nextLine();
			try {
				numero = Integer.parseInt(valor);
			} catch (NumberFormatException e) {
				System.out.println(" Valor incorrecto");
				error = true;
			}
			// El valor es entero
			if (error == false) {
				if (numero > 99999 || numero < -99999) {
					System.out.println("Solo se admiten 5 dígitos");
					error = true;
				}
			}

		} while (error);
		return numero;
	}

	/**
	 * Leer un caracter hasta que sea +,-,* o /
	 * 
	 * @param sc Scanner desde donde se lee.
	 * @return caracter leído
	 */
	static char leerOperador(Scanner sc) {
		char letra = '+';
		letra = sc.nextLine().charAt(0);
		while (letra != '+' && letra != '-' && letra != '*' && letra != '/') {
			System.out.println("Operador no válido");
			letra = sc.nextLine().charAt(0);
		}

		return letra;
	}

	/**
	 * Realiza la operación segun el caracter indicado
	 * 
	 * @param letra operador +,-,*,/
	 * @param num1  primer número
	 * @param num2  segundo número
	 * @return resultado de la operación
	 * @throws DesbordamientoException
	 */
	static int operar(char letra, int num1, int num2) throws DesbordamientoException {

		int resu = 0;
		switch (letra) {
		case '+':
			resu = num1 + num2;
			break;
		case '-':
			resu = num1 - num2;
			break;
		case '*':
			resu = num1 * num2;
			break;
		case '/':
			resu = num1 / num2;
			break;
		}

		if (resu > 99999 || resu < -99999) {
			throw new DesbordamientoException();
		}

		return resu;
	}
}
