package br.com.caelum.banana;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Você quer que imprime no console ou em um arquivo?");
		System.out.println("* C) console");
		System.out.println("  A) arquivo");

		try (Scanner scanner = new Scanner(System.in)) {
			String opcao = scanner.nextLine();
			if ("C".equals(opcao)) {
				System.out.println("Pode digitar:");
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					if ("exit".equals(line)) {
						break;
					} else {
						System.out.println(line);
					}
				}
			} else if ("A".equals(opcao)) {
				System.out.println("Pode digitar:");
				try(PrintStream saida = new PrintStream("saida.txt")){
					while (scanner.hasNextLine()) {
						String line = scanner.nextLine();
						if ("exit".equals(line)) {
							break;
						} else {
							saida.println(line);
						}
					}
				} catch (FileNotFoundException e) {
					System.out.println("Erro ao salvar o arquivo.");
				}
				
			} else {
				System.out.println("Opção inválida. Tente novamente mais tarde.");
			}

		}
	}
}