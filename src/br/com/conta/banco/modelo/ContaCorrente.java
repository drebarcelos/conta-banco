package br.com.conta.banco.modelo;

public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);
	}

	@Override
	public String toString() {
		return "ContaCorrente - " + super.toString();
	}
}
