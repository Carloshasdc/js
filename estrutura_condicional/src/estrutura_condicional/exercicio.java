package estrutura_condicional;

import java.util.Scanner;

public class exercicio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
		double nota1;
		double nota2;
		double notaf;
		
		System.out.printf("Digite a primeira:");
		nota1 = sc.nextDouble();
		System.out.printf("Digite a segunda nota:");
		nota2 = sc.nextDouble();
		notaf = nota1 + nota2;
		System.out.println("NOTA FINAL =" + notaf);
		
	    if (notaf < 60.0) {
	    	System.out.printf("REPROVADO");
	    }
				
		sc.close();
	}

}
