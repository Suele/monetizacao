package monetizacao;

public class Principal {
	public static void main(String[] args) {

		Cliente cliente = new Cliente("Maria", "01010101010", "maria@gmail.com");
		cliente.cadastrar(cliente);
		System.out.println(cliente.getClientes());

		Conta conta = new Conta(123, 1500.0);
		cliente.setConta(conta);

		System.out.println("Conta: " + cliente.getConta());
		
		
	}

}
