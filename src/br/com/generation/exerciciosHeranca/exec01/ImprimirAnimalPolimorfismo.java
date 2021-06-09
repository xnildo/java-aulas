package br.com.generation.exerciciosHeranca.exec01;

public class ImprimirAnimalPolimorfismo {

	public static void main(String[] args) {
		TestarAnimal teste1 = new TestarAnimal();
		
		teste1.somAnimal(new Cachorro());
		teste1.somAnimal(new Cavalo());
		teste1.somAnimal(new Preguica());
		teste1.correr(new Cavalo());
		teste1.correr(new Preguica());

	}

}
