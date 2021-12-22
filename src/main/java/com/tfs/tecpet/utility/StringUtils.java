package com.tfs.tecpet.utility;

import java.text.Normalizer;
import java.util.Random;

public class StringUtils {
	public synchronized static String removeSpecialCharacters(String string) {
		return string.replaceAll("\\W", "").trim();
	}

	public synchronized static String onlyDigit(String string) {
		return string.replaceAll("\\D", "").trim();
	}

	public synchronized static String onlyLetter(String string) {
		return string.replaceAll("\\d", "").trim();
	}

	public synchronized static String removeAccentuation(String str) {
		return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

	/**
	 * Preenche a esquerda com o caracter informado atÃ© o tamanho passado.
	 * 
	 * @param campo    String com o valor do campo
	 * @param tamanho  int com o tamanho de digitos que ele deverÃ¡ preencher. Se
	 *                 for menor que a string, cortar direita (reproduzindo o
	 *                 comportamento do Oracle)
	 * @param caracter char com o valor que ele deverÃ¡ utilizar para preencher
	 * 
	 * @return temp String com o campo alterado
	 */
	public static String lpad(String campo, final int tamanho, final char caracter) {
		if (tamanho < 0) {
			return null;
		}

		if (campo == null) {
			campo = "";
		}

		final StringBuilder temp = new StringBuilder(tamanho);

		temp.append(campo);

		if (tamanho > campo.length()) {
			for (int i = 0; i < (tamanho - campo.length()); i++) {
				temp.insert(0, caracter);
			}
		} else {
			return temp.substring(0, tamanho);
		}

		return temp.toString();
	}

	public static boolean isNullOrEmpty(String value) {
		if (value != null && !value.isEmpty() && value.trim().length() != 0)
			return value.trim().equals("null") ? true : false;
		else
			return true;
	}

	public static String leftPad(String value, int lenth, char item) {
		return value;
	}

	public static String randomSenha() {
		final String alfabeto = "abcdefghijklmnopqrstuvwxyz";// + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String numeros = "0123456789";
		final String caracteresEspeciais = "@$&#%^$*";

		final String caracteres = alfabeto + numeros + caracteresEspeciais;

		final int N = caracteres.length();
		Random rd = new Random();
		int iLength = 20;
		StringBuilder sb = new StringBuilder(iLength);

		for (int i = 0; i < iLength; i++) {
			sb.append(caracteres.charAt(rd.nextInt(N)));
		}

		return sb.toString();
	}

	public static String randomCodigoVerificacao() {
		final String numeros = "0123456789";
		final int N = numeros.length();
		Random rd = new Random();
		int iLength = 6;
		StringBuilder sb = new StringBuilder(iLength);

		for (int i = 0; i < iLength; i++) {
			sb.append(numeros.charAt(rd.nextInt(N)));
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println(randomSenha());
	}
}