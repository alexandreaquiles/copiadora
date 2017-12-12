package br.com.caelum.banana;

import java.io.PrintStream;
import java.util.Scanner;

public abstract class Copia {
	
	public abstract void copia(Scanner scanner);

	protected void imprime(Scanner scanner, PrintStream saida) {
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
