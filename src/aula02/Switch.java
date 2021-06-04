package aula02;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = entrada.nextLine();

		switch(letra) {
			case "a" , "A" :
				System.out.println("Ana");
			break;

			case "b", "B":
				System.out.println("Bruna");
			break;

			case "c":
				System.out.println("Cassimiro");
			break;

			case "d":
				System.out.println("Djan");
			break;
			default:
				System.out.println("Letra Inválida!");				

		}
		entrada.close();

	}

}
