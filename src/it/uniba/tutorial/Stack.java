package it.uniba.tutorial;

import java.util.LinkedList;

import it.uniba.tutorial.tests.NegativeNumberException;

public class Stack {

	private LinkedList<Integer> lifoList;

	public Stack() {
		this.lifoList = new LinkedList<Integer>();
	}

	public void push(int x) throws NegativeNumberException {
		if (x < 0)
			throw new NegativeNumberException();
		this.lifoList.push(x);
	}

	public void pop() throws cannotPopFromEmptyStackException {
		if (this.lifoList.isEmpty())
			throw new cannotPopFromEmptyStackException();
		this.lifoList.pop();
	}
	
	public int peek() {
		return -1;
	}

	public int size() {
		return lifoList.size();
	}

	public boolean isEmpty() {
		if (this.lifoList.isEmpty())
			return true;
		else
			return false;
	}

}
