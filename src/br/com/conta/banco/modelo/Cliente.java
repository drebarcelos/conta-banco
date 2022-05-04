package br.com.conta.banco.modelo;

/**
 * Classe que representa a moldura de um cliente
 * @author Andressa Barcelos
 */
public class Cliente {
	private String nome;
	private String cpf;
	
	/**
	 * Construtor para inicializar o objeto Cliente a partir dos atributos nome e cpf;
	 * @param nome
	 * @param cpf
	 */
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Cpf: " + this.cpf;
	}
}