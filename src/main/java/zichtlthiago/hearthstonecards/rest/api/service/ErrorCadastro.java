package zichtlthiago.hearthstonecards.rest.api.service;

public class ErrorCadastro extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public ErrorCadastro() {
		super("Valor inviável");
	}
}
