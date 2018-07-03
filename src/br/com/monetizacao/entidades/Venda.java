package br.com.monetizacao.entidades;


import java.util.List;

public class Venda {

	private Cliente cliente;
	private Conta conta;
	private Produto produto;
	private List<Produto> produtos;
	private double totalDaVenda;
	private int codigoDaVenda;
	private int quantidade;
	private String data;
	private String hora;

	public Venda(Cliente cliente, Conta conta, Produto produto) {
		this.cliente = cliente;
		this.conta = conta;
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Conta getConta() {
		return conta;
	}

	public Produto getProduto() {
		return produto;
	}

	public double getTotalDaVenda() {
		return totalDaVenda;
	}

	public int getCodigoDaVenda() {
		return codigoDaVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getData() {
		return data;
	}

	public String getHora() {
		return hora;
	}
}
