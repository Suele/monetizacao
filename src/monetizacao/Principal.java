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
		
	}

}
