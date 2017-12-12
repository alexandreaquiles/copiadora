package br.com.caelum.copiadora.entrada;

import java.util.Arrays;

import br.com.caelum.copiadora.Entrada;

public enum TiposEntrada {

	CONSOLE("C", new EntradaConsole()), ARQUIVO("A", new EntradaArquivo());

	private String opcao;
	private Entrada copia;

	private TiposEntrada(String opcao, Entrada copia) {
		this.opcao = opcao;
		this.copia = copia;
	}

	public Entrada getEntrada() {
		return copia;
	}

	public static TiposEntrada seleciona(String opcao) {
		return Arrays.stream(values())
				.filter(c -> c.opcao.equals(opcao))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Opção inválida."));
	}

}
