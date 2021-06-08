package exerciciosOOP;

public class Aviao {
	private int qtdPassageiros;
	private String modelo;
	private String fabricante;
	private String cor;
	private double preco;
	private int veloMax;
	
	public void mostrarAviao() {
		System.out.println("Modelo: "+modelo+", Fabricante: "+fabricante+", Cor: "+cor+"");
	}
	
	


	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getVeloMax() {
		return veloMax;
	}
	public void setVeloMax(int veloMax) {
		this.veloMax = veloMax;
	}

	
}
