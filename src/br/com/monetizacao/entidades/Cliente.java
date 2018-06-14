package br.com.monetizacao.entidades;

import monetizacao.Conta;

public class Cliente {

	private Integer id;
	private String cpf;
	private String email;
	private Conta conta;

	public Integer getId() {
		return id;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
