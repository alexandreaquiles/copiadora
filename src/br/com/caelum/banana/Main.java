package br.com.caelum.banana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Você quer imprimir no console ou em um arquivo?");
		System.out.println("* C) console");
		System.out.println("  A) arquivo");

		try (Scanner scanner = new Scanner(System.in)) {
			String opcao = scanner.nextLine();
			Saida copiadora = TiposSaida.seleciona(opcao).getCopia();
			copiadora.copia(scanner);
		}
	}

}
