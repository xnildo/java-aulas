package aula02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, maior;
			
		System.out.print("Digite um número 1: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite um número 2: ");
		n2 = leia.nextInt();
		
		System.out.print("Digite um número 3: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			maior = n1;
		}else if(n2>n1 && n2>n3) {
			maior = n2;
		}else {
			maior = n3;
		}
							
		System.out.print("O maior número digitado foi: "+ maior);
		leia.close();

	}

}
