package br.com.conta.banco;

import java.util.Scanner;

public class Banco {
	private static final Scanner SCANNER = new Scanner(System.in);
	
	public void iniciar() {
		imprimeMenu();
		int opcao = getOpcaoDigitada();
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
}
