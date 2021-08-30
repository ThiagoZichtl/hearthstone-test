package zichtlthiago.hearthstonecards.rest.api.service;

public class ErrorType extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ErrorType(Object cardType) {
		super("Resource not found. CardType : " + cardType);
	}

}
