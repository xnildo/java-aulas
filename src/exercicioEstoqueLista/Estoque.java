package exercicioEstoqueLista;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public static void main(String[] args) {
		int qtdProduto, opc=4, id;
		Scanner scan = new Scanner(System.in);
		ArrayList<Produto> estoque = new ArrayList<>();
		//adicionando produtos no estoque
		estoque.add(new Produto(1, "SSD", "SSD KINGSTON 120GB", 170.50));
		estoque.add(new Produto(2, "SSD", "SSD KINGSTON 240GB", 240.85));
		estoque.add(new Produto(3, "HD", "HD SATA 1TB", 500));
		estoque.add(new Produto(4, "MOUSE", "MOUSE HYPERX", 256.45));
		
		while(opc != 3 && opc != 2 && opc != 1 && opc != 0) {
		System.out.println(" \t[ SISTEMA DE ESTOQUE DE PRODUTOS DO NILDO ]");
		System.out.println(" [1] ADICIONAR   [2] REMOVER   [3] VER PRODUTOS   [0] SAIR ");
		
		System.out.print(" [ ESCOLHA UMA DAS OPÇÕES ]: ");
		opc = scan.nextInt();
		
		if(opc ==1) {
			System.out.print("[ GOSTARIA DE ADICIONAR QUANTOS PRODUTOS ]: ");
			qtdProduto = scan.nextInt();
			
			for(int i=0; i < qtdProduto; i++) {
				System.out.println(" DIGITE OS DADOS DO PRODUTO");
				System.out.print(" ID PRODUTO: ");
				int idProduto = scan.nextInt();
				
				System.out.print(" CATEGORIA: "); 
				String categoria = scan.nextLine();
				scan.nextLine();
				
				System.out.print(" NOME: "); 
				String nome = scan.nextLine();
				
				System.out.print(" PREÇO: "); 
				double preco = scan.nextDouble();
				
				estoque.add(new Produto(idProduto, categoria, nome, preco));
				System.out.println(" PRODUTO ADICIONADO COM SUCESSO.");
			}
			for(Produto prod: estoque) {
				System.out.println(prod);
			}
		}else if(opc == 2) {		
			System.out.println(" EXISTEM "+estoque.size()+" NO ESTOQUE");
			if(estoque.size() > 0) {
				
				System.out.println(" DIGITE O ID DO PRODUTO QUE DESEJA REMOVER: ");
				id = scan.nextInt();
				estoque.remove(id);
				for(Produto prod: estoque) {
					if(prod.getIdProduto()==id) {
						System.out.println(" PRODUTO REMOVIDO: "+prod.getNome());
					}
					
				}
				
			}
			
		}
		else if(opc == 3) {
			for(Produto prod: estoque) {
				System.out.println(prod.getNome());
			}
		}
		else if(opc == 0) {
			
			System.out.println(" SISTEMA FINALIZADO, OBRIGADO PELA PREFERÊNCIA!");
		}
		else {
			System.out.println(" OPÇÃO INVÁLIDA.");
		}
		}
	}
}