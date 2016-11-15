package it.uniba.tutorial.tests;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	public void testPush() throws NoSuchElementException{
		
		stack.push(1);
		Assert.assertEquals(stack.size(), 1);
	}
	
	
	@Test
	public void testPop()  throws NoSuchElementException{
		
		stack.push(1);
		stack.pop();
		Assert.assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testPeek() throws NoSuchElementException{
		
		stack.push(-1);
		stack.push(10);
		stack.push(25);
		stack.push(-47);
		
		Assert.assertEquals(stack.peek(), -47);
	}
	
	@Test
	public void testSize(){
		
		stack.push(-1);
		stack.push(10);
		stack.push(25);
		stack.push(-47);
		
		Assert.assertEquals(stack.size(), 4);
	}
	
	@Test
	public void testRifle(){
		
		stack.push(-1);
		stack.push(10);
		stack.push(25);
		stack.push(-47);
		stack.rifle();
		
		Assert.assertTrue(stack.isEmpty());
		
	}
	
	@Test
	public void testRifleOverEmptyStack(){
		
		stack.rifle();
		Assert.assertTrue(stack.isEmpty());
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testPeekOverEmptyStack() throws NoSuchElementException{
		
		stack.peek();
		
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testPopOverEmptyStack() throws NoSuchElementException{
		
		stack.pop();
		
	}

}
