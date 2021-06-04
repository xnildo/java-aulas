package aula03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade=0, pCalmas=0, pAgressivas=0,pNervosas=0, fem=0, masc=0, outros=0;
		int sexo=0, personalidade=0, qtdPessoas=1, calmasMenor18=0 ;
		int mNervosa=0, hAgressivo=0, outrosCalmo=0, nervosaMaior40=0;
		while(qtdPessoas <= 3) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			System.out.println("------------------------------------------------");
			
			System.out.println("Qual seu sexo?\n[1]:FEMININO       [2]:MASCULINO       [3]:OUTROS");		
			sexo = ler.nextInt();			
			System.out.println("------------------------------------------------");
			
			System.out.println("Qual sua Personalidade?\n[1]:CALMO/A       [2]:NERVOSO/A      [3]:AGRESSIVO/A  ");
			idade = ler.nextInt();
			System.out.println("------------------------------------------------");
			qtdPessoas++;
			
			if(personalidade == 1) {
				pCalmas++;				
			}
			if(personalidade == 1 || sexo ==3) {				
				outrosCalmo++;								
			}
			if(personalidade == 2 || sexo==1) {				
					mNervosa++;
			}
			if(idade >=40 || personalidade == 2) {				
					nervosaMaior40++;
			}									
			if(personalidade == 3 || sexo==1) {				
					hAgressivo++;											
			}
			if(personalidade == 1 || idade < 18) {
				calmasMenor18++;				
			}
			
			
		}
		System.out.println("Nº de Pessoas Calmas: "+pCalmas);
		System.out.println("Nº de Mulheres Nervosas: "+mNervosa);
		System.out.println("Nº de Homens Agressivos: "+hAgressivo);
		System.out.println("Nº de Pessoas de outros Sexos Calmas: "+outrosCalmo);
		System.out.println("Nº de Pessoas Maiores de 40 Nervosas: "+nervosaMaior40);
		System.out.println("Nº de Pessoas Menores de 18 Calmas: "+calmasMenor18);
	}

}
