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
		p3.setNome("CÔøΩmera Digital Gopro");
		p3.setPreco(1350.0);
		p3.setCodigo(3333);
		p3.setQuantidade(1);

		Produto p4 = new Produto();
		p4.setNome("Leitor de CÔøΩdigo de Barras Laser");
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
				"------------------------------------------------------------------------------------------------");
		System.out.println(
				">>>>>>>>>>>>>>> Por Favor Digite qualquer n√∫mero inteiro para que apare√ßa o menu >>>>>>>>>>>>>>>");
		System.out.println(
				"------------------------------------------------------------------------------------------------");

		Cliente cliente1 = null;
		Conta conta = new Conta(1111, 1000.0, cliente1);
		cliente1 = new Cliente("Maria", "1111111111", "maria@gmail.com", conta);
		cliente1.escolherProduto(55555, p5);

		Cliente cliente2 = null;
		Conta conta1 = new Conta(2222, 2000.0, cliente2);
		cliente2 = new Cliente("Pedro", "2222222222", "pedro@gmail.com", conta1);

		Cliente cliente3 = null;
		Conta conta3 = new Conta(3333, 3000.0, cliente3);
		cliente3 = new Cliente("Jos√©", "3333333333", "jose@gmail.com", conta3);

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

		Scanner menuP = new Scanner(System.in);
		int menuPrincipal = menuP.nextInt();

		

		while (menuPrincipal != 5 && menuPrincipal < 5 && menuPrincipal > 0) {

			Cliente cliente = null;
			Conta conta6 = null;
			Produto produto = null;
			Venda venda = null;

			System.out.println("");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>  Por Favor Escolha uma Op√ß√£o >>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(" 1 - Cadastro de Clientes ");
			System.out.println(" 2 - Cadastro de Produtos ");
			System.out.println(" 3 - Venda ");
			System.out.println(" 4 - Relat√≥rios ");
			System.out.println(" 5 - Sa√≠r ");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");

			Scanner dados1 = new Scanner(System.in);
			int subMenu = dados1.nextInt();

			if (subMenu == 1) {
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------");
				System.out.println(">>>>>>>>>>>>>>>>>  Voc√™ est√° na op√ß√£o Cadastro de Clientes  >>>>>>>>>>>>>>>>>>");
				System.out.println("------------------------------------------------------------------------------");
				System.out.println(" 1 - Cadastro ");
				System.out.println(" 2 - Visualizar Clientes Cadastrados ");
				System.out.println("------------------------------------------------------------------------------");

				Scanner dados = new Scanner(System.in);
				Scanner dadosSubMenuDoSub1 = new Scanner(System.in);
				int subMenuDoSub = dadosSubMenuDoSub1.nextInt();

				if (subMenuDoSub == 1) {
					// declara√ßao das variaveis
					String nome = null;
					String cpf = null;
					String email = null;
					int numero = 0;
					double saldo = 0.0;
					
					// mostra mensagem e atribui valores para as variaveis
					System.out.print("\nNome: ");
					nome = dados.nextLine();
					System.out.print("\nCPF: ");
					cpf = dados.nextLine();
					System.out.print("\nEmail: ");
					email = dados.nextLine();
					System.out.print("\nN√∫mero: ");
					numero = dados.nextInt();
					System.out.print("\nSaldo: ");
					saldo = dados.nextDouble();

					// instancia os objetos
					conta6 = new Conta(numero, saldo, cliente);
					cliente = new Cliente(nome, cpf, email, conta6);

					// adiciona o cliente no arrayList
					cadastro.oQue(cliente);
				}
				if (subMenuDoSub == 2) {
					System.out.println("");
					System.out.println("------------------------------------------------------------------------------");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>> Clientes cadastrados >>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("------------------------------------------------------------------------------");
					System.out.println(cadastro.listaDeClientes());
				}

			} else if (subMenu == 2) {
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------");
				System.out.println(">>>>>>>>>>>>>>>>>>> VocÍ est· na opÁ„o Cadastro de Produtos  >>>>>>>>>>>>>>>>>");
				System.out.println("------------------------------------------------------------------------------");
				System.out.println(" 1 - Cadastro ");
				System.out.println(" 2 - Visualizar Produtos Cadastrados ");
				System.out.println("------------------------------------------------------------------------------");

				Scanner dados2 = new Scanner(System.in);
				int subMenuDoSub2 = dados2.nextInt();
				if (subMenuDoSub2 == 1) {

					produto = new Produto();

					System.out.print("Nome: ");
					String nome = dados2.nextLine();
					produto.setNome(nome);

					System.out.print("CÛdigo: ");
					int codigo = dados2.nextInt();
					produto.setCodigo(codigo);

					System.out.print("PreÁo: ");
					double preco = dados2.nextDouble();
					produto.setPreco(preco);

					System.out.println("Quantidade: ");
					int quantidade = dados2.nextInt();
					produto.setQuantidade(quantidade);
					
					//adiciona um produto na lista de produto
					cadastro.oQue(produto);
				}
				if(subMenuDoSub2 == 2) {
					System.out.println("");
					System.out.println("------------------------------------------------------------------------------");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>> Produtos Cadastrados >>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("------------------------------------------------------------------------------");
					System.out.println(cadastro.produtosCadastrados());
					
				}

			} else if (subMenu == 3) {
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>  VocÍ est· na OpÁ„o Vendas  >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("------------------------------------------------------------------------------");
				System.out.println(" 1 - Deposito ");
				System.out.println(" 2 - Transferencia ");
				System.out.println(" 3 - Vendas ");
				System.out.println("------------------------------------------------------------------------------");

				Scanner dados3 = new Scanner(System.in);
				int subMenuDoSub3 = dados3.nextInt();
				
				if(subMenuDoSub3 == 1) {
					System.out.println("");
					System.out.println("------------------------------------------------------------------------------");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Deposito  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("------------------------------------------------------------------------------");
					
				}
				if(subMenuDoSub3 == 2) {
					System.out.println("");
					System.out.println("------------------------------------------------------------------------------");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Transferencia  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("------------------------------------------------------------------------------");
					
				}
				
				if(subMenuDoSub3 == 3) {
					System.out.println("");
					System.out.println("------------------------------------------------------------------------------");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Vendas  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("------------------------------------------------------------------------------");
					
				}
				
				
			} else if (subMenu == 4) {
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>  VocÍ est· na OpÁ„o RelatÛrios >>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("------------------------------------------------------------------------------");
			} else if (subMenu >= 5) {
				System.out.println("Saindo");
				break;
			}

		}

	}

}
