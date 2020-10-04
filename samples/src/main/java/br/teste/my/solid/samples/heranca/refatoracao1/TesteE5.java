package br.teste.my.solid.samples.heranca.refatoracao1;

import br.teste.my.solid.samples.heranca.original.ContaComum;

public class TesteE5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContaComum cc1 = new ContaComum();
		cc1.deposita(100);
		System.out.println("Deposita 100 na cc1");
		cc1.rende();
		System.out.println("Faz render na cc1");
		System.out.println("Saldo da cc1: " + cc1.getSaldo());

		ContaDeEstudante cde1 = new ContaDeEstudante();
		cde1.deposita(100);
		System.out.println("Deposita 100 na cde1");
		System.out.println("Milhas acumuladas: " + cde1.getMilhas());
	}

}
