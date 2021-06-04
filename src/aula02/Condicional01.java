package aula02;

import java.util.Scanner;

public class Condicional01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.print("Digite a 1º Nota: ");
		nota1 = ler.nextDouble();

		System.out.print("Digite a 2º Nota: ");
		nota2 = ler.nextDouble();

		media = (nota1 + nota2) / 2;

    	if(media >= 9.0) {
    		System.out.println("Aprovado com mérito" + "\nMédia: " + media);
		}
    	else if(media >=6.0 && media <9.0) {
    		System.out.println("Aprovado" + "\nMédia: " + media);
    	}
    	else if(media >= 3.0 && media <6.0) {
    		System.out.println("Recuperação" + "\nMédia: " + media);
    	}
    	else {
    		System.out.println("Reprovado" + "\nMédia: " + media);
    	}
    	ler.close();
	}

}
