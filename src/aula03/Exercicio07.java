package aula03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, somaMult3=0, contMult3=0;
		double mediaM3=0.0;
		do {
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			if(n%3==0) {
				contMult3++;
				somaMult3 += n;
				
			}
					
		}while(n != 0);
		mediaM3 = somaMult3/contMult3;
		System.out.println("Soma dos números: "+mediaM3);
	}

}
