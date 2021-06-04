package aula01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	     int segundos, minutos, hrs, restSegundos;
	     
	     System.out.print("Digite o tempo do Evendo em segundos: ");
	     segundos = leia.nextInt();
	     
	     hrs = segundos / 360;
	     minutos = (segundos % 360) / 60;
	     restSegundos = (segundos % 360) % 60;
	     		
	     System.out.print("O tempo do Evento na Fabrica foi: "+hrs+ " horas, "
	     +minutos+ " minutos e "+restSegundos+ " segundos");
	     
	     leia.close();

	}

}
