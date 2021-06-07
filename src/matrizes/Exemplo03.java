package matrizes;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
			
		Scanner entrada = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		
		System.out.println("===Notas do Aluno===");
		
		for(int l = 0; l < notasAlunos.length; l++) { // percorre a linha
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.printf("Digite as notas: [%d][%d] ", l, c);
				notasAlunos[l][c] = entrada.nextDouble();
			}
			
			System.out.println();
		}
		for(int l = 0; l < notasAlunos.length; l++) { // percorre a linha
			for(int c = 0; c < notasAlunos[l].length; c++) {
				System.out.println(notasAlunos[l][c] + ", ");
				}
			System.out.printf("\n");
			}

	}

}
