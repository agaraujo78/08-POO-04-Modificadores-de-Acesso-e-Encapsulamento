package encapsulamento;

public class Teste02 {

	public static void main(String[] args) {
		
		ContaCorrente contaJoao = new ContaCorrente();
		//contaJoao.cliente = "João da Silva";
		//contaJoao.conta = "12345";
		//contaJoao.agencia = "23";
		//contaJoao.saldo = 1500.00;
		
		contaJoao.setCliente("João da Silva");
		contaJoao.setConta("12345");
		contaJoao.setAgencia("23");
		//contaJoao.setSaldo(1500.00);
		contaJoao.imprimirExtrato();
		
		contaJoao.depositar(100);
		contaJoao.imprimirExtrato();
		
		contaJoao.depositar(100);
		contaJoao.imprimirExtrato();
		
		contaJoao.sacar(100);
		contaJoao.imprimirExtrato();
		
		contaJoao.sacar(1000);
		contaJoao.imprimirExtrato();
	}
}
