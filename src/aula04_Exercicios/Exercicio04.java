package aula04_Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double constante;
		int opcao=0;
		
		//preenchendo a 1º matriz
		System.out.println("Digite os valores para preencher a 1ºmatriz 2X2:");
		for(int l = 0; l < matriz1.length; l++) { // percorre a linha				
			for(int c = 0; c < matriz1[l].length; c++) {
				System.out.printf("linha[%d] coluna[%d] : ", l, c);
				matriz1[l][c] = leia.nextDouble();
			}
			System.out.println();
		}
		
		//preenchendo a 2º matriz
		System.out.println("Digite os valores para preencher a 2ºmatriz 2X2:");
		for(int l = 0; l < 2; l++) { // percorre a linha				
			for(int c = 0; c < 2; c++) {
				System.out.printf("linha[%d] coluna[%d] : ", l, c);
				matriz2[l][c] = leia.nextDouble();
			}
			System.out.println();
		}
		
				
		System.out.println("----------------- OPCÇÕES -----------------");
		System.out.println("[1] SOMAR AS 2 MATRIZES");
		System.out.println("[2] SUBITRAIR A 1º DA 2º");
		System.out.println("[3] ADICIONAR UMA CONSTANTE AS 2 MATRIZES");
		System.out.println("[4] IMPRIMIR AS MATRIZES");
		
		opcao = leia.nextInt();
		if(opcao == 1) {
			//criar nova matriz
			double[][] matrizSomar = new double[2][2];
			
			for(int l = 0; l < 2; l++) { 				
					for(int c = 0; c < 2; c++) {
						matrizSomar[l][c] = matriz1[l][c] + matriz2[l][c];
				}
					System.out.println();
			}
			System.out.println("Matriz da soma das 1 e 2");
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					System.out.printf("[%.2f] ", matrizSomar[l][c]);
				}
				System.out.println();
			}								
			
		}
		else if(opcao == 2) {
			//criar nova matriz
			double[][] matrizSubtrair = new double[2][2];
			
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					matrizSubtrair[l][c] = matriz1[l][c] - matriz2[l][c];
				}
				System.out.println();
			}
			System.out.println("Matriz da subtração das 1 e 2");
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					System.out.printf("[%.2f] ", matrizSubtrair[l][c]);
				}
				System.out.println();
			}					
		}
		else if(opcao == 3) {
			//criar uma constante
			System.out.print("Digite a Constante:");
			constante = leia.nextDouble();
			
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					matriz1[l][c] = matriz1[l][c] + constante;
				}
				System.out.println();
			}
			
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					matriz1[l][c] = matriz1[l][c] + constante;
					matriz2[l][c] = matriz2[l][c] + constante;
				}
				System.out.println();
			}
			System.out.println("Matriz1 somada com a constante");
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					System.out.printf("  [%.2f] ", matriz1[l][c]);
				}
				System.out.println();
			}
			System.out.println("Matriz2 somada com a constante");
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					System.out.printf("  [%.2f] ", matriz2[l][c]);
				}
				System.out.println();
			}			
		}
		else if(opcao == 4) {
			System.out.println("--- Matriz 1 ---");
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					System.out.printf("[%.2f] ", matriz1[l][c]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("--- Matriz 2 ---");
			for(int l = 0; l < 2; l++) { 				
				for(int c = 0; c < 2; c++) {
					System.out.printf("[%.2f] ", matriz2[l][c]);
				}
				System.out.println();
			}		
		}
		else {
			System.out.println("Opção Inválida.");
		}
	}

}
