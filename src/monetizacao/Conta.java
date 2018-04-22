package monetizacao;

public class Conta {

	private int numero;
	private double saldo;
	private Cliente cliente;

	public Conta() {

	}

	public Conta(int numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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

	@Override
	public String toString() {
		return "Número da conta " + getNumero() + ", Saldo: " + getSaldo();
	}

}
