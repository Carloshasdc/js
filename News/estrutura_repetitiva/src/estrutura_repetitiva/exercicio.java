package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite dois numeros:");
		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {

			if (x < y) {
				System.out.println("CRESCENTE!");
			} else {
				System.out.println("DECRESCENTE!");
			}

			x = sc.nextInt();
			y = sc.nextInt();

		}

		sc.close();

	}

}
