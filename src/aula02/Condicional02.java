package aula02;

import java.util.Scanner;

public class Condicional02 {
		Scanner ler = new Scanner(System.in);

		double numero1, numero2, resultado = 0.0;
		char operacao;

		System.out.println("Digite o 1� N�mero: ");
		numero1 = ler.next().char();

		System.out.println("Digite a opera��o: ");
		operacao = ler.next().

		System.out.println("Digite o 2� N�mero: ");
		numero2 = ler.nextDouble();

		if(operacao == '+' ) {
			resultado = numero1 + numero2;
		}
		else if(operacao == '-') {
			resultado = numero1 - numero2;
		}
		else if(operacao == 'x' || operacao == '*') {
			resultado = numero1 * numero2;
		}
		else if(operacao == '/' || operacao == '%') {
			resultado = numero1 / numero2;
		}
		System.out.println("Resultado: " + resultado);
		ler.close();
	}
}
