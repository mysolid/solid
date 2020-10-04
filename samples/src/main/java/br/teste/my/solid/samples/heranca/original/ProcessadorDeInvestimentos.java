package br.teste.my.solid.samples.heranca.original;

import java.util.LinkedList;
import java.util.List;

import br.teste.my.solid.samples.heranca.original.ContaComum;

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {
		List<ContaComum> contasDoBanco = new LinkedList<>();
		
		ContaComum cc1 = new ContaComum();
		cc1.deposita(100);
		System.out.println("Deposita 100 na cc1");
		cc1.rende();
		System.out.println("Faz render na cc1");
		System.out.println("Saldo da cc1: " + cc1.getSaldo());

		ContaComum cc2 = new ContaComum();
		cc2.deposita(100);
		System.out.println("Deposita 100 na cc2");
		cc2.rende();
		System.out.println("Faz render na cc2");
		System.out.println("Saldo da cc2: " + cc2.getSaldo());

		ContaDeEstudante cde1 = new ContaDeEstudante();
		cde1.deposita(100);
		System.out.println("Deposita 100 na cde1");
		//cde1.rende();
		System.out.println("Faz render na cde1");
		//System.out.println("Saldo da cde1: " + cde1.getSaldo());
		
		contasDoBanco.add(cc1);
		contasDoBanco.add(cc2);
		//contasDoBanco.add(cde1);
		
        for (ContaComum conta : contasDoBanco) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
     }

}
