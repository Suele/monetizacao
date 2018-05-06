package monetizacao;

public class Principal {
	public static void main(String[] args) {

		Cliente cliente1 = null;
		Conta conta = new Conta(1111, 1000.0, cliente1);
		cliente1 = new Cliente("Maria", "1111111111", "maria@gmail.com", conta);

		Cliente cliente2 = null;
		Conta conta1 = new Conta(2222, 2000.0, cliente2);
		cliente2 = new Cliente("Pedro", "2222222222", "pedro@gmail.com", conta1);

		Cliente cliente3 = null;
		Conta conta3 = new Conta(3333, 3000.0, cliente3);
		cliente3 = new Cliente("José", "3333333333", "jose@gmail.com", conta3);

		Cliente cliente4 = null;
		Conta conta4 = new Conta(4444, 4000.0, cliente4);
		cliente4 = new Cliente("Fernanda", "4444444444", "fernanda@gmail.com", conta4);

		Cliente cliente5 = null;
		Conta conta5 = new Conta(5555, 5000.0, cliente5);
		cliente5 = new Cliente("Bernardo", "5555555555", "bernardo@gmail.com", conta5);

		Cadastro cadastro = new Cadastro();
		cadastro.oQue(cliente1);
		cadastro.oQue(cliente2);
		cadastro.oQue(cliente3);
		cadastro.oQue(cliente4);
		cadastro.oQue(cliente5);

		Produto p1 = new Produto();
		p1.setNome("TV LED 40");
		p1.setPreco(2999.0);
		p1.setCodigo(0001);
		p1.setQuantidade(1);

		Produto p2 = new Produto();
		p2.setNome("Cafeteira");
		p2.setPreco(89.0);
		p2.setCodigo(0002);
		p2.setQuantidade(1);

		Produto p3 = new Produto();
		p3.setNome("Câmera Digital Gopro");
		p3.setPreco(1350.0);
		p3.setCodigo(0003);
		p3.setQuantidade(1);

		Produto p4 = new Produto();
		p4.setNome("Leitor de Código de Barras Laser");
		p4.setPreco(120.0);
		p4.setCodigo(0004);
		p4.setQuantidade(1);

		Produto p5 = new Produto();
		p5.setNome("Video Porteiro");
		p5.setPreco(500.0);
		p5.setCodigo(0005);
		p5.setQuantidade(1);

		cadastro.oQue(p1);
		cadastro.oQue(p2);
		cadastro.oQue(p3);
		cadastro.oQue(p4);
		cadastro.oQue(p5);
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

		cliente1.setProduto(p1);
		cliente2.setProduto(p2);

		System.out.println(cadastro.listaDeClientes());

		System.out.println(conta.transferePara(conta1, 120, conta));

		System.out.println(cadastro.listaDeClientes());

		System.out.println("");

		System.out.println("Lista de Tudo");
		System.out.println(cadastro.listaDeClientes());

		System.out.println("");

		System.out.println("Lista de Produtos");
		System.out.println(cadastro.produtosCadastrados());

		cliente1.escolhaProdutoPeloCodigo(12345);

		System.out.println(cliente1.listaDeProdutosEscolhidos());
	}

}
