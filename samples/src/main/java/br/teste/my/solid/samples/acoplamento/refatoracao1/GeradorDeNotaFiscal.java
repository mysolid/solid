package br.teste.my.solid.samples.acoplamento.refatoracao1;

import java.util.List;

import br.teste.my.solid.samples.acoplamento.refatoracao1.acoes.AcoesAposNota;
import br.teste.my.solid.samples.acoplamento.refatoracao1.entidades.Fatura;
import br.teste.my.solid.samples.acoplamento.refatoracao1.entidades.NotaFiscal;

public class GeradorDeNotaFiscal {
	private List<AcoesAposNota> acoes;
	
    public GeradorDeNotaFiscal(List<AcoesAposNota> acoes) {
    	this.acoes = acoes;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        //Executa a lista de acoes passadas
        for (AcoesAposNota acoesAposNota : acoes) {
        	acoesAposNota.executa(nf);
		}
        
        return nf;
    }

}
