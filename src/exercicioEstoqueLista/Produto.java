package exercicioEstoqueLista;

public class Produto {
	private int idProduto;
	private String categoria;
	private String nome;
	private double preco;
	
	public Produto(int idProduto, String categoria, String nome,
			double preco) {
		super();
		this.idProduto = idProduto;
		this.categoria = categoria;
		this.nome = nome;
		this.preco = preco;
	}
	
	
	
	@Override
	public String toString() {
		return "Produto [ ID Produto: " + idProduto + ", Categoria: "
				+ categoria + ", Nome: " + nome + ", Preço: R$" + preco
				+ "]";
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
	
	
}
