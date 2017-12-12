package br.com.caelum.copiadora;

import java.util.Arrays;
import java.util.Scanner;

import br.com.caelum.copiadora.dominio.Copiadora;
import br.com.caelum.copiadora.dominio.Entrada;
import br.com.caelum.copiadora.dominio.Saida;
import br.com.caelum.copiadora.entrada.TiposEntrada;
import br.com.caelum.copiadora.saida.TiposSaida;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Escolha a opção de entrada:");
			Arrays.stream(TiposEntrada.opcoes()).forEach(System.out::println);

			String opcaoEntradda = scanner.nextLine();
			Entrada entrada = TiposEntrada.seleciona(opcaoEntradda).getEntrada();

			System.out.println("Escolha a opção de saída:");
			Arrays.stream(TiposSaida.opcoes()).forEach(System.out::println);

			String opcao = scanner.nextLine();
			Saida saida = TiposSaida.seleciona(opcao).getSaida();
			
			Copiadora copiadora = new Copiadora(entrada, saida);
			copiadora.copia();
		} catch (Throwable ex) {
			System.out.print("Erro fatal.");
			System.out.println(ex.getMessage() != null ? ex.getMessage() : "");
			ex.printStackTrace();
		}
	}

}
