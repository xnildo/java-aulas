package br.com.generation.exerciciosHeranca.exec01;

public class Principal {
	public static void main(String[] args) {
		
		//CACHORRO
		Cachorro dog1 = new Cachorro();
		dog1.setAnimal("Cachorro");
		dog1.setTipo("Mamífero");
		dog1.setRaca("PitBull");
		dog1.setNome("Rex");
		dog1.setCor("Bege");
		dog1.setIdade(4);
		dog1.setPeso(34.55);		
		System.out.println("================ Dados do Animal : "+dog1.getAnimal()+" ================");
		System.out.printf("|    Tipo    |   Raça    | Nome  |  Cor  | Idade |"
				+ "  Peso  |");
		System.out.printf("\n|  %s  |  %s  |  %s  |  %s |   %d   |"
				+ "  %.2f |\n",dog1.getTipo(),dog1.getRaca(),dog1.getNome(),
				dog1.getCor(),dog1.getIdade(),dog1.getPeso());
		System.out.println("-----------------------------------------------------------");
		dog1.emitirSom();
		System.out.println("-----------------------------------------------------------");
		dog1.correr();
		dog1.subir();
		System.out.println("-----------------------------------------------------------\n");
		//CAVALO
		Cavalo cavalo = new Cavalo();
		cavalo.setAnimal("Cavalo");
		cavalo.setTipo("Mamífero");
		cavalo.setRaca("Argentino");
		cavalo.setNome("Pé de Pano");
		cavalo.setCor("Preto");
		cavalo.setIdade(10);
		cavalo.setPeso(287.11);
		System.out.println("=================== Dados do Animal : "+cavalo.getAnimal()+" ===================");
		System.out.printf("|    Tipo    |   Raça    |    Nome    |  Cor  | Idade |"
				+ "  Peso  |");
		System.out.printf("\n|  %s  | %s | %s | %s |  %d   |"
				+ " %.2f |\n",cavalo.getTipo(),cavalo.getRaca(),cavalo.getNome(),
				cavalo.getCor(),cavalo.getIdade(),cavalo.getPeso());
		System.out.println("----------------------------------------------------------------");
		cavalo.emitirSom();
		System.out.println("----------------------------------------------------------------");
		cavalo.correr();
		cavalo.subir();
		System.out.println("----------------------------------------------------------------\n");
		
		//PREGUIÇA
		Preguica preguica = new Preguica();
		preguica.setAnimal("Preguiça");
		preguica.setTipo("Mamífero");
		preguica.setRaca("Coleira");
		preguica.setNome("Manhoza");
		preguica.setCor("Cinza");
		preguica.setIdade(7);
		preguica.setPeso(32.62);
		System.out.println("=============== Dados do Animal : "+preguica.getAnimal()+" ================");
		System.out.printf("|    Tipo    |  Raça   |   Nome  |  Cor  | Idade |"
				+ "  Peso  |");
		System.out.printf("\n|  %s  | %s | %s | %s |   %d   |"
				+ "  %.2f |\n",preguica.getTipo(),preguica.getRaca(),preguica.getNome(),
				preguica.getCor(),preguica.getIdade(),preguica.getPeso());
		System.out.println("-----------------------------------------------------------");
		preguica.emitirSom();
		System.out.println("-----------------------------------------------------------");
		preguica.subir();
		preguica.correr();
		System.out.println("-----------------------------------------------------------");
	}
}
