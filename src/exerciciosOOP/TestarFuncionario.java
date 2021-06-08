package exerciciosOOP;

public class TestarFuncionario {

	public static void main(String[] args) {
		Funcionario funcio1 = new Funcionario();
		funcio1.setId(1);
		funcio1.setNome("João Guilerme");
		funcio1.setIdade(29);
		funcio1.setCargo("Desenvolvedor Web Java Jr ");
		funcio1.setSalario(5000);
		funcio1.setQtdhrExtra(14);
		funcio1.setValorHrExtra(20);
		
		System.out.printf("---------------RELATÓRIO DO FUNCIONÁRIO-----------------");
		System.out.printf("\nFuncionário: %s",funcio1.getNome());
		
		System.out.printf("\nSalário R$: %.2f",funcio1.getSalario());
		
		funcio1.desconto();//DESCONTO NO SALÁRIO
		System.out.println("\nSalário com 10% de Desconto: "+funcio1.getSalario());
		
		System.out.printf("Horas Extras: %d",funcio1.getQtdhrExtra());
		
		System.out.printf("\nValor Hora Extra R$: %.2f",funcio1.getValorHrExtra());
		
		funcio1.calcHrExtra();
		System.out.printf("\nSalário com Horas Extras: %.2f\n",funcio1.getSalario());
			
		System.out.println("---------------------------------------------------------");
	}

}
