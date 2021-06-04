package aula03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, sexo, humor, qtdP=0 ;
		
		int pCalma=0,mulhereNervosa=0, homemAgressivo=0,outrosCalmo=0;
		
		int nervosaMaior40=0,calmasMenor18=0 ;
		
		while(qtdP <= 6) {
			System.out.println("------------------------------------------------");
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			
			System.out.println("Qual seu sexo?\n[1]:FEMININO       [2]:MASCULINO       [3]:OUTROS");		
			sexo = ler.nextInt();			
			
			
			System.out.println("Qual sua Personalidade?\n[1]:CALMO/A       [2]:NERVOSO/A      [3]:AGRESSIVO/A  ");
			humor = ler.nextInt();
						
			
			if(humor == 1) {
				pCalma++;	//pessoas calmas			
			}
			if(sexo == 1 && humor == 2  ) {				
				mulhereNervosa++;	//mulheres nervosas							
			}
			if(sexo==2 &&  humor == 3  ) {				
				homemAgressivo++;  //homens agressivos
			}									
			if(humor == 1 && sexo==3) {				
				outrosCalmo++;	//pessoas de outros sexo calmas										
			}
			if(humor == 2 && idade > 40) {
				nervosaMaior40++;	//pessoas nervosas com mais de 40 anos			
			}
			if(humor == 1 && idade < 18) {
				calmasMenor18++;	//pessoas calmas menores de 18 anos			
			}
			qtdP++;
			
			
		}
		System.out.println("------------------------------------------------");
		System.out.println("Nº de Pessoas Calmas: "+pCalma);
		System.out.println("------------------------------------------------");
		System.out.println("Nº de Mulheres Nervosas: "+mulhereNervosa);
		System.out.println("------------------------------------------------");
		System.out.println("Nº de Homens Agressivos: "+homemAgressivo);
		System.out.println("------------------------------------------------");
		System.out.println("Nº de Pessoas de outros Sexos Calmas: "+outrosCalmo);
		System.out.println("------------------------------------------------");
		System.out.println("Nº de Pessoas Maiores de 40 Nervosas: "+nervosaMaior40);
		System.out.println("------------------------------------------------");
		System.out.println("Nº de Pessoas Menores de 18 Calmas: "+calmasMenor18);
		System.out.println("------------------------------------------------");
	}

}
