package br.teste.my.solid.samples.acoplamento.original;

public class TesteAcoplamento {
	public static void main(String[] args) {
		System.out.println("Teste de Acoplamento");
		
		EnviadorDeEmail email = new EnviadorDeEmail();
		NotaFiscalDao dao = new NotaFiscalDao();
		GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(email, dao);
		Fatura fatura = new Fatura();
		
		
		geradorDeNotaFiscal.gera(fatura);
	}
}
