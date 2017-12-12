package br.com.caelum.copiadora.entrada;

import java.util.Scanner;

import br.com.caelum.copiadora.dominio.Entrada;

public class EntradaConsole implements Entrada {

	private Scanner scanner;
	
	@Override
	public void cria() {
		this.scanner = new Scanner(System.in);
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
