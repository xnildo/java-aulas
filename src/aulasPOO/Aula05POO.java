package aulasPOO;
//M�todos
public class Aula05POO {
	static int num1=100;
	static int num2=200;
	static int soma;
	public static void main(String[] args) {
		
		meuMetodo();
		somar();
		mostrarResultado();
		subtrair(20,10);
		metodo2();
	}
	
	public static void meuMetodo() {
		System.out.println("Eu sou um m�todo.");
	}
	
	public static void somar() {
		soma = num1 + num2;
		System.out.println("Eu sou um m�todo.");
	}
	
	public static void mostrarResultado() {
		
		System.out.println("A soma so n�meros �: "+soma);
	}
	
	public static void subtrair(int num1, int num2) {
		
		int subt = num1 - num2;
		System.out.println("Subtra��o: "+subt);
		
		
	}
	
	public static void metodo2() {
		
		System.out.println("Contando com metodo de fora  ... ");
		System.out.println(TestarMetodo.contador(1, 10));
		
		
	}
}
