package br.teste.my.solid.samples.ocp.refatoracao1;

public class Produto {
	private int id;
	private String nome;
	private double valor;
	private String cidade;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return this.valor;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
