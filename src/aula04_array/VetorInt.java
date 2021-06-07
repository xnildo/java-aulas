package aula04_array;

public class VetorInt {

	public static void main(String[] args) {
		// Criação de um vetor/array de inteiros
		int[] arrayNums = new int[10];
		
		//percorrendo os números dentro do array
		for(int i = 0; i< arrayNums.length; i++) {
			System.out.println(i+" = "+arrayNums[i]);
		}

	}

}
