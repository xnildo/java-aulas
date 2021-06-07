package aula04_Exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		// Criação de um vetor/array de inteiros
		int[] numeros = new int[6];
		int soma=0 ;
		
		//a- Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		numeros[0] =  1;
		numeros[1] =  0;
		numeros[2] =  5;
		numeros[3] =  -2;
		numeros[4] =  -5;
		numeros[5] =  7;
		
		/*(b) Armazene em uma variável inteira (simples)
		 *  a soma entre os valores das posições A[0], A[1] e A[5] do vetor 
		 *  e mostre na tela esta soma. 
		 */
		for (int i=0; i< numeros.length; i++) {			
			soma+= (numeros[0]+numeros[1]+numeros[5]);
			numeros[4]=100;
			
			System.out.println((i+1) + " = " + numeros[i]);
			
			}
					  		
		System.out.println("A soma desses valores é: "+soma);

	}

}
