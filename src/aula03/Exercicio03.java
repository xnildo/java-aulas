package aula03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, tMenor21 = 0, tMaior50 = 0;

		while (idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = ler.nextInt();

			System.out.println("Digite [-99] para Finalizar.\n");

			if (idade >= 0 && idade < 21) {
				tMenor21++;
			} else if (idade > 50) {
				tMaior50++;
			}

		}
		System.out.println("Pessoas com menos de 21 anos: " + tMenor21);
		System.out.println("Pessoas com mais de 50 anos: " + tMaior50);
		System.out.println("Programa Finalizado.");

		ler.close();
	}

}
