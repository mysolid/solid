package br.teste.my.solid.samples.encapsulamento.original;

import java.util.List;

public class Fatura {
	private double valor;
	private List<Pagamento> pagamentos;
	private double valorMensal;
	private boolean pago;
	
	public Fatura() {
		System.out.println("Fatura criada.");
	}
	public double getValorMensal() {
		return this.valorMensal;
	}
	public List<Pagamento> getPagamentos() {
		return this.pagamentos;
	}
	public double getValor() {
		return this.valor;
	}
	public void setPago(boolean b) {
		this.pago = b;
	}

}
