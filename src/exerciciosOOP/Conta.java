package exerciciosOOP;

public class Conta {
	
	private String nomeProp;
	private String tipo;
	private double saldo=0;
	
	  //metodo Depositar
	  public void Depositar(double deposito){
	    saldo = saldo + deposito;
	  }
	  
	//metodo Sacar
	  public void Sacar(double saque){
	    saldo = saldo - saque;
	  }
	  
	  //metodo VerSaldo
	  public double VerSaldo(){
	    return saldo;
	  }
	
	  public String getNomeProp() {
		return nomeProp;
	}

	public void setNomeProp(String nomeProp) {
		this.nomeProp = nomeProp;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

}
