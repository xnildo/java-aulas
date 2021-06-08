package exerciciosOOP;

public class Funcionario {
	private int id;
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	private int qtdhrExtra;
	private double valorHrExtra;
	
	//DESCONTAR 10% 
	public void desconto() {
		this.salario *= 0.90;
	}
	
	//CALCULAR HR EXTRA NO SALARIO
	public void calcHrExtra() {
		this.salario += (qtdhrExtra*valorHrExtra);
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQtdhrExtra() {
		return qtdhrExtra;
	}
	public void setQtdhrExtra(int qtdhrExtra) {
		this.qtdhrExtra = qtdhrExtra;
	}
	public double getValorHrExtra() {
		return valorHrExtra;
	}
	public void setValorHrExtra(double valorHrExtra) {
		this.valorHrExtra = valorHrExtra;
	}
	
}
