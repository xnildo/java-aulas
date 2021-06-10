package br.com.generation.exerciciosHeranca.execEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		
		
		Pessoa prod1 = new Pessoa();
		System.out.print("Digite o id do Produto:  ");		
		prod1.setIdProduto(scan.nextInt());
		
		System.out.print("\nDigite nome:  ");
		prod1.setNome(scan.nextLine());
		
	
		listaProdutos.add(prod1);
		
		
		
		
		
		
		System.out.println(listaProdutos);
		
	   
	}

}
