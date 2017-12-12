package br.com.caelum.copiadora;

public class Copiadora {

	private Entrada entrada;
	private Saida saida;

	public Copiadora(Entrada entrada, Saida saida) {
		this.entrada = entrada;
		this.saida = saida;
	}

	public void copia() {
		System.out.println("Pode digitar:");
		while (entrada.naoAcabou()) {
			String linha = entrada.le();
			if ("exit".equals(linha)) {
				break;
			} else {
				saida.escreve(linha);
			}
		}
		entrada.fecha();
		saida.fecha();
	}

}
