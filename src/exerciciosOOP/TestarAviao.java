package exerciciosOOP;

public class TestarAviao {

	public static void main(String[] args) {
		Aviao av = new Aviao();
		av.setCor("Preto");
		av.setModelo("Boing-2929");
		av.setFabricante("USA");
		av.setPreco(200000000);
		av.setQtdPassageiros(200);
		av.setVeloMax(3000);
		
		av.mostrarAviao();
		
		System.out.println("O pre�o desse avi�o � R$: "+av.getPreco());
		
		System.out.println("Capacidade de passageiros: "+av.getQtdPassageiros());
		
		System.out.println("Velocidade m�xima: "+av.getVeloMax()+"Km/h");
	}

}
