package Programa;

import java.util.Locale;
import java.util.Scanner;

import formulas.execucao;

public class nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		execucao exe = new execucao();

		exe.nome = sc.nextLine();
		exe.a = sc.nextDouble();
		exe.b = sc.nextDouble();
		exe. c = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", exe.nota());
		if (exe.nota() >= 60) {
			System.out.printf("APROVADO");
		}
		else {
			System.out.printf("REPROVADO");
		}

		sc.close();

	}

}
