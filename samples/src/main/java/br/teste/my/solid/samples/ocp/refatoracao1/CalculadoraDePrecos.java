package br.teste.my.solid.samples.ocp.refatoracao1;

public class CalculadoraDePrecos {
	private TabelaDePreco tabelaDePreco; 
	private ServicoDeEntrega entrega;
	
	public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, ServicoDeEntrega entrega) {
		this.tabelaDePreco = tabelaDePreco;
		this.entrega = entrega;
	}
	
	public double calcula(Produto produto) {
		double frete = entrega.para(produto.getCidade());
		double desconto = tabelaDePreco.descontoPara(produto.getValor());

		return produto.getValor() * (1-desconto) + frete;
	}
}
