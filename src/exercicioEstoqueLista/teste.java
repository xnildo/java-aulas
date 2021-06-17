package exercicioEstoqueLista;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {
	int qtdProduto, opc = 4, id;
	Scanner scan = new Scanner(System.in);
	ArrayList<Produto> estoque = new ArrayList<>();
	// adicionando produtos no estoque
	estoque.add(new Produto(1, "SSD", "SSD KINGSTON 120GB", 170.50));
	estoque.add(new Produto(2, "SSD", "SSD KINGSTON 240GB", 240.85));
	estoque.add(new Produto(3, "HD", "HD SATA 1TB", 500));
	estoque.add(new Produto(4, "MOUSE", "MOUSE HYPERX", 256.45));

	System.out.println("\n\t\t---------------------------------------------");
	System.out.println("\t\t|  SISTEMA DE ESTOQUE DE PRODUTOS DO NILDO  |");
	System.out.println("\t\t---------------------------------------------");
	do {
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("\n [1] ADICIONAR  [2] REMOVER  [3] VER PRODUTOS  [4] ATUALIZAR PRODUTO  [0] SAIR \n");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print(" [ ESCOLHA UMA DAS OPÇÕES ]: ");
		opc = scan.nextInt();

		if (opc == 1) {
			System.out.print("[ GOSTARIA DE ADICIONAR QUANTOS PRODUTOS ]: ");
			qtdProduto = scan.nextInt();
			System.out.println("--------------------------------------------------------------------------------");
			for (int i = 0; i < qtdProduto; i++) {

				System.out.printf(" DIGITE OS DADOS DO %dº PRODUTO ", (i + 1));

				System.out.println("\n ID PRODUTO: " + (estoque.size() + 1));
				int idProduto = estoque.size() + 1;
				
				
				System.out.print(" CATEGORIA: ");
				String categoria = scan.nextLine();
				scan.nextLine();

				System.out.print(" NOME: ");
				String nome = scan.nextLine();
				
				
				System.out.print(" PREÇO: ");
				double preco = scan.nextDouble();

				estoque.add(new Produto(idProduto, categoria, nome, preco));
				System.out.println(" PRODUTO ADICIONADO COM SUCESSO.");
				System.out.println(
						"--------------------------------------------------------------------------------");

			}
			for (Produto prod : estoque) {
				System.out.println(prod);
			}
		} else if (opc == 2) {
			System.out.println(" EXISTEM " + estoque.size() + " PRODUTOS NO ESTOQUE");
			if (estoque.size() > 0) {

				System.out.println(" DIGITE O ID DO PRODUTO QUE DESEJA REMOVER: ");
				id = scan.nextInt();
				estoque.remove(id);
				for (Produto prod : estoque) {
					if (prod.getIdProduto() == id) {
						System.out.println(" PRODUTO REMOVIDO: " + prod.getNome());
					}

				}

			}

		} else if (opc == 3) {
			System.out.println("\t\t\t---------------------------");
			System.out.println("\t\t\t|     LISTA DE PRODUTOS   |");
			System.out.println("\t\t\t---------------------------");
			for (Produto prod : estoque) {
				System.out.println(
						"--------------------------------------------------------------------------------");
				System.out.println(prod);

			}
			
		} else if (opc == 4) {
			System.out.println("\t\t\t---------------------------");
			System.out.println("\t\t\t|     LISTA DE PRODUTOS   |");
			System.out.println("\t\t\t---------------------------");
			for (Produto prod : estoque) {
				System.out.println(
						"--------------------------------------------------------------------------------");
				System.out.println(prod);

			}
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println(" DIGITE O ID DO PRODUTO PARA ATUALIZÁ-LO");
			System.out.print(" ID PRODUTO: ");
			id = scan.nextInt();
			
			for (Produto prod : estoque) {
				if (prod.getIdProduto() == id) {
					
					System.out.printf(" DIGITE OS DADOS DO PRODUTO ");

					System.out.print(" CATEGORIA: ");
					String categoria = scan.nextLine().toUpperCase();
					scan.nextLine();

					System.out.print(" NOME: ");
					String nome = scan.nextLine().toUpperCase();

					System.out.print(" PREÇO: ");
					double preco = scan.nextDouble();
					
					
					estoque.get(id).setCategoria(categoria);
					estoque.get(id).setNome(nome);
					estoque.get(id).setPreco(preco);
				}
			}
			
			
			
		} else if (opc == 0) {

			System.out.println(" SISTEMA FINALIZADO, OBRIGADO PELA PREFERÊNCIA!");
		} else {
			System.out.println(" OPÇÃO INVÁLIDA.");
		}
	} while (opc != 0);
}
