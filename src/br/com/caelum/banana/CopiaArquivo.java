package br.com.caelum.banana;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CopiaArquivo extends Copia {

	@Override
	public void copia(Scanner scanner) {
		try (PrintStream saida = new PrintStream("saida.txt")) {
			imprime(scanner, saida);
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao salvar o arquivo.");
		}
	}

}
