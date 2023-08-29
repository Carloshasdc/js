package desafio_atletas;

import java.util.Locale;
import java.util.Scanner;

public class atletas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int N, mulher, homem;
		String nome, maiorNome, sobre, nomeCompleto;
		char sexo;
		double altura, peso, pesoM, pHomens, alturaMediaM, cont, soma, maisAlto;

		System.out.printf("Qual a quantidade de atletas?");
		N = sc.nextInt();

		mulher = 0;
		cont = 0;
		altura = 0;
		homem = 0;
		peso = 0;
		soma = 0;
		pesoM = 0;
		maiorNome = "";
		maisAlto = 0;
		pHomens = 0;
		alturaMediaM = 0;

		for (int i = 1; i <= N; i = i + 1) {
			System.out.printf("Digite os dados do atleta numero:%d \n", i);
			System.out.printf("Nome:");
			nome = sc.next();
			sobre = sc.next();
			nomeCompleto = nome + sobre;

			System.out.printf("Sexo:");
			sexo = sc.next().charAt(0);

			while (sexo != 'F' && sexo != 'M') {

				System.out.printf("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}

			System.out.printf("Altura:");
			altura = sc.nextDouble();

			while (altura <= 0) {
				System.out.printf("Valor invalido! Favor digitar um valor positivo:");
				altura = sc.nextDouble();
			}

			System.out.printf("Peso:");
			peso = sc.nextDouble();

			while (peso <= 0) {
				System.out.printf("Valor invalido! Favor digitar um valor positivo:");
				peso = sc.nextDouble();

			}
			if (sexo == 'F') {
				mulher = mulher + 1;
				cont = cont + altura;
				alturaMediaM = cont / mulher;
			}
			if (sexo == 'M') {
				homem = homem + 1;
				pHomens = (homem * 100) / N;
			}

			if (peso >= 0) {
				soma = soma + peso;
				pesoM = soma / i;
			}

			if (altura > maisAlto) {
				maisAlto = altura;
				maiorNome = nomeCompleto;
			}
			
		}
		System.out.printf("\n");
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas:%.2f %n", pesoM);
		System.out.printf("Atleta mais alto:%s%n", maiorNome);
		if (pHomens == 0) {
			System.out.printf("Não há homens cadastrados %n");
		} else {
			System.out.printf("Porcentagem de homens: %.1f %%%n", pHomens);
		}
		if (alturaMediaM == 0) {
			System.out.printf("Não há mulheres cadastradas");
		} else {
			System.out.printf("Altura média das mulheres: %.2f", alturaMediaM);
		}
		sc.close();
	}

}
