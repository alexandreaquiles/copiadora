package br.com.caelum.copiadora.entrada;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import br.com.caelum.copiadora.dominio.Entrada;

public class EntradaURL implements Entrada {

	private Scanner scanner;

	@Override
	public void cria() {
		try {
			URL url = new URL("http://caelum.com.br");
			this.scanner = new Scanner(url.openStream());
		} catch (IOException ex) {
			System.out.println("Erro ao abrir URL.");
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
