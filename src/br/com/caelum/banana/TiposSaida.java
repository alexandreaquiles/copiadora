package br.com.caelum.banana;

import java.util.Arrays;

public enum TiposSaida {

	CONSOLE("C", new SaidaConsole()), ARQUIVO("A", new SaidaArquivo());

	private String opcao;
	private Saida saida;

	private TiposSaida(String opcao, Saida saida) {
		this.opcao = opcao;
		this.saida = saida;
	}

	public Saida getSaida() {
		return saida;
	}
	
	public static TiposSaida seleciona(String opcao) {
		return Arrays.stream(TiposSaida.values())
			.filter(c -> c.opcao.equals(opcao))
			.findFirst()
			.orElseThrow(() -> new RuntimeException("Opção inválida."));
	}

}
