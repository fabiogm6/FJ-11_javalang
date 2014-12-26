package br.com.empresa.javalang;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ComecaAqui {

	public static void main(String[] args) {

		int i = 100;
		// número em String é concatená-lo da seguinte maneira
		String s = "" + i;
		System.out.println(s);

		double d = 1.2;
		String s2 = "" + d;
		System.out.println(s2);

		// String em número, utilizamos as classes de ajuda para os tipos
		// primitivos correspondentes.
		// Por exemplo, para transformar a String s em um número inteiro
		// utilizamos o método estático da
		// classe Integer:
		String s1 = "101";
		int i1 = Integer.parseInt(s1);
		System.out.println(i1);

		String x1 = "fj11";
		String y1 = new String("fj11");
		// comparador equals vide também a classe Conta do projeto Banco
		if (x1 == y1) {
			System.out.println("referência para o mesmo objeto");
		} else {
			System.out.println("referências para objetos diferentes!");
		}
		if (x1.equals(y1)) {
			System.out.println("consideramos iguais no critério de igualdade");
		} else {
			System.out
					.println("consideramos diferentes no critério de igualdade");
		}

		String frase = "java é demaisq dasf";
		String frase2 = "java e demaisq dasf";
		// se for 0 são iguais
		System.out.println(frase.compareTo(frase2));

		String palavrasdafrase[] = frase.split(" ");
		palavrasdafrase[2] = palavrasdafrase[2].toUpperCase();
		System.out.println(palavrasdafrase[2]);

		String palavra = "são paulo";
		palavra = palavra.replace("paulo", "pedro");
		System.out.println(palavra);

		System.out.println(palavra.charAt(1)); // ã
		System.out.println(palavra.length());
		System.out.println(palavra.substring(2, 5)); // o p
		System.out.println(palavra.indexOf("pe")); // 4
		System.out.println(palavra.lastIndexOf("o")); // 8
		System.out.println(palavra.isEmpty());

		Integer x10 = new Integer(11);
		Integer x20 = new Integer(11);
		System.out.println(x10);
		if (x10 == x20) {
			System.out.println("x10 igual x20");
		} else {
			System.out.println("diferente");
		}

		if (x10 < x20) {
			System.out.println("x10 < x20 " + (x10 + x20));
		}

		if (x10.equals(x20)) {
			System.out.println("Iguais");
		}

		int x30 = 8;
		int x31 = 8;
		if (x30 == x31) {
			System.out.println("x30 igual x31 " + (x30 + x31));
		} else {
			System.out.println("diferente");
		}

		double d1 = 4.4, d2 = 100, d3;
		long i2 = Math.round(d1);
		int x5 = -4;
		int y5 = Math.abs(x5);

		System.out.println(i2);
		d3 = d2 / 3;
		System.out.println(d3);

		/*
		 * Uma observação que deve ser feita é que o método format() em questão
		 * retorna uma String formatada no padrão informado.
		 * 
		 * Leia mais em: Arredondando números em Java
		 * http://www.devmedia.com.br/
		 * arredondando-numeros-em-java/28248#ixzz3DcAprZ4J
		 */
		DecimalFormat df4 = new DecimalFormat("0.000");
		DecimalFormat df41 = new DecimalFormat("#.000");

		s1 = df4.format(0.912385).replace(",", ".");
		// s1 = s1.replace(",", ".");
		System.out.println("s1 *** " + s1);

		s2 = df41.format(0.912385).replace(",", ".");
		System.out.println("s2 *** " + s2);

		double d14;
		d14 = Double.parseDouble(s1) + 10;
		System.out.println("=== " + d14);
		d14 = Double.parseDouble(s2) + 10;
		System.out.println("=== " + d14);

		DecimalFormat df6 = new DecimalFormat("###.##");
		df6.setRoundingMode(RoundingMode.UP);
		System.out.println(df6.format(0.53583)); // volta string

		// MAIS USADO
		double dd = 12.548795;
		BigDecimal bd = new BigDecimal(dd).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println(bd.doubleValue());
		dd = bd.doubleValue() + 10;
		System.out.println(dd);
		// Imprime 12.549

		String st131 = null;
		//if (st131 == null && !"".equals(st131)) {
		if (st131 == null) {
			System.out.println("nula");
		} else {
			System.out.println("diferente");
		}
		
		
	}
}

