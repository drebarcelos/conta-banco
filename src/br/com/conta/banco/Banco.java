package br.com.conta.banco;

import java.util.Scanner;

import br.com.conta.banco.modelo.Cliente;
import br.com.vacinometro.modelo.Tutor;

public class Banco {
	private static final Scanner SCANNER = new Scanner(System.in);
	private static final int OPCAO_INICIAL = 1;
	private static final int OPCAO_SAIR = 0;
	
	public void iniciar() {
		int opcao = OPCAO_INICIAL;
		
		while(opcao != OPCAO_SAIR) {
			imprimeMenu();
			opcao = getOpcaoDigitada();
			SCANNER.nextLine();
			executaOpcaoEscolhida(opcao);
		}
	}
	
	private void imprimeMenu() {
		System.out.println("\nDigite (0) para sair do MENU");
		System.out.println("Digite (1) para criar uma conta");
		System.out.println("Digite (2) para visualizar seu saldo");
		System.out.println("Digite (3) para transferir");
		System.out.println("Digite (4) para depositar");
		System.out.println("Digite (5) para excluir sua conta");
	}
	
	private int getOpcaoDigitada() {
		return SCANNER.nextInt();
	}
	
	private void executaOpcaoEscolhida(int opcao) {
		switch(opcao) {
			case 0:
				sair();
				break;
			case 1:
				criarConta();
				break;
		}
	}
	
	private void sair() {
		System.out.println("Programa finalizado com sucesso!");
		System.exit(OPCAO_SAIR);
	}
	
	private void criarConta() {
		imprimeOpcoesConta();
		int opcaoConta = getOpcaoDigitada();
		SCANNER.nextLine();
		switch(opcaoConta) {
			case 1:
				cadastrarCliente();
				break;
		}
	}
	
	private void imprimeOpcoesConta() {
		System.out.println("Digite (1) para criar uma conta corrente");
		System.out.println("Digite (2) para criar uma conta poupança");
	}
	
	private void cadastrarCliente() {
		String nome = capturaNomeCliente();
		String cpf = capturaCpfCliente();
		Cliente cliente = criaNovoCliente(nome, cpf);
	}
	
	private String capturaNomeCliente() {
		System.out.println("Digite seu nome: ");
		return SCANNER.nextLine();
	}
	
	private String capturaCpfCliente() {
		System.out.println("Digite seu cpf: ");
		return SCANNER.nextLine();
	}
	private Cliente criaNovoCliente(String nome, String cpf) {
		return new Cliente(nome, cpf);
	}
}
