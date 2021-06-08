package exerciciosOOP;

public class ProdutoE {
	private int idProduto;
	private String categoria;
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	public void retirarEstoque(int vendas) {
		 this.qtdEstoque = qtdEstoque - vendas;
		
	}
	
	public void descontar(double desconto) {
		 this.preco = preco - desconto;
		
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	
}
