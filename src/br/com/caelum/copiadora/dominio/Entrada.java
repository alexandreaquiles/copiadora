package br.com.caelum.copiadora.dominio;

public interface Entrada {

	void cria();
	String le();
	boolean naoAcabou();
	void fecha();

}
