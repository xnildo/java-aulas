package aula08;

public class Gato extends SuperAnimal implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("MIAUUU");
		
	}

	@Override
	public void dormir() {
		System.out.println("ZZZZZZZZZZZ");
		
	}

}
