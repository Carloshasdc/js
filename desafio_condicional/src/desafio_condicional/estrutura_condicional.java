package desafio_condicional;

import java.util.Scanner;
import java.util.Locale;

public class estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double salarioAnual, servico, capital, medico, educacionais, salario;
		double impostoSalario, impostoServicos, impostoCapital;
		double maximoDedutivel, gastoDedutivel;
		double impostoBrutoTotal, abatimento, impostoDevido;

		System.out.printf("Renda anual com salário:");
		salarioAnual = sc.nextDouble();
		System.out.printf("Renda anual com prestação de serviço:");
		servico = sc.nextDouble();
		System.out.printf("Renda anual com ganho de capital:");
		capital = sc.nextDouble();
		System.out.printf("Gastos médicos:");
		medico = sc.nextDouble();
		System.out.printf("Gastos educacionais:");
		educacionais = sc.nextDouble();

		System.out.printf("%n");
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA \n");

		System.out.println("CONSOLIDADO DE RENDA:");
		salario = salarioAnual / 12;
		if (salario < 3000) {
			impostoSalario = 0.00;
			System.out.printf("Imposto sobre salário: ISENTO %n", impostoSalario);
		} else {
			if (salario < 5000) {
				impostoSalario = salarioAnual * 0.1;
			} else {
				impostoSalario = salarioAnual * 0.2;
			}
			System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		}
		impostoServicos = servico * 0.15;
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServicos);

		impostoCapital = capital * 0.2;
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);

		System.out.printf("%n");
		System.out.println("DEDUÇÕES:");
		maximoDedutivel = (impostoSalario + impostoServicos + impostoCapital) * 0.3;
		System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
		gastoDedutivel = medico + educacionais;
		System.out.printf("Gastos dedutíveis: %.2f%n", gastoDedutivel);

		System.out.printf("%n");
		System.out.println("RESUMO:");
		impostoBrutoTotal = impostoSalario + impostoServicos + impostoCapital;
		System.out.printf("Imposto bruto total: %.2f%n", impostoBrutoTotal);

		if (maximoDedutivel > gastoDedutivel) {
			abatimento = gastoDedutivel;
		} else {
			abatimento = maximoDedutivel;
		}
		System.out.printf("Abatimento: %.2f%n", abatimento);

		impostoDevido = impostoBrutoTotal - abatimento;
		System.out.printf("Imposto devido: %.2f", impostoDevido);

		sc.close();
	}
}
