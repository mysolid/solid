package br.teste.my.solid.samples.acoplamento.refatoracao1.acoes;

import br.teste.my.solid.samples.acoplamento.refatoracao1.entidades.NotaFiscal;

public class NotaFiscalDao implements AcoesAposNota{
	
	public NotaFiscalDao() {
		
	}

	public void executa(NotaFiscal nf) {
		System.out.println("Nota Fiscal foi salva no banco de dados.");
	}

}
