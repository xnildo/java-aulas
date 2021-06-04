package aula01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double custoFabrica, custoConsumidor, custoImpostos, custoDistribuidor;
				
		 System.out.print("Digite o valor do carro R$:  "); 
		 custoFabrica = leia.nextDouble();
		 custoDistribuidor =(custoFabrica * 0.45) ;
		 custoImpostos = (custoFabrica * 0.28) ;
		 custoConsumidor = custoImpostos + custoDistribuidor + custoFabrica;
			    
	    System.out.println("Valor de Fábrica R$: "+ custoFabrica); 
	    System.out.println("Porcentual de Impostos R$: "+ custoImpostos); 
	    System.out.println("Porcentual do Distribuidor R$: "+ custoDistribuidor);
	    System.out.println("Valor Final do Veículo para o Consumidor R$: "+ custoConsumidor); 
																			
		leia.close();

	}

}
