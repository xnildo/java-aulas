package metodosStrings;

import java.util.Scanner;

public class String_Length01 {

	public static void main(String[] args) {
		//Para retornar o tamanho de uma uma String usamos o
		//m�todo .length();
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = leia.nextLine();
		
		int tamanhoNome= nome.length();
		System.out.println("O seu nome tem "+tamanhoNome+" letras");
		
		//Letras em mai�sculas
		System.out.println("O seu nome em mai�sculo: "+nome.toUpperCase());
		
		//Letras em min�sculas
		System.out.println("O seu nome em min�sculo: "+nome.toLowerCase());
		
		//O indexOf()m�todo retorna o �ndice (a posi��o) incluindo os espa�os
		System.out.println("A 1� letra A est� na posi��o: "+nome.indexOf("a"));
	
		//concatenando/juntando sem usar o +
		System.out.println(nome.concat(" pereira da silva"));
	}
	

}
