package br.com.conta.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);
	}
	
	@Override
	public String toString() {
		return "ContaPoupança - " + super.toString();
	}
}
