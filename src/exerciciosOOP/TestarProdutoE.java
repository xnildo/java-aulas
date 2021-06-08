package exerciciosOOP;

public class TestarProdutoE {

	public static void main(String[] args) {
		ProdutoE ssd = new ProdutoE();
		ssd.setIdProduto(04);
		ssd.setCategoria("HardWare");
		ssd.setNome("SSD SATA 120GB");
		ssd.setPreco(160.59);
		ssd.setQtdEstoque(20);
		
		ssd.retirarEstoque(10);
		System.out.println("Número de produtos restante no estoque:"+
		ssd.getQtdEstoque());
		
		ssd.descontar(22.99);
		System.out.println("Hoje é BLACK FRIDAY o "+ssd.getNome()+
				" está na PROMOÇÃO com preço de R$:"+ssd.getPreco());
		
	}

}
