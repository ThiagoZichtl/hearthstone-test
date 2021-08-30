package zichtlthiago.hearthstonecards.rest.api.service;

public class ErrorName extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ErrorName(Object name) {
		super("Resource not found. Name: " + name);
	}

}
