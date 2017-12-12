package br.com.caelum.banana;

import java.util.Arrays;

public enum Copias {

	CONSOLE("C", new CopiaConsole()), ARQUIVO("A", new CopiaArquivo());

	private String opcao;
	private Copia copia;

	private Copias(String opcao, Copia copia) {
		this.opcao = opcao;
		this.copia = copia;
	}

	public Copia getCopia() {
		return copia;
	}
	
	public static Copias seleciona(String opcao) {
		return Arrays.stream(Copias.values())
			.filter(c -> c.opcao.equals(opcao))
			.findFirst()
			.orElseThrow(() -> new RuntimeException("Opção inválida."));
	}

}
