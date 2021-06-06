package metodosStrings;

import java.util.Scanner;

public class String_Length01 {

	public static void main(String[] args) {
		//Para retornar o tamanho de uma uma String usamos o
		//método .length();
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = leia.nextLine();
		
		int tamanhoNome= nome.length();
		System.out.println("O seu nome tem "+tamanhoNome+" letras");
		
		//Letras em maiúsculas
		System.out.println("O seu nome em maiúsculo: "+nome.toUpperCase());
		
		//Letras em minúsculas
		System.out.println("O seu nome em minúsculo: "+nome.toLowerCase());
		
		//O indexOf()método retorna o índice (a posição) incluindo os espaços
		System.out.println("A 1º letra A está na posição: "+nome.indexOf("a"));
	
		//concatenando/juntando sem usar o +
		System.out.println(nome.concat(" pereira da silva"));
	}
	

}
