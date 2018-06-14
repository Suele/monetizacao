package monetizacao;


import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private Cliente cliente;
    private Produto produto;
    private List<Cliente> clientes;
    private List<Produto> produtos;

    public Cadastro() {
        produto = new Produto();
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
    }

    public void oQue(Cliente cliente) {
        this.clientes.add(cliente);

    }

    public void oQue(Produto produto) {
        this.produtos.add(produto);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Cliente> listaDeClientes() {
        if (clientes.isEmpty()) {
            System.out.println("A Lista de Clientes está vazia.");
            return null;
        } else {
            return clientes;
        }

    }

    public List<Produto> produtosCadastrados() {
        return produtos;
    }

}
