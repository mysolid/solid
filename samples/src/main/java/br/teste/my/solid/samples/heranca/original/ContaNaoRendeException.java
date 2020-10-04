package br.teste.my.solid.samples.heranca.original;

public class ContaNaoRendeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ContaNaoRendeException() {
		super("Não pode ter rendimento");
	}
}
