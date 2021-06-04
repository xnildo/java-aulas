package aula03;

public class For02 {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;  
		
		for( i=1; i<=20; i+=3) {
			System.out.println(i);
			Thread.sleep(1000);
		}

	}

}
