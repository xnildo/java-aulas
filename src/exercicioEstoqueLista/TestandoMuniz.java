package exercicioEstoqueLista;

import java.util.ArrayList;
import java.util.Scanner;

public class TestandoMuniz {

	public static void main(String[] args) {
		String simounao;
        Scanner ler = new Scanner(System.in);
		
		String com1 = "Insufici�ncia card�aca";
		String com2 = "Cor-pumonale e Hipertens�o pulmonar";
		String com3 = "Miocardiopatias / Pericardiopatias";
		String com4 = "S�ndrome coronarianas";
		String com5 = "Valvopatias";
		String com6 = "Doen�a de Aorta, dos Grandes Vasos e Fistulas arteriovenosas";
		String com7 = "Cardiopatias cong�nitas no adulto / Cardiopatia hipertensiva";
		String com8 = "Pr�teses valvares e Dispositivos card�acos implantados";	
		String com9 = "Diabetes mellitus";
		String com10 = "Pneumopatias cr�nicas graves";
		String com11 = "Hipertens�o art�ria est�gio 3";
		String com12 = "Hipertens�o est�gios 1 e 2 com les�o e �rg�o alvo";
		String com13 = "Doen�a Cerebrovascular";
		String com14 = "Doen�a renal cr�nica";
		String com15 = "Imunossuprimidos (inclui pacientes oncol�gicos)";
		String com16 = "Anemia falciforme";
		String com17 = "Obesidade m�rbida";
		String com18 = "Cirrose Hep�tica";
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
		System.out.println("Voc� possui alguma dessas comorbidades? [S/N] \n");
		simounao = ler.nextLine();
		
		
			
			if(simounao == "sim") {
				System.out.println("calma");
				 
			}
			else {
				 System.out.println("hjdgbcxhjsgcjks");
			}
			
		
		

	}

}
