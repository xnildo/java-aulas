package aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
			
		System.out.print("Digite um n�mero: ");
		n = leia.nextInt();
						
		if(n%2==0){			
			System.out.print("Este n�mero � PAR.\n");
			System.out.print("Sua Raiz quadrada �:" + Math.sqrt(n));			
			
		}else{
			System.out.print("Este n�mero � IMPAR.\n");
			System.out.print("Sua Pot�ncia 2 �: " + Math.pow(n, 2));
		}

	}

}
