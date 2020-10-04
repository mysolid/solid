package br.teste.my.solid.samples.encapsulamento.refatoracao1;

import java.util.LinkedList;
import java.util.List;

public class TesteE4 {

	public static void main(String[] args) {
		System.out.println("Teste de Encapsulamento");

		ProcessadorDeBoletos processaBoletos = new ProcessadorDeBoletos();
		
		List<Boleto> boletos = new LinkedList<Boleto>();
		Fatura fatura = new Fatura("Armando", 100);
		
		processaBoletos.processa(boletos, fatura);
	}

}
