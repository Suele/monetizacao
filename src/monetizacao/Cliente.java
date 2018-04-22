package monetizacao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private List<Cliente> clientes;
	private Conta conta;

	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		clientes = new ArrayList<>();
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

	public void cadastrar(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + ", cpf: " + this.cpf + ", Email: " + this.email;
	}

}
