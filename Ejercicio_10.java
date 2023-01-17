import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, aux = 0, r;
		boolean v = false;

		do {
			System.out.println("Introduzca un numero entero positivo: ");
			x = scan.nextInt();
			if (x <= 0) {
				System.out.println("El numero no es valido.");
			} else {
				v = true;
			}
		} while (!v);

		while (x > 0) {
			r = x % 10;
			aux = aux * 10 + r;
			x /= 10;
		}
		System.out.println("El numero reordenado de la ultima cifra a la primera es: " + aux);
	}
}