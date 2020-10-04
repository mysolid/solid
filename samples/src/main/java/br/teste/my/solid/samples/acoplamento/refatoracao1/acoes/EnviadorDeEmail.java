package br.teste.my.solid.samples.acoplamento.refatoracao1.acoes;

import br.teste.my.solid.samples.acoplamento.refatoracao1.entidades.NotaFiscal;

public class EnviadorDeEmail implements AcoesAposNota{
	
	public EnviadorDeEmail() {
		
	}

	public void executa(NotaFiscal nf) {
		System.out.println("A nota fiscal foi enviada por e-mail.");
	}

}
