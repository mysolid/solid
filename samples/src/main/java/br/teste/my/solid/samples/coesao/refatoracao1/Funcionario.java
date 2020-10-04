package br.teste.my.solid.samples.coesao.refatoracao1;

public class Funcionario {
	private int id;
	private String nome;
	private Cargo cargo;
	private double salarioBase;
	
	public Funcionario(int id, String nome, Cargo cargo, double salarioBase) {
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
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}