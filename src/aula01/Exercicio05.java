package aula01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		System.out.println("Média Ponderada");
		Scanner leia = new Scanner(System.in);
	     double nota1, nota2, nota3, media=0;
	     double p1, p2, p3;
	     
	     System.out.print("Digite a nota 1: "); 
	     nota1 = leia.nextDouble();
	     
	     System.out.print("Peso da nota 1: "); 
	     p1 = leia.nextDouble();
	     
	     System.out.print("Digite a nota 2: "); 
	     nota2 = leia.nextDouble();
	     
	     System.out.print("Peso da nota 2: "); 
	     p2 = leia.nextDouble();
	     
	     System.out.print("Digite a nota 3: "); 
	      nota3 = leia.nextDouble();
	      
	      System.out.print("Peso da nota 3: "); 
	     p3 = leia.nextDouble();
	     
	      media = (nota1* p1 + nota2*p2 +nota3*p3) / (p1+p2+p3);
	     
	     System.out.print("A média ponderada é: " + media); 
	     leia.close();

	}

}
