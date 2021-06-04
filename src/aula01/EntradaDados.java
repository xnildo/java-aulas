package aula01;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	     int a, b, soma;
	     
	     System.out.print("Digite o valor de A: ");
	     a = entrada.nextInt();
	     
	     System.out.print("Digite o valor de B: ");
	     b = entrada.nextInt();
	     
	     soma = a + b;
		
	     System.out.printf("A Soma de "+a+" e "+b+" é: "+ soma);
	     
	     entrada.close();
	}
}
