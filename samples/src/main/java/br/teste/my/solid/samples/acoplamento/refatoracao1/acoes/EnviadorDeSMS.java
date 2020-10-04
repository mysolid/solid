package br.teste.my.solid.samples.acoplamento.refatoracao1.acoes;

import br.teste.my.solid.samples.acoplamento.refatoracao1.entidades.NotaFiscal;

public class EnviadorDeSMS implements AcoesAposNota{
	
	public EnviadorDeSMS() {
		
	}

	public void executa(NotaFiscal nf) {
		System.out.println("A nota fiscal foi enviada por SMS.");
	}

}
