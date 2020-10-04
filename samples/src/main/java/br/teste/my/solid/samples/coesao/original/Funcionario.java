package br.teste.my.solid.samples.coesao.original;

public class Funcionario {
	private int id;
	private String nome;
	private String cargo;
	private double salarioBase;
	
	public Funcionario(int id, String nome, String cargo, double salarioBase) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}
	
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
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}