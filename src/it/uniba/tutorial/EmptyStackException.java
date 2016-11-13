package it.uniba.tutorial;
/**
 * thrown when user do some invalid operation over an empty stack
 * @author Michele
 *
 */
public class EmptyStackException extends Exception{
	
	public EmptyStackException(){
		
		super("Stack is empty!not valid operation");
		
	}
	
	public EmptyStackException(String message){
		
		super(message);
	}

}
