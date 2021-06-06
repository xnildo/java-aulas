package arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Cria��o de um array de Strings
		String[] carros = {"Jaguar", "BMW", "Toyota", "Volvo"};
		
		System.out.println("O carro N� 1 � o: "+carros[0]);
		
		//Alterar um elemento Array
		carros[0] = "Mercedes Bens";
		System.out.println("O carro N� 1 � o: "+carros[0]);
		
		//Comprimento da Matriz, Tamanho da array
		System.out.println("Quantidade de carros ou tamanho da array: "+carros.length);
		
		//Loop por meio de uma matriz/array
		for (int i = 0; i < carros.length; i++) {
			  System.out.println("Carro n� "+(i+1)+" = "+carros[i]);
			}
		System.out.println("");
		
		//Fa�a um loop em uma matriz com For-Each
		for (String i : carros) {
			  System.out.println(i);
			}
		
		
	}
}
