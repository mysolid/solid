package br.teste.my.solid.samples.coesao.original;

public class CalculadoraDeSalario {
	private static final String DESENVOLVEDOR = "DESENVOLVEDOR";
	private static final String DBA = "DBA";
	private static final String TESTER = "TESTER";

	public double calcula(Funcionario funcionario) {
		if(DESENVOLVEDOR.equals(funcionario.getCargo())) {
            return dezOuVintePorcento(funcionario);
        }

        if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())) {
            return quinzeOuVinteECincoPorcento(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
	}
	
	private double dezOuVintePorcento(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
	}
	
	public double quinzeOuVinteECincoPorcento(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
	}
}