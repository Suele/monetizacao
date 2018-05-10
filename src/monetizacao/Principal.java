package monetizacao;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.setNome("TV LED 40");
		p1.setPreco(2999.0);
		p1.setCodigo(1111);
		p1.setQuantidade(1);

		Produto p2 = new Produto();
		p2.setNome("Cafeteira");
		p2.setPreco(89.0);
		p2.setCodigo(2222);
		p2.setQuantidade(1);

		Produto p3 = new Produto();
		p3.setNome("Câmera Digital Gopro");
		p3.setPreco(1350.0);
		p3.setCodigo(3333);
		p3.setQuantidade(1);

		Produto p4 = new Produto();
		p4.setNome("Leitor de Código de Barras Laser");
		p4.setPreco(120.0);
		p4.setCodigo(4444);
		p4.setQuantidade(1);

		Produto p5 = new Produto();
		p5.setNome("Video Porteiro");
		p5.setPreco(500.0);
		p5.setCodigo(5555);
		p5.setQuantidade(1);

		Cadastro cadastro = new Cadastro();

		cadastro.oQue(p1);
		cadastro.oQue(p2);
		cadastro.oQue(p3);
		cadastro.oQue(p4);
		cadastro.oQue(p5);

		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		System.out.println("Lista de Produtos\n");
		System.out.println(cadastro.produtosCadastrados());

		System.out.println(
				"------------------------------------------------------------------------------------------------");

		Cliente cliente1 = null;
		Conta conta = new Conta(1111, 1000.0, cliente1);
		cliente1 = new Cliente("Maria", "1111111111", "maria@gmail.com", conta);
		cliente1.escolherProduto(55555, p5);
		cliente1.listaDeProdutosEscolhidos();

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

		cadastro.oQue(cliente1);
		cadastro.oQue(cliente2);
		cadastro.oQue(cliente3);
		cadastro.oQue(cliente4);
		cadastro.oQue(cliente5);

		System.out.println("");
		System.out.println("Lista de Clientes\n");
		System.out.println(cadastro.listaDeClientes());
		
		Scanner menuP = new Scanner(System.in);
		int menuPrincipal = menuP.nextInt();
		int subMenu = 0;
		
		while (menuPrincipal != 5 && menuPrincipal < 5 && menuPrincipal > 0) {
			
			Cliente cliente = null;
			Conta conta6 = null;
			

			System.out.println("");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>  Por Favor Escolha uma opção  >>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(" 1 - Cadastro de Clientes ");
			System.out.println(" 2 - Cadastro de Produtos ");
			System.out.println(" 3 - Venda ");
			System.out.println(" 4 - Relatórios ");
			System.out.println(" 5 - Saír ");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");

			System.out.println("");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>  Você está na opção Cadastro de Clientes  >>>>>>>>>>>>>>>>>>");
			System.out.println("------------------------------------------------------------------------------");

			Scanner dados = new Scanner(System.in);
			

			System.out.print("\nNome: ");
			String nome = dados.nextLine();
			System.out.print("\nCPF: ");
			String cpf = dados.nextLine();
			System.out.print("\nEmail: ");
			String email = dados.nextLine();

			System.out.print("\nNúmero: ");
			int numero = dados.nextInt();

			 Scanner lerDados = new Scanner(System.in);
			
			System.out.print("\nSaldo: ");
			double saldo = lerDados.nextDouble();

			conta6 = new Conta(numero, saldo, cliente);
			cliente = new Cliente(nome, cpf, email, conta6);
			
			System.out.println(cliente);
			System.out.println(conta6);

			
		}
		
	}

}
