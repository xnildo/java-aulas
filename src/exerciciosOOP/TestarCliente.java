package exerciciosOOP;

public class TestarCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(01);
		cliente1.setNome("Maria Pereira");
		cliente1.setCpf("12345678910");
		cliente1.setIdade(25);
		cliente1.setEndereco("Av: Rio Negro, N� 283, Barueri");
		
		System.out.println(cliente1.cadastrarCliente());
		
		System.out.println("ID do Cliente: "+cliente1.getIdCliente());
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("Idade: "+cliente1.getIdade());
		System.out.println("Cpf: "+cliente1.getCpf());
		System.out.println("Endere�o: "+cliente1.getEndereco());
		
		
	}

}
