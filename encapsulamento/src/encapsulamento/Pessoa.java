package encapsulamento;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade; 
	
	public void inserirNome(String n) {
		nome = n;
	}
	public void inserirCpf(String c) {
		cpf = c;		
	}
	public void inserirIdade(int i) {
		if (i >= 1 && i <= 125) {
		  idade = i;
		}else {
			System.out.println("ERRO: Idade acima de 125 anos");
		}
	}
	
	public String obterNome() {
		return nome;
	}
	
	
	public String obterCpf() {
		return cpf;	
	}
	
	public int obterIdade() {
		return idade;
	}
}
