package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.rectangle;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		rectangle rect = new rectangle();

		System.out.println("Entre com a largura e altura do retângulo:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();
	}

}
