import java.util.Random;

public class Eje03 {

	public static void main(String[] args) {

		Random rd = new Random();
		int num;
		int veces = 0;

		try {
			while (true) {
				num = rd.nextInt(1, 11);
				System.out.print(num + " ");
				if (num == 6) {
					veces++;
					if (veces == 3) {
						throw new DevilException();
					}
				} else {
					veces = 0;
				}
			}
		} catch (DevilException e) {
			System.out.println("\n OHH " + e.getMessage());
		}
		
		System.out.println(" FIN DEL PROGRAMA");
		
	}

}
