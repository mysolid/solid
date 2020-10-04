package br.teste.my.solid.samples.ocp.original;

public class TesteE3 {

	public static void main(String[] args) {
		System.out.println("Teste de diferentes regras");

		Produto produto = new Produto();
		produto.setId(1);
		produto.setNome("Bola");
		produto.setValor(100);
		produto.setCidade("SAO PAULO");
			
		System.out.println("Preco calculado do produto " + produto.getNome() + 
				" : " + produto.getValor() + " tem preço recalculado para: " + new CalculadoraDePrecos().calcula(produto));
	}

}
