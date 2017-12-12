package br.com.caelum.copiadora.saida;

import java.util.Arrays;

import br.com.caelum.copiadora.dominio.Saida;

public enum TiposSaida {

	CONSOLE("C", "[C]onsole", new SaidaConsole()), ARQUIVO("A", "[A]rquivo", new SaidaArquivo());

	private Saida saida;
	private String opcao;
	private String descricao;

	private TiposSaida(String opcao, String descricao, Saida saida) {
		this.opcao = opcao;
		this.descricao = descricao;
		this.saida = saida;
	}

	public Saida getSaida() {
		return saida;
	}
	
	public static String[] opcoes() {
		return Arrays.stream(values()).map(te -> te.descricao).toArray(String[]::new);
	}
	
	public static TiposSaida seleciona(String opcao) {
		return Arrays.stream(values())
			.filter(c -> c.opcao.equalsIgnoreCase(opcao))
			.findFirst()
			.orElseThrow(() -> new RuntimeException("Opção inválida."));
	}

}
