package aula03;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0 ;
		
		while(num != 10) {
			System.out.println("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(num == 10) {
				System.out.println("Acertou!!, Parab�ns. ");
			}
			else {
				System.out.println("ERROU !!,  Tente novamente.");
			}
		}
		leia.close();
	}

}
