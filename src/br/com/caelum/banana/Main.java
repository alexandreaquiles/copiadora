package br.com.caelum.banana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if ("exit".equals(line)) {
					break;
				} else {
					System.out.println(line);
				}
			}
		}
	}
}
