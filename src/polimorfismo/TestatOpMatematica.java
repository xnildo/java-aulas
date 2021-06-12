package polimorfismo;

public class TestatOpMatematica {
	
	//Fazendo Polimorfismo
	public static void calcularOperacao(OpeMatematica op, double x, double y) {
		System.out.println(op.calcular(x, y));
		
	}
	

	public static void main(String[] args) {
			
		calcularOperacao(new Soma(), 20, 30);
		calcularOperacao(new Multiplicacao(), 2, 8);

	}
		
}
