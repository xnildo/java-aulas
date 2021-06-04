package aula03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, contImpar=0, contPar=0;
		for(int i=1; i<=10; i++) {
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			if(n%2==0) {
				contPar++;
				
			}
			else {
				contImpar++;
				
			}
		}
		System.out.println("Quantidade de números Pares: "+contPar);
		System.out.println("Quantidade de números Impares: "+contImpar);
	}

}
