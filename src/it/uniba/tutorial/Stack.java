package it.uniba.tutorial;

import java.util.LinkedList;

public class Stack<A> {
	
	private LinkedList<A> a;
	
	public Stack(){
		a = new LinkedList<A>();
	}
	
	public void push(A x){
		a.addFirst(x);
	}
	
	public void pop(){
		a.removeFirst();
	}
	
	public A peek(){
		return a.peekFirst();
	}
	
	public int size(){
		return a.size();
	}
	
	public boolean isEmpty(){
		boolean empty;
		
		if (a.size() == 0){
			empty = true;
		} else {
			empty = false;
		}
		return empty;
	}

}
