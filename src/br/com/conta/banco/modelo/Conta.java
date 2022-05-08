package br.com.conta.banco.modelo;

import java.util.Objects;

/**
 * Classe que representa a moldura de uma conta
 * @author Andressa Barcelos
 */
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero;
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero, Cliente titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	

	public void saca(double valor){
		if(this.saldo < valor) {
			throw new RuntimeException("Saldo: " + this.saldo + ", Valor: " + valor);
		} 
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino){
			this.saca(valor);
			destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero, saldo, titular);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return agencia == other.agencia && numero == other.numero
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
				&& Objects.equals(titular, other.titular);
	}

	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
}
