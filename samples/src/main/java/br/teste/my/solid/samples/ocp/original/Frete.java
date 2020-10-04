package br.teste.my.solid.samples.ocp.original;

public class Frete {	
	public double para(String cidade) {
		if("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}
}
