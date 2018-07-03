package br.com.monetizacao.teste;

import java.util.Scanner;

import br.com.monetizacao.entidades.Cliente;
import br.com.monetizacao.jdbc.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		// menu
		System.out.println("Por Favor selecione uma opção.");
		System.out.println("1 - cadastro de cliente");
		System.out.println("2 - Visualizar clientes cadastrados");

		int opcao = lerDados.nextInt();

		Cliente cliente = new Cliente();

		// insere os dados no banco
		ClienteDao clienteDao = new ClienteDao();

		switch (opcao) {
		case 1:
			System.out.println("Seja Bem-Vindo ao Cadastro de clientes");
			System.out.println("Digite o nome do cliente: ");
			String nome = lerDados.nextLine();
			cliente.setNome(nome);
		
			System.out.println("Digite o e-mail: ");
			String email = lerDados.nextLine();
			cliente.setEmail(email);

			System.out.println("Digite o CPF: ");
			String cpf = lerDados.nextLine();
			cliente.setCpf(cpf);
			clienteDao.insert(cliente);

			break;
		case 2:
			System.out.println("\n>>>>>>>>> Clientes Cadastrados >>>>>>>>>>>\n");
			clienteDao.select();
			break;

		case 3:
			System.out.println("Deletar Clientes");
			clienteDao.delete(cliente);
			break;

		default:
			System.out.println("Opção Invalida");
			break;
		}

	}

}
