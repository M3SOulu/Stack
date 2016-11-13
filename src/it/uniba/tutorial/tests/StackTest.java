package it.uniba.tutorial.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniba.tutorial.IllegalRemoveException;
import it.uniba.tutorial.NegativeNumberException;
import it.uniba.tutorial.Stack;

public class StackTest {
	Stack myStack;

	@Before
	public void setUp() throws Exception {
		myStack = new Stack();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addingTheFirstElementHasSizeOne() throws NegativeNumberException {

		// Arrange

		// Act
		myStack.push(3);
		// Assert
		assertEquals(1, myStack.size());
	}

	@Test(expected = NegativeNumberException.class)
	public void addNegativeNumberShouldRaiseAnException() throws NegativeNumberException {
		// Arrange
		// Act
		myStack.push(-1000);
	}

	@Test
	public void stackIsNotEmptyAfterAddingOneElement() throws NegativeNumberException {
		// Act
		myStack.push(42);

		// Assert
		assertFalse(myStack.isEmpty());

	}

	@Test
	public void aJustCreatedStackIsEmpty() {
		assertTrue(myStack.isEmpty());
	}

	@Test
	public void popRemovesLastElement() throws NegativeNumberException, IllegalRemoveException {
		// Arrange
		myStack.push(1);
		myStack.push(10);
		myStack.push(100);

		// Act
		myStack.pop();

		// Assert
		assertEquals(2, myStack.size());
	}

	@Test(expected = IllegalRemoveException.class)
	public void cannotPopFromAnEmptyStack() throws IllegalRemoveException {
		// Act
		myStack.pop();
	}

	@Test
	public void peekGetLastElement() throws NegativeNumberException {
		// Arrange
		myStack.push(1);
		myStack.push(10);
		myStack.push(100);

		// Assert
		assertEquals(100, myStack.peek());
	}
}
