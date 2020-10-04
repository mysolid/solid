package br.teste.my.solid.samples.heranca.refatoracao1;

public class ContaDeEstudante {
	private ManipuladorDeSaldo manipuladorDeSaldo;
	private double milhas;
	
	public ContaDeEstudante() {
		this.manipuladorDeSaldo = new ManipuladorDeSaldo();
	}
	
	public void deposita(double valor) {
		this.manipuladorDeSaldo.deposita(valor);
		this.milhas += valor;
	}
	
	public void saca(double valor) {
		this.manipuladorDeSaldo.saca(valor);
	}

	public double getMilhas() {
		return this.milhas;
	}
	
	public double getSaldo() {
		return this.manipuladorDeSaldo.getSaldo();
	}
}
