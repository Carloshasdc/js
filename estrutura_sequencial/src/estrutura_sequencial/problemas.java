package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;


public class problemas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura;
		double comprimento;
		double metro;
		double area;
		double preco;		
		
		System.out.printf("Digite a largura do terreno:");
		largura = sc.nextDouble();
		System.out.printf("Digite o comprimento do terreno:");
		comprimento = sc.nextDouble();
		System.out.printf("Digite o valor do metro quadrado:");
		metro = sc.nextDouble();
		area = largura * comprimento;
		System.out.println("Area do terreno =" + area);
		preco = area * metro;
		System.out.println("Preco do terreno =" + preco);
		
		
		sc.close();

	}

}
