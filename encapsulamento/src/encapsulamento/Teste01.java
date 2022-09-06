package encapsulamento;

public class Teste01 {

	public static void main(String[] args) {
		
		Pessoa joao  = new Pessoa ();
		
		//joao.nome = "João da Silva";
		//joao.cpf = "111.222.333-44";
		//joao.idade = 35;
		
		joao.inserirNome("João da Silva");
		
		joao.inserirCpf("111.222.333-44");
		
		joao.inserirIdade(30);
		
		System.out.println(joao.obterNome());
		System.out.println(joao.obterCpf());
		System.out.println(joao.obterIdade());
	}
}
