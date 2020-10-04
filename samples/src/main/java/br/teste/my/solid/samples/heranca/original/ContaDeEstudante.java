package br.teste.my.solid.samples.heranca.original;

import br.teste.my.solid.samples.heranca.refatoracao1.ContaComum;

public class ContaDeEstudante extends ContaComum{
	public void rende() {
		throw new ContaNaoRendeException();
	}
}
