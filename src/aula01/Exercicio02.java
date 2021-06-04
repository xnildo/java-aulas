package aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	     int anos=0, dias=0, meses;	     
	     System.out.print("Digite sua idade em dias: ");
	     dias = leia.nextInt();
	     anos = dias / 365 ;
	     meses = (dias % 365) / 30 ;
	     dias = (dias % 365) % 30;
	     
		
	     System.out.print("Sua idade é: "+anos+ " anos, "+meses+" meses e "+dias+ " dias");
	     
	     leia.close();

	}

}
