package aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
			
		System.out.print("Digite um número: ");
		n = leia.nextInt();
						
		if(n%2==0){			
			System.out.print("Este número é PAR.\n");
			System.out.print("Sua Raiz quadrada é:" + Math.sqrt(n));			
			
		}else{
			System.out.print("Este número é IMPAR.\n");
			System.out.print("Sua Potência 2 é: " + Math.pow(n, 2));
		}

	}

}
