package br.teste.my.solid.samples.coesao.refatoracao1;

public class TesteE1 {

	public static void main(String[] args) {
		System.out.println("Exercicio 1 - Classe CalculadoraDeSalario Original");
		
		Funcionario desenvolvedor = new Funcionario(1, "Antonio", Cargo.DESENVOLVEDOR, 3500);
		Funcionario tester = new Funcionario(2, "Francisco", Cargo.TESTER, 2500);
		Funcionario dba = new Funcionario(3, "Maria", Cargo.DBA, 4000);
		Funcionario gerente = new Funcionario(4, "Armando", Cargo.GERENTE, 5000);
		
		System.out.println("Salário do " + desenvolvedor.getNome() + 
				" : " + new CalculadoraDeSalario().calcula(desenvolvedor) + " - " + desenvolvedor.getCargo());
		System.out.println("Salário do " + tester.getNome() + 
				" : " + new CalculadoraDeSalario().calcula(tester) + " - " + tester.getCargo());
		System.out.println("Salário do " + dba.getNome() + 
				" : " + new CalculadoraDeSalario().calcula(dba) + " - " + dba.getCargo());
		System.out.println("Salário do " + gerente.getNome() + 
				" : " + new CalculadoraDeSalario().calcula(gerente) + " - " + gerente.getCargo());
	}

}
