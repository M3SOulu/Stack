package it.uniba.tutorial.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.uniba.tutorial.Stack;

public class StackTest {

	public Stack<Integer> lista;
	@Before
	public void setUp() throws Exception {
		lista = new Stack<Integer>();
	}

	@After
	public void tearDown() throws Exception {
		lista = null;
	}

	@Test
	public void test() {
		Assert.assertTrue(lista.isEmpty());
		lista.push(15);
		Assert.assertFalse(lista.isEmpty());
		lista.push(6);
		Assert.assertEquals(6, lista.peek().intValue());
		lista.pop();
		Assert.assertEquals(15, lista.peek().intValue());
		lista.pop();
		Assert.assertTrue(lista.isEmpty());
	}

}
