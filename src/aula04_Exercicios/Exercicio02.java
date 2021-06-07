package aula04_Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); //CTRL + SHIFT + O
		
		int[] nums = new int[6];
		int somaPares = 0 , contImpar=0;
		int i;
		
		//adicionado os 6 nums
		System.out.println(" Digite 6 números: ");		
		for(i = 0; i < nums.length; i++) {
			nums[i] = entrada.nextInt();
		}
		
		//mostrando os pares
		System.out.print("Pares Digitados: ");
		for(i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				somaPares  += nums[i];
				System.out.print(nums[i]+", ");
			}			
		}		
		
		//mostrando os impares
		System.out.print("\nImpares Digitados: ");
		for(i = 0; i < nums.length; i++) {
			if(nums[i] % 2 != 0) {
				contImpar++;
				System.out.print(nums[i]+", ");			
			}			
		}
		
		
		System.out.println("\nA soma dos Pares: "  + somaPares);
		System.out.println("Quantidade de Impares digitados: "  + contImpar);
		
		entrada.close();
		

	}

}
