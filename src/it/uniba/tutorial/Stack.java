package it.uniba.tutorial;

import java.util.LinkedList;

/**
 * Simulate a stack structure to perform storing data in LIFO  
 * @author Michele
 *
 */
public class Stack{
	
	private LinkedList<Integer> stack;
	
	/**
	 * constructor
	 */
	public Stack(){
		
		stack=new LinkedList<Integer>();
	}
	
	/**
	 * push an element to the top of the stack
	 * @param x
	 */
	public void push(int x) { stack.addFirst(x); }
	
	/**
	 * pop the last item pushed in the stack
	 */
	public void pop() throws EmptyStackException{ 
		
		if(!isEmpty()){
			
			stack.removeFirst(); 
			
		}else{
			
			throw new EmptyStackException("illegal action!");
		}
		
	}
	
	/**
	 * return the top of the satck
	 * @return the first element of the stack, min integer value otherwise.
	 */
	public int peek() throws EmptyStackException{ 
		
		if(isEmpty()){
			
			throw new EmptyStackException();
			
		}
		
		return stack.getFirst();
		
	}
	
	/**
	 * 
	 * @return the size of the stack
	 */
	public int size(){ return stack.size(); }
	
	/**
	 *  
	 * @return true if the stack is empty, false otherwise.
	 */
	public boolean isEmpty() { return stack.isEmpty(); }
	
	/**
	 * remove all items from the stack
	 */
	public void rifle(){
		
		stack.removeAll(stack);
	}

}
