package metodosStrings;

public class GeradorDeNumsAleatorio {

	public static void main(String[] args) {
		//Math.random() retorna um n�mero aleat�rio
		//entre 0,0 (inclusivo) e 1,0 (exclusivo):
		System.out.println("N� de 0,0 a 1,0: "+Math.random());
		
		/*Para obter mais controle sobre o n�mero aleat�rio,
		 * por exemplo, voc� deseja apenas um n�mero 
		 * aleat�rio entre 0 e 100, voc� pode usar a seguinte f�rmula:
		 * int randomNum = (int)(Math.random() * 101);  = 0 to 100
		 */
		System.out.println("N� de 0 a 100: "+(int)(Math.random() * 101));

	}

}
