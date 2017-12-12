package br.com.caelum.copiadora.entrada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import br.com.caelum.copiadora.Entrada;

public class EntradaArquivo implements Entrada {

	private Scanner scanner;

	public EntradaArquivo() {
		try {
			File arquivo = new File("entrada.txt");
			this.scanner = new Scanner(arquivo);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Arquivo de entrada não encontrado.");
		}
	}
	
	@Override
	public String le() {
		return scanner.nextLine();
	}

	@Override
	public boolean naoAcabou() {
		return scanner.hasNextLine();
	}

	@Override
	public void fecha() {
		scanner.close();
	}

}
