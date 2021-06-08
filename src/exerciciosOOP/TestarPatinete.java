package exerciciosOOP;

public class TestarPatinete {

	public static void main(String[] args) {
		Patinete patinete = new Patinete();
		patinete.setModelo("Astral");
		patinete.setCor("Vermelho");
		patinete.setNumRodas(2);
		patinete.setPreco(250);
		patinete.setCargaMax(65.50);
		
		
		
		System.out.printf("O Patinete é %s e custa R$: %.2f", 
				patinete.getCor(),patinete.getPreco());
		System.out.printf("\nLimite de peso %.2f",patinete.getCargaMax()," Kg\n");
		
		patinete.alerta();
	}

}
