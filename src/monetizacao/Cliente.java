package monetizacao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private Conta conta;
	private Produto produto;
	private List<Produto> produtos;
	private List<Produto> produtosDoCliente = new ArrayList<>();

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

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Produto> listaDeProdutos() {
		return produtos;
	}
	
	public void escolhaProdutoPeloCodigo(int codigo) {
		if (produto.getCodigo() == codigo) {
			produtoEscolhido(produto);
		}else {
			
		}		
	}
	
	public void produtoEscolhido(Produto produto) {
		this.produtosDoCliente.add(produto);
	}
	
	public List<Produto> listaDeProdutosEscolhidos() {
		return produtosDoCliente;

	}


	@Override
	public String toString() {
		return "\nNome: " + this.nome + ", cpf: " + this.cpf + ", Email: " + this.email + "\nConta: " + this.getConta()
				+ "\nProduto: " + this.getProduto() + " ]\n";
	}

}
