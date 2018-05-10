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

	public Produto escolherProduto(int codigoDoProduto, Produto produto) {
		if(produto.getCodigo() == codigoDoProduto) {
			return produto;
		}else {
			System.out.println("Produto não encontrado");
			return null;
		}
	}

	public boolean produtoEscolhido(Produto produto) {
		return this.produtosDoCliente.add(produto);
	}

	public List<Produto> listaDeProdutosEscolhidos() {
		return produtosDoCliente;

	}

	@Override
	public String toString() {
		if (this.getProduto() != null) {
			return "\nNome: " + this.nome + ", cpf: " + this.cpf + ", Email: " + this.email + "\nConta: "
					+ this.getConta() + "\nProduto: " + this.getProduto() + " ]\n";
		} else {
			return "\nNome: " + this.nome + ", cpf: " + this.cpf + ", Email: " + this.email + "\nConta: "
					+ this.getConta() + "\nProduto: " + "Nenhum produto adicionado" + " ]\n";
		}
	}

}
