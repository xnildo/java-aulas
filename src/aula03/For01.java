package aula03;

public class For01 {

	public static void main(String[] args) throws InterruptedException {
		int num = 20, soma = 0;  
		
		for(int i=0; soma<=num; i++) {
			System.out.print("Soma: "+i+" + "+soma+" = ");
			soma += i;
			System.out.println(soma);
			Thread.sleep(1000);
		}

	}

}
