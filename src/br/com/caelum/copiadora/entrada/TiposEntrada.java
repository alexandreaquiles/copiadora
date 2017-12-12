package br.com.caelum.copiadora.entrada;

import java.util.Arrays;

import br.com.caelum.copiadora.dominio.Entrada;

public enum TiposEntrada {

	CONSOLE("C", "[C]onsole", new EntradaConsole()), ARQUIVO("A", "[A]rquivo", new EntradaArquivo()), URL("U", "[U]RL",new EntradaURL());

	private String opcao;
	private String descricao;
	private Entrada entrada;

	private TiposEntrada(String opcao, String descricao, Entrada entrada) {
		this.opcao = opcao;
		this.descricao = descricao;
		this.entrada = entrada;
	}

	public Entrada getEntrada() {
		return entrada;
	}
	
	public static String[] opcoes() {
		return Arrays.stream(values()).map(te -> te.descricao).toArray(String[]::new);
	}

	public static TiposEntrada seleciona(String opcao) {
		return Arrays.stream(values())
				.filter(te -> te.opcao.equalsIgnoreCase(opcao))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Opção inválida."));
	}

}
