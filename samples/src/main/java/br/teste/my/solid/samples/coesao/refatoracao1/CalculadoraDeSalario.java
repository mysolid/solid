package br.teste.my.solid.samples.coesao.refatoracao1;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}
	
}