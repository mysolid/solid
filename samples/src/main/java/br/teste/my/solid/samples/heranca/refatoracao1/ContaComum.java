package br.teste.my.solid.samples.heranca.refatoracao1;

public class ContaComum {
	private ManipuladorDeSaldo manipuladorDeSaldo;
	
    public ContaComum() {
    	this.manipuladorDeSaldo = new ManipuladorDeSaldo();
    }
    
    public void deposita(double valor) {
    	this.manipuladorDeSaldo.deposita(valor);
    }
    
    public void saca(double valor) {
    	this.manipuladorDeSaldo.saca(valor-10);
    }

    public void rende() {
    	this.manipuladorDeSaldo.rende(1.1);
    }
}