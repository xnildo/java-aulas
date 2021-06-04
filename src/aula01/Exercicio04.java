package aula01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	     int a, b, c, r=0, s=0, d=0;
	     
	     System.out.print("Digite o valor de A: "); 
	     a = leia.nextInt();
	     
	     System.out.print("Digite o valor de B: "); 
	     b = leia.nextInt();
	     
	     System.out.print("Digite o valor de C: "); 
	     c = leia.nextInt();	     
	     
	     r =(a+b)*(a+b);
	     s =(b+c)*(b+c);
	     d = (r + s)/2;
	     
	     System.out.print("Valor de R: "+r+"\nValor de S: "+s+"\nValor de D: "+d); 
	     leia.close();

	}

}
