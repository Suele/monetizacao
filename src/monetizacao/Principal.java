package monetizacao;

public class Principal {
	public static void main(String[] args) {

		Cliente cliente1 = null;
		Conta conta = new Conta(1111, 1300.0, cliente1);
		cliente1 = new Cliente("Maria", "111111111", "maria@gmail.com", conta);

		Cliente cliente2 = null;
		Conta conta1 = new Conta(2222, 1000.0, cliente2);
		cliente2 = new Cliente("Pedro", "2222222", "pedro@gmail.com", conta1);

		Cadastro cadastro = new Cadastro();
		cadastro.oQue(cliente1);
		cadastro.oQue(cliente2);

		System.out.println(cadastro.listaDeClientes());

		System.out.println(conta.transferePara(conta1, 120, conta));

		System.out.println(cadastro.listaDeClientes());

		System.out.println("");

		Produto p1 = new Produto();
		p1.setNome("TV LED 40");
		p1.setPreco(2999.0);
		p1.setCodigo(12345);
		p1.setQuantidade(2);

		Produto p2 = new Produto();
		p2.setNome("Cafeteira");
		p2.setPreco(89.0);
		p2.setCodigo(32321);
		p2.setQuantidade(1);
		
		cadastro.oQue(p1);
		cadastro.oQue(p2);

		cliente1.setProduto(p1);
		cliente2.setProduto(p2);
		
		System.out.println(cadastro.listaDeClientes());

		System.out.println("");
		
		System.out.println(cadastro.produtosCadastrados());
	}

}
