package it.uniba.tutorial.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniba.tutorial.EmptyStackException;
import it.uniba.tutorial.Stack;
import junit.framework.Assert;

/**
* tests for Stack class
*/
public class StackTest {
	
	private Stack stack;
	
	@Before
	public void setUp() throws Exception {
		
		stack= new Stack();
	}

	@After
	public void tearDown() throws Exception {
		
		stack.rifle();
	}
	
	@Test
	public void testIsEmpty(){
		
		Assert.assertTrue(stack.isEmpty());
	}
	@Test
	public void testPushAndPeek() throws EmptyStackException{
		
		stack.push(1);
		Assert.assertEquals(stack.peek(),1);
	}
	
	
	@Test
	public void testPop()  throws EmptyStackException{
		
		stack.push(1);
		stack.pop();
		Assert.assertTrue(stack.isEmpty());
	}

}
