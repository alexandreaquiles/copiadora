package br.com.caelum.banana;

import java.util.Arrays;

public enum TiposSaida {

	CONSOLE("C", new SaidaConsole()), ARQUIVO("A", new SaidaArquivo());

	private String opcao;
	private Saida copia;

	private TiposSaida(String opcao, Saida copia) {
		this.opcao = opcao;
		this.copia = copia;
	}

	public Saida getCopia() {
		return copia;
	}
	
	public static TiposSaida seleciona(String opcao) {
		return Arrays.stream(TiposSaida.values())
			.filter(c -> c.opcao.equals(opcao))
			.findFirst()
			.orElseThrow(() -> new RuntimeException("Opção inválida."));
	}

}
