package exercicioEstoqueLista;

import java.util.ArrayList;
import java.util.Scanner;

public class TestandoMuniz {

	public static void main(String[] args) {
		String simounao;
        Scanner ler = new Scanner(System.in);
		
		String com1 = "Insuficiência cardíaca";
		String com2 = "Cor-pumonale e Hipertensão pulmonar";
		String com3 = "Miocardiopatias / Pericardiopatias";
		String com4 = "Síndrome coronarianas";
		String com5 = "Valvopatias";
		String com6 = "Doença de Aorta, dos Grandes Vasos e Fistulas arteriovenosas";
		String com7 = "Cardiopatias congênitas no adulto / Cardiopatia hipertensiva";
		String com8 = "Próteses valvares e Dispositivos cardíacos implantados";	
		String com9 = "Diabetes mellitus";
		String com10 = "Pneumopatias crônicas graves";
		String com11 = "Hipertensão artéria estágio 3";
		String com12 = "Hipertensão estágios 1 e 2 com lesão e órgão alvo";
		String com13 = "Doença Cerebrovascular";
		String com14 = "Doença renal crônica";
		String com15 = "Imunossuprimidos (inclui pacientes oncológicos)";
		String com16 = "Anemia falciforme";
		String com17 = "Obesidade mórbida";
		String com18 = "Cirrose Hepática";
		String com19 = "HIV";
	
		ArrayList<String> comorb = new ArrayList<>();
		comorb.add(com19);
		comorb.add(com18);
		comorb.add(com17);
		comorb.add(com16);
		comorb.add(com15);
		comorb.add(com14);
		comorb.add(com13);
		comorb.add(com12);
		comorb.add(com11);
		comorb.add(com10);
		comorb.add(com9);
		comorb.add(com8);
		comorb.add(com7);
		comorb.add(com6);
		comorb.add(com5);
		comorb.add(com4);
		comorb.add(com3);
		comorb.add(com2);
		comorb.add(com1);
		
		for(int i = 0; i < comorb.size(); i++) {
			System.out.println(comorb.get(i));
		}
		System.out.println("Você possui alguma dessas comorbidades? [S/N] \n");
		simounao = ler.nextLine();
		
		
			
			if(simounao == "sim") {
				System.out.println("calma");
				 
			}
			else {
				 System.out.println("hjdgbcxhjsgcjks");
			}
			
		
		

	}

}
