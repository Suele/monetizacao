package monetizacao;

public class Conta {

	private int numero;
	private double saldo;
	private Cliente cliente;

	public Conta(int numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo = this.saldo + valor;
			return true;
		} else {
			System.out.println("O Valor do deposito é inválido!!!");
			return false;
		}
	}

	public double transferePara(Conta minhaConta, Conta outraConta, double valor) {

		valor = minhaConta.getSaldo() - valor;
		return valor;
	}

	@Override
	public String toString() {
		return "Número da conta " + getNumero() + ", Saldo: " + getSaldo();
	}

}
