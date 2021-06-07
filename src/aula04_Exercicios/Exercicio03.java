package aula04_Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int contMaior10=0;
		
		System.out.println("Digite os valores para preencher a matriz 3X3" );
		for(int l=0; l< matriz.length;l++) {			
			for(int c=0; c< matriz[l].length;c++) {
				System.out.print("Linha:["+(l+1)+"] | Coluna:["+(c+1)+"]");
				matriz[l][c] = leia.nextInt();
			}			
		}
		
		System.out.println("----------------------------------------------------");
		
		System.out.print("=== Matriz === \n");
		for(int l=0; l< matriz.length;l++) {			
			for(int c=0; c< matriz[l].length;c++) {
						
					System.out.print("["+matriz[l][c]+"] ");
								
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------");
		System.out.print("Valores maiores do que 10: ");
		for(int l=0; l< matriz.length;l++) {			
			for(int c=0; c< matriz[l].length;c++) {
				if(matriz[l][c] > 10) {
					contMaior10++;
					System.out.print(matriz[l][c]+", ");
					
				}
			}
			
		}
		System.out.println("\nQuantidade de valores maiores do que 10: "+contMaior10);
		
	}

}
