package br.teste.my.solid.samples.ocp.original;

public class CalculadoraDePrecos {
	public double calcula(Produto produto) {
		TabelaDePrecoPadrao tabela = new TabelaDePrecoPadrao();
		Frete correios = new Frete();

		double frete = correios.para(produto.getCidade());
		double desconto = tabela.descontoPara(produto.getValor());

		return produto.getValor() * (1-desconto) + frete;
	}
}
