package br.com.generation.exerciciosHeranca.execEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> listaProdutos = new ArrayList<String>();
		
		
		
		Produto prod1 = new Produto();
		System.out.print("Digite o id do Produto:  ");		
		prod1.setIdProduto(scan.nextInt());
		
		System.out.print("\nDigite a Categoria:  ");
		prod1.setCategoria(scan.nextLine());
		
		System.out.print("\nDigite o Nome:  ");
		prod1.setNome(scan.nextLine());
		
		System.out.print("\nDigite o Preço R$:  ");
		prod1.setPreco(scan.nextDouble());
		listaProdutos.add(prod1.getNome());
		
		Produto prod2 = new Produto();
		prod2.setIdProduto(1);
		prod2.setCategoria("HardWare");
		prod2.setNome("SSD SATA 120GB");
		prod2.setPreco(160.59);
		prod2.setQtdEstoque(20);
		listaProdutos.add(prod2.getNome());;
		
		
		System.out.println("Número de produtos restante no estoque:"+
				prod1.getQtdEstoque());
		
		prod1.descontar(22.99);
		System.out.println("Hoje é BLACK FRIDAY o "+prod1.getNome()+
				" está na PROMOÇÃO com preço de R$:"+prod1.getPreco());
		
		System.out.println(listaProdutos);
	   
	}

}
