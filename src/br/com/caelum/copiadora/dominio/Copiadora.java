package br.com.caelum.copiadora.dominio;

public class Copiadora {

	private Entrada entrada;
	private Saida saida;

	public Copiadora(Entrada entrada, Saida saida) {
		this.entrada = entrada;
		this.saida = saida;

		this.entrada.cria();
		this.saida.cria();
	}

	public void copia() {
		System.out.println("Pode digitar:");
		while (entrada.naoAcabou()) {
			String linha = entrada.le();
			if ("exit".equals(linha)) {
				System.out.println("Tchau!");
				break;
			} else {
				saida.escreve(linha);
			}
		}
		entrada.fecha();
		saida.fecha();
	}

}
