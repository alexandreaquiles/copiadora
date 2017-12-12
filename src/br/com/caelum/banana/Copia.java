package br.com.caelum.banana;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Copia {
	
	private Scanner scanner;

	public Copia(Scanner scanner) {
		this.scanner = scanner;
	}

	public void copia(String opcao) {
		if ("C".equals(opcao)) {
			PrintStream saida = new PrintStream(System.out);
			imprime(scanner, saida);
		} else if ("A".equals(opcao)) {
			try (PrintStream saida = new PrintStream("saida.txt")) {
				imprime(scanner, saida);
			} catch (FileNotFoundException e) {
				System.out.println("Erro ao salvar o arquivo.");
			}

		} else {
			System.out.println("Opção inválida. Tente novamente mais tarde.");
		}

	}

	private void imprime(Scanner scanner, PrintStream saida) {
		System.out.println("Pode digitar:");
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if ("exit".equals(line)) {
				break;
			} else {
				saida.println(line);
			}
		}
	}

}
