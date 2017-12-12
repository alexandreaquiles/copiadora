package br.com.caelum.banana;

import java.io.PrintStream;
import java.util.Scanner;

public class SaidaConsole extends Saida {

	@Override
	public void copia(Scanner scanner) {
		PrintStream saida = new PrintStream(System.out);
		imprime(scanner, saida);
	}

}
