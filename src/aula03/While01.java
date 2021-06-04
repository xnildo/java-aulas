package aula03;

public class While01 {

	public static void main(String[] args) throws InterruptedException {
		int num = 10;
		
		while(num >0) {
			System.out.println("Contando..."+num);
			num--;
			//esperar um segundo
			Thread.sleep(1000);
		}

	}

}
