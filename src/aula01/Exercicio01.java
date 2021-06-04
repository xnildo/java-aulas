package aula01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int dias, meses, anos;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a sua idade.");
		System.out.print("Anos: ");
		anos = leia.nextShort();
		
		System.out.print("Meses: ");
		meses = leia.nextShort();
		
		System.out.print("Dias: ");
		dias = leia.nextShort();
		
		dias += (anos * 365) + (meses * 30);
		
		System.out.println("\nA sua idade em dias é: " + dias);
		leia.close();

	}

}
