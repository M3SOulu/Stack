package it.uniba.tutorial.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniba.tutorial.Stack;
import it.uniba.tutorial.cannotPopFromEmptyStackException;

public class StackTest {
	Stack myStack;

	@Before
	public void setUp() throws Exception {
		//Arrange
		myStack = new Stack();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void addingTheFirstElementHasSizeOne() throws NegativeNumberException{
		//Act
		myStack.push(3);
		//Assert
		assertEquals(1, myStack.size());
	}
	
	@Test(expected = NegativeNumberException.class)
	public void addNegativeNumberShouldRaiseAnException () throws NegativeNumberException{
		//Act
		myStack.push(-1000);
	}
	
	@Test
	public void  stackIsNotEmptyAfterAddingOneElement() throws NegativeNumberException{
		//Act
		myStack.push(45);
		//Assert
		assertFalse(myStack.isEmpty());
	}
	
	@Test
	public void aJustCreatedStackIsEmpty(){
		assertTrue(myStack.isEmpty());
	}
	
	@Test
	public void popRemovesLastElement() throws NegativeNumberException, cannotPopFromEmptyStackException{
		//Arrange
		myStack.push(1);
		myStack.push(10);
		myStack.push(100);
		
		//Act
		myStack.pop();
		
		//Assert
		assertEquals(2, myStack.size());
	}
	
	@Test(expected = cannotPopFromEmptyStackException.class)
	public void popFromEmptyStackShouldRaiseAnException() throws cannotPopFromEmptyStackException, NegativeNumberException{
		//Act
		myStack.pop();
	}
	

}
