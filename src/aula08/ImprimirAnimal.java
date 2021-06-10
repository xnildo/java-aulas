package aula08;

public class ImprimirAnimal {

	public static void main(String[] args) {
		Cachorro meudog = new Cachorro();
		Gato meugato = new Gato();
		
		meudog.dormir();
		meudog.somAnimal();
		meudog.setNome("REX");
		System.out.println(meudog.getNome());
		
		meugato.dormir();
		meugato.somAnimal();
		meugato.setNome("REX");
		System.out.println(meugato.getNome());
	}

}
