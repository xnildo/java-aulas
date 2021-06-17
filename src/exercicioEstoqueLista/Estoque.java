package exercicioEstoqueLista;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		int qtdProduto, opc=0, id;
		Scanner scan = new Scanner(System.in);
		ArrayList<Produto> estoque = new ArrayList<>();
		
		//Adicionando produtos no estoque
		estoque.add(new Produto(1, "SSD", "SSD KINGSTON 120GB", 170.50));
		estoque.add(new Produto(2, "SSD", "SSD KINGSTON 240GB", 240.85));
		estoque.add(new Produto(3, "HD", "HD SATA 1TB", 500));
		estoque.add(new Produto(4, "MOUSE", "MOUSE HYPERX", 256.45));
		do {
		System.out.println(" \t\t\t-------------------------------------------");
		System.out.println(" \t\t\t| SISTEMA DE ESTOQUE DE PRODUTOS DO NILDO |");
		System.out.println(" \t\t\t-------------------------------------------");
		
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("|   [1] ADICIONAR   [2] REMOVER   [3] VER PRODUTOS  [4] ATUALIZAR PRODUTO   [0] SAIR   |");		
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.print(" | ESCOLHA UMA DAS OPÇÕES |: ");
		opc = scan.nextInt();
		
		if(opc ==1) {
			System.out.println(" ---------------------------------------------");
			System.out.print(" | DIGITE A QUANTIDADE DE PRODUTOS ADICIONAR |: ");
			qtdProduto = scan.nextInt();
			System.out.println(" ---------------------------------------------");
			

			for(int i=0; i < qtdProduto; i++) {
				System.out.printf(" DIGITE OS DADOS DO %dº PRODUTO", (i+1));
				int idProduto;
				if(estoque.size() > 0) {
					idProduto = (estoque.size()+1);
				}
				else {
					idProduto = (i+1);
				}
				System.out.println("\n ---------------------------");
				System.out.printf(" | ID PRODUTO |: %d", idProduto);
				
				scan.nextLine();
				System.out.println("\n ---------------------");
				System.out.print(" | CATEGORIA |: "); 
				String categoria = scan.nextLine().toUpperCase();
				
				System.out.println(" ---------------------");
				System.out.print(" | NOME |: "); 
				String nome = scan.nextLine().toUpperCase();
				
				System.out.println(" ---------------------");
				System.out.print(" | PREÇO |: "); 
				double preco = scan.nextDouble();
				
				System.out.println(" ---------------------");
				estoque.add(new Produto(idProduto, categoria, nome, preco));
				System.out.println(" PRODUTO ADICIONADO.");
				System.out.println(" ---------------------\n");
			}
			
				System.out.println("\n\t\t\t---------------------");
				System.out.println("\t\t\t| LISTA DE PRODUTOS |");
				for(Produto produtos: estoque) {
					System.out.println("---------------------------------------------------------------------------");
					System.out.println(produtos);
				}
				System.out.println("---------------------------------------------------------------------------");

			
		}else if(opc == 2) {		
		
			if(estoque.size() > 0) {
				System.out.println("\n\t\t\t---------------------");
				System.out.println("\t\t\t| LISTA DE PRODUTOS |");
				for(Produto produtos: estoque) {
					System.out.println("---------------------------------------------------------------------------");
					System.out.println(produtos);
				}
				do {
				System.out.println("---------------------------------------------------------------------------");


				System.out.print(" DIGITE O ID DO PRODUTO QUE DESEJA REMOVER: ");
				id = scan.nextInt();
				}while(id > estoque.size());
				estoque.remove((id -1));
				System.out.println("---------------------------------------------------------------------------");										
				
				System.out.println(" O PRODUTO FOI REMOVIDO DA LISTA DE PRODUTOS ");
				System.out.println("---------------------------------------------------------------------------");					
				
			}else {
				
				System.out.println(" NÃO EXISTEM PRODUTOS NO ESTOQUE");
			
			}

		}
		else if(opc == 3) {
			System.out.println("\n\t\t\t---------------------");
			System.out.println("\t\t\t| LISTA DE PRODUTOS |");
			for(Produto produtos: estoque) {
				System.out.println("---------------------------------------------------------------------------");
				System.out.println(produtos);
			}
			System.out.println("---------------------------------------------------------------------------");
		}
		else if(opc == 4) {
			System.out.println("\n\t\t\t---------------------");
			System.out.println("\t\t\t| LISTA DE PRODUTOS |");
			for(Produto produtos: estoque) {
				System.out.println("---------------------------------------------------------------------------");
				System.out.println(produtos);
			}
			System.out.println("---------------------------------------------------------------------------");
			System.out.print(" | DIGITE O ID DO PRODUTO PARA ATUALIZÁ-LO | :  ");
			id = scan.nextInt();
			System.out.println("---------------------------------------------------------------------------");
			System.out.print(" | DIGITE O PREÇO PARA ATUALIZÁ-LO | :  ");
			estoque.get(id-1).setPreco(scan.nextDouble());
			System.out.println("---------------------------------------------------------------------------");
			System.out.println(" PREÇO DO PRODUTO ATUALIZADO");
			System.out.println("---------------------------------------------------------------------------\n");

		}
		else if(opc == 0) {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("\n\t\t SISTEMA FINALIZADO, OBRIGADO PELA PREFERÊNCIA\n");
			System.out.println("---------------------------------------------------------------------------");
		}
		
		else {
			System.out.println(" ---------------");
			System.out.println(" OPÇÃO INVÁLIDA.");
			System.out.println(" ---------------");
		}
		
		}while(opc != 0);
	}
}