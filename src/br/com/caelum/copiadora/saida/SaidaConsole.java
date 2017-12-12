package br.com.caelum.copiadora.saida;

import br.com.caelum.copiadora.dominio.Saida;

public class SaidaConsole implements Saida {

	@Override
	public void cria() {
	}

	@Override
	public void escreve(String texto) {
		System.out.println(texto);
	}

	@Override
	public void fecha() {
	}

}
