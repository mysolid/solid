package br.teste.my.solid.samples.coesao.original;

public class TesteE1 {

	public static void main(String[] args) {
		System.out.println("Exercicio 1 - Classe CalculadoraDeSalario Original");
		
		Funcionario desenvolvedor = new Funcionario(1, "Antonio", "DESENVOLVEDOR", 3500);
		Funcionario tester = new Funcionario(2, "Francisco", "TESTER", 2500);
		Funcionario dba = new Funcionario(3, "Maria", "DBA", 4000);
		
		System.out.println("Salário do " + desenvolvedor.getNome() + 
				" : " + new CalculadoraDeSalario().calcula(desenvolvedor) + " - " + desenvolvedor.getCargo());
		System.out.println("Salário do " + tester.getNome() + 
				" : " + new CalculadoraDeSalario().calcula(tester) + " - " + tester.getCargo());
		System.out.println("Salário do " + dba.getNome() + 
				" : " + new CalculadoraDeSalario().calcula(dba) + " - " + dba.getCargo());

	}

}
