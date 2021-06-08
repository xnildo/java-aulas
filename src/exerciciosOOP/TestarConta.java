package exerciciosOOP;

import java.util.Scanner;

public class TestarConta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao;
		Conta conta1= new Conta();

	    System.out.println("-------------Criando Conta-------------");
	    
	    System.out.print("Digite o nome:  ");
	    conta1.setNomeProp(scan.nextLine());
	    
	    System.out.print("Digite o Tipo da conta:  ");
	    conta1.setTipo(scan.nextLine());
	    
	    System.out.print("Deseja fazer Depósito? [1]SIM / [2]NÃO  ");
	    opcao = scan.nextInt();
	    
	    if(opcao == 1 ) {
	    	System.out.print("Digite o Valor R$: ");
	    	conta1.Depositar(scan.nextDouble());
	    }
	    else {
	    	System.out.printf("\nSaldo Atual R$:%.2f ",conta1.VerSaldo());
	    }
	    	    
	    conta1.Depositar(1000.00);
	    System.out.println("Depósito Efetuado com Sucesso.");

	    System.out.printf("Saldo Atual R$:%.2f ",conta1.VerSaldo());
	    	    
	    System.out.println("\nSaque Efetuado com Sucesso.");
	    conta1.Sacar(450);

	    System.out.println("Saldo: R$ " +conta1.VerSaldo()); 
	    System.out.println("--------------------------------------------------------");
	    System.out.println("\t\tInformações da Conta");
	    System.out.printf("\nProprietário: %s",conta1.getNomeProp());
	    System.out.printf("\nTipo de Conta: %s", conta1.getTipo());
	    System.out.printf("\nSaldo Atual: R$%.2f ", conta1.VerSaldo());
	    

	}

}
