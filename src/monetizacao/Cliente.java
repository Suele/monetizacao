package monetizacao;

import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private Conta conta;
	private List<Produto> produtos;

	public Cliente() {
	}

	public Cliente(String nome, String cpf, String email, Conta conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public Conta getConta() {
		return conta;
	}

	public List<Produto> listaDeProdutos() {
		return produtos;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", cpf: " + this.cpf + ", Email: " + this.email + "\nConta: " + this.getConta();
	}

}
