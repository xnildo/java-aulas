package br.com.generation.exerciciosHeranca.exec01;

public class Cavalo extends Animal implements InterfaceAnimal{
			
	public void correr() {
		System.out.println("Cavalo Trotando... ");
	}
	
	public void emitirSom() {
		System.out.println("Som do Cavalo: Hiii-Hiii-Hii");
	}
	
	public void subir() {
		System.out.println("Cavalo subindo na cerca... ");
	}
	
	
}
