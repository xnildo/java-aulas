package br.com.generation.exerciciosHeranca.exec01;

public class Cachorro extends Animal implements InterfaceAnimal{
			
	public void correr() {
		System.out.println("Cachorro correndo... ");
	}
	
	public void emitirSom() {
		System.out.println("Som do Cachorro: HALF-HALF-HALF");
	}
	
	public void subir() {
		System.out.println("Cachorro subindo em arvore...");
	}
		
	
	
	
	
	
}
