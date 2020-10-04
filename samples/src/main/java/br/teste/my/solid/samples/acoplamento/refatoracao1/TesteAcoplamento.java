package br.teste.my.solid.samples.acoplamento.refatoracao1;

import java.util.LinkedList;
import java.util.List;

import br.teste.my.solid.samples.acoplamento.refatoracao1.acoes.AcoesAposNota;
import br.teste.my.solid.samples.acoplamento.refatoracao1.acoes.EnviadorDeEmail;
import br.teste.my.solid.samples.acoplamento.refatoracao1.acoes.EnviadorDeSMS;
import br.teste.my.solid.samples.acoplamento.refatoracao1.acoes.NotaFiscalDao;
import br.teste.my.solid.samples.acoplamento.refatoracao1.entidades.Fatura;

public class TesteAcoplamento {
	public static void main(String[] args) {
		System.out.println("Teste de Acoplamento");
		
		List<AcoesAposNota> minhasAcoes = new LinkedList<AcoesAposNota>();
		
		//Crie os itens de acoes que devem ser adicionados a lista de minhas acoes
		EnviadorDeEmail enviaNotaPorEmail = new EnviadorDeEmail();
		EnviadorDeSMS enviaNotaPorSMS = new EnviadorDeSMS();
		NotaFiscalDao salvaNotaNoBanco = new NotaFiscalDao();
		
		//Adiciona as acoes na lista de acoes
		minhasAcoes.add(enviaNotaPorSMS);
		minhasAcoes.add(enviaNotaPorEmail);
		minhasAcoes.add(salvaNotaNoBanco);
		
		Fatura fatura = new Fatura();
		GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(minhasAcoes);		
		geradorDeNotaFiscal.gera(fatura);
	}
}
