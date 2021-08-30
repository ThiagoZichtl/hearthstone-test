package zichtlthiago.hearthstonecards.rest.api.service;

public class ErrorClass extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ErrorClass(Object cardClass) {
		super("Resource not found. CardClass: " + cardClass);
	}

}
