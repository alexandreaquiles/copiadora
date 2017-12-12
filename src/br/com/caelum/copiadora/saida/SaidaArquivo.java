package br.com.caelum.copiadora.saida;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import br.com.caelum.copiadora.Saida;

public class SaidaArquivo implements Saida {

	private PrintStream ps;

	public SaidaArquivo() {
		try {
			ps = new PrintStream("saida.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Erro ao criar o arquivo.");
		}
	}

	@Override
	public void escreve(String texto) {
		ps.println(texto);
	}
	
	public void fecha() {
		ps.close();
	}

}
