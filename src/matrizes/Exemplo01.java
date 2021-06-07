package matrizes;

public class Exemplo01 {

	public static void main(String[] args) {
		// declarar linhas e colunas da matrix
		double[][] notasAlunos = new double[2][4];//2 linha e 4 colunas
		
		//4 notas do aluno da linha 1 
		notasAlunos[0][0]= 10.0;
		notasAlunos[0][1]= 5.5;
		notasAlunos[0][2]= 7.9;
		notasAlunos[0][3]= 9.6;
		
		//4 notas do aluno da linha 2
		notasAlunos[1][0]= 8.0;
		notasAlunos[1][1]= 8.5;
		notasAlunos[1][2]= 7.9;
		notasAlunos[1][3]= 6.6;
		
		//impressão da matriz
		for(int l =0; l< notasAlunos.length; l++) {//percorre a linha
			
			for(int c =0; c< notasAlunos[l].length; c++) {//percorre as colunas
				System.out.print(" | "+notasAlunos[l][c]+" | ");
				
			}
			System.out.println();
		}

	}

}
