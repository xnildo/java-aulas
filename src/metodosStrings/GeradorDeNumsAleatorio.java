package metodosStrings;

public class GeradorDeNumsAleatorio {

	public static void main(String[] args) {
		//Math.random() retorna um número aleatório
		//entre 0,0 (inclusivo) e 1,0 (exclusivo):
		System.out.println("Nº de 0,0 a 1,0: "+Math.random());
		
		/*Para obter mais controle sobre o número aleatório,
		 * por exemplo, você deseja apenas um número 
		 * aleatório entre 0 e 100, você pode usar a seguinte fórmula:
		 * int randomNum = (int)(Math.random() * 101);  = 0 to 100
		 */
		System.out.println("Nº de 0 a 100: "+(int)(Math.random() * 101));

	}

}
