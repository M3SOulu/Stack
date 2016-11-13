package it.uniba.tutorial;

import java.util.LinkedList;

public class Stack<A> {
	
	private LinkedList<A> list;
	
	public Stack(){
		list=new LinkedList<A>();
	}
	
	public void push(A x) {
		list.addFirst(x);
	}
	
	public void pop(){
		list.removeFirst();
	}
	
	public A peek(){ 
		return list.peekFirst();
	}
	
	public int size(){ 
		return list.size();
	}
	
	public boolean isEmpty() {
		if(list.size()==0)
			return true;
		else 
			return false;
	}
	

}
