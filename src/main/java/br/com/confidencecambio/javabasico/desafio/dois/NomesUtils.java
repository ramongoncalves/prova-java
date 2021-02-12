package br.com.confidencecambio.javabasico.desafio.dois;

import java.util.Arrays;
import java.util.List;

public class NomesUtils {

	private static final String PONTO = ". ";
	private static final String ESPACO_VAZIO = " ";

	public String retornaPrimeiroNome(String nome) {

		String validaNome = validaNome(nome);

		if (validaNome != null) {
			return validaNome;
		}

		return nome.split(ESPACO_VAZIO)[0];
	}

	public String retornaUltimoNome(String nome) {

		String validaNome = validaNome(nome);

		if (validaNome != null) {
			return validaNome;
		}

		String[] nomeSplit = nome.split(ESPACO_VAZIO);

		return nomeSplit[nomeSplit.length - 1];

	}

	public String retornaNomeMaiusculo(String nome) {

		String validaNome = validaNome(nome);

		if (validaNome != null) {
			return validaNome;
		}

		return nome.toUpperCase();
	}

	public String retornaNomeAbreviado(String nome) {

		String validaNome = validaNome(nome);

		if (validaNome != null) {
			return validaNome;
		}

		List<String> ds = Arrays.asList("de", "da", "do", "das", "dos");
		String[] nomeSplit = nome.split(ESPACO_VAZIO);

		StringBuilder nomeAbreviado = new StringBuilder(nomeSplit[0]);
		nomeAbreviado.append(ESPACO_VAZIO);
		for (int i = 1; i < nomeSplit.length - 1; i++) {
			String nomeMeio = nomeSplit[i];

			if (ds.contains(nomeMeio))
				continue;
			nomeAbreviado.append(nomeMeio.toUpperCase().charAt(0));
			nomeAbreviado.append(PONTO);
		}
		nomeAbreviado.append(nomeSplit[nomeSplit.length - 1]);

		return nomeAbreviado.toString();
	}

	private String validaNome(String nome) {

		if (nome.trim().isEmpty() || nome == null) {
			return "Não pode ser nulo ou vazio";
		}

		if (nome.startsWith(" ") || nome.endsWith(" ")) {
			return "Não pode ter espaco vazio";
		}
		return nome;
	}

	public static void main(String[] args) {

		NomesUtils nomesUtils = new NomesUtils();
		System.out.println(nomesUtils.retornaNomeAbreviado("Paulo Roberto Gonçalves de Jesus"));
		System.out.println(nomesUtils.retornaPrimeiroNome("Paulo Roberto Gonçalves de Jesus "));
		System.out.println(nomesUtils.retornaUltimoNome("Paulo Roberto Gonçalves de Jesus"));
		System.out.println(nomesUtils.retornaNomeMaiusculo("Paulo Roberto Gonçalves de Jesus"));
	}
}
