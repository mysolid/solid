package br.teste.my.solid.samples.encapsulamento.refatoracao1;

public class Boleto {

    private double valor;


    public Boleto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }


}