package aula02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		String categoria = "";
			
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade >=10 && idade <=14) {
			categoria = "Infatil";
		}else if(idade >=15 && idade <=17) {
			categoria = "Juvenil";
		}else if(idade >=18 && idade <=25) {
			categoria = "Adulto";
		}
		System.out.println("Você entra na categoria: "+categoria);
	
	}
	
}
