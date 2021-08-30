package zichtlthiago.hearthstonecards.rest.api.service;

public class ErrorID extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ErrorID(Object id) {
		super("Resource not found. Id: " + id);
	}

}
