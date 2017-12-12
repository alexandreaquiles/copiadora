package br.com.caelum.copiadora.saida;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import br.com.caelum.copiadora.dominio.Saida;

public class SaidaArquivo implements Saida {

	private PrintStream ps;

	@Override
	public void cria() {
		try {
			ps = new PrintStream("saida.txt");
		} catch (FileNotFoundException ex) {
			System.out.println("Erro ao criar o arquivo de saída.");
			throw new RuntimeException(ex);
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
