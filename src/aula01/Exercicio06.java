package aula01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	     double x1, x2, y1, y2, d;
	    	     
	     System.out.print("Digite as coordenadas do ponto X1: "); 
	     x1 = leia.nextDouble();
	     
	     System.out.print("Digite as coordenadas do ponto X2: "); 
	     x2 = leia.nextDouble();
	     
	     System.out.print("Digite as coordenadas do ponto Y1: "); 
	     y1 = leia.nextDouble();
	     
	     System.out.print("Digite as coordenadas do ponto Y2: "); 
	     y2 = leia.nextDouble();
	     
	     d = Math.sqrt((x2-x1)* (x2-x1)) + ((y2-y1)*(y2-y1));
	     	     
	     System.out.print("A distância entre os dois pontos é: "+d); 
	     leia.close();

	}

}
