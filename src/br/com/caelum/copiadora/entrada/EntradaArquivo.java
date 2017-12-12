package br.com.caelum.copiadora.entrada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import br.com.caelum.copiadora.dominio.Entrada;

public class EntradaArquivo implements Entrada {

	private Scanner scanner;

	@Override
	public void cria() {
		try {
			File arquivo = new File("entrada.txt");
			this.scanner = new Scanner(arquivo);
		} catch (FileNotFoundException ex) {
			System.out.println("Arquivo de entrada não encontrado.");
			throw new RuntimeException(ex);
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
