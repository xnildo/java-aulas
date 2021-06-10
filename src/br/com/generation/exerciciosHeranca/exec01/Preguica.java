package br.com.generation.exerciciosHeranca.exec01;

public class Preguica extends Animal implements InterfaceAnimal{
			
	public void correr() {
		System.out.println("Preguiça Ratejando... ");
	}
	
	public void emitirSom() {
		System.out.println("Som da Preguiça: ZZZZZZZZZzzzzzzzz");
	}
	
	public void subir() {
		System.out.println("Preguiça subindo em árvore...");
	}
	
	
}
