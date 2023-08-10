package estrutura_sequencial;

import java.util.Scanner;
import java.util.Locale;

public class Problema_idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	String nome1;
	String nome2;
	int idade1;
	int idade2;
	double media;
	
	System.out.println("Dados da primeira pessoa:");
	System.out.printf("Nome:");
	nome1 = sc.nextLine();
	System.out.printf("Idade:");
	idade1 = sc.nextInt();
	
	System.out.println("Dados da segunda pessoa:");
	System.out.printf("Nome:");
	sc.nextLine(); // --------------> limpeza de buffer
	nome2 = sc.nextLine();
	System.out.printf("Idade:");
	idade2 = sc.nextInt();
	media = (idade1 + idade2)/ 2.0;
	System.out.printf("A idade média de %s e %s é de %.1f anos",nome1, nome2, media);
    
	}

}
