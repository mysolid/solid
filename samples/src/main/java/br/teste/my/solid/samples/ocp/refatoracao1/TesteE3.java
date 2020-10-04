package br.teste.my.solid.samples.ocp.refatoracao1;

public class TesteE3 {

	public static void main(String[] args) {
		System.out.println("Teste de diferentes regras - Refatorado");

		Produto produto = new Produto();
		produto.setId(1);
		produto.setNome("Bola");
		produto.setValor(100);
		produto.setCidade("SAO PAULO");
		
		TabelaDePreco tabelaPadrao = new TabelaDePrecoPadrao();
		ServicoDeEntrega entrega = new Frete();
			
		System.out.println("Preco calculado do produto " + produto.getNome() + 
				" : " + produto.getValor() + " tem preço recalculado para: " + 
				new CalculadoraDePrecos(tabelaPadrao, entrega).calcula(produto));
	}

}
