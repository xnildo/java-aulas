package aula03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma=0;
		
		do {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			soma += num;
		
		}while(num != 0);
		
		System.out.println("Soma dos números: "+soma);
	}
}
