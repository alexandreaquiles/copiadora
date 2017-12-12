package br.com.caelum.copiadora;

import java.util.Scanner;

import br.com.caelum.copiadora.entrada.TiposEntrada;
import br.com.caelum.copiadora.saida.TiposSaida;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Você quer ler do console ou de um arquivo?");
			System.out.println("* C) console");
			System.out.println("  A) arquivo");

			String opcaoEntradda = scanner.nextLine();
			Entrada entrada = TiposEntrada.seleciona(opcaoEntradda).getEntrada();

			System.out.println("Você quer imprimir no console ou em um arquivo?");
			System.out.println("* C) console");
			System.out.println("  A) arquivo");

			String opcao = scanner.nextLine();
			Saida saida = TiposSaida.seleciona(opcao).getSaida();
			
			Copiadora copiadora = new Copiadora(entrada, saida);
			copiadora.copia();
		}
	}

}
