package br.com.caelum.copiadora.saida;

import br.com.caelum.copiadora.Saida;

public class SaidaConsole implements Saida {

	@Override
	public void escreve(String texto) {
		System.out.println(texto);
	}

	@Override
	public void fecha() {
	}

}
