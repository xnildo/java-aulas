package exerciciosOOP;

public class Patinete {
	
	private String modelo;
	private String cor;
	private int numRodas;
	private double preco;
	private double cargaMax;
	
	public void alerta() {
		System.out.println("Se seu peso for maior do que 65.5 Kg\n"
				+ "Não andar , o patinete vai quebrar!!!");
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumRodas() {
		return numRodas;
	}
	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}
}
