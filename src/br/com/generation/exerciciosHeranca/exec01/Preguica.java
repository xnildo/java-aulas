package br.com.generation.exerciciosHeranca.exec01;

public class Preguica extends Animal implements InterfaceAnimal{
			
	public void correr() {
		System.out.println("Pregui�a Ratejando... ");
	}
	
	public void emitirSom() {
		System.out.println("Som da Pregui�a: ZZZZZZZZZzzzzzzzz");
	}
	
	public void subir() {
		System.out.println("Pregui�a subindo em �rvore...");
	}
	
	
}
