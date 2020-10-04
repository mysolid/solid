package br.teste.my.solid.samples.coesao.refatoracao1;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()), 
	DBA(new DezOuVintePorcento()),
	TESTER(new QuinzeOuVinteECincoPorcento()),
	GERENTE(new DezOuVintePorcento());
	
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
