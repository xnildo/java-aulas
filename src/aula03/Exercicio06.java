package aula03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, somaMult3=0, contMult3=0;
		double mediaM3=0.0;
		do {
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			if(n==0) {
				break;
			}
			if(n % 3 == 0) {
				contMult3++;
				somaMult3+= n;
				mediaM3 = somaMult3/contMult3;
			}
					
		}while(n != 0);
		
		System.out.println("A média dos números multiplos de 3: "+mediaM3);
		

	}

}
