package encapsulamento;

public class ContaCorrente {
	private String cliente;
	private String conta;
	private String agencia;
	private double saldo;
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
/*	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	public void sacar(double valor) {
		if (this.saldo >= valor) {
		this.saldo = this.saldo - valor;
		}else {
			System.out.println("ERRO: Saldo insuficiente!");
					}
	}
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	//--------------------------------------
	public String getCliente() {
		return this.cliente;
	}
	public String getConta() {
		return this.conta;
	}
	public String getAgencia() {
		return this.agencia;
	}
 	public double getSaldo() {
 		return this.saldo;
	} 
	
 	public void imprimirExtrato() {
 		System.out.printf("CLIENTE : %s\n" , this.cliente);
		System.out.printf("AGENCIA : %s\n" , this.agencia);
		System.out.printf("CONTA   : %s\n" , this.conta);
		System.out.printf("SALDO   : R$%.2f\n\n" , this.saldo);
 	}
 	
}
