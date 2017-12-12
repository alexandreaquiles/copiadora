package br.com.caelum.banana;

import java.io.PrintStream;
import java.util.Scanner;

public class CopiaConsole extends Copia {

	@Override
	public void copia(Scanner scanner) {
		PrintStream saida = new PrintStream(System.out);
		imprime(scanner, saida);
	}

}
