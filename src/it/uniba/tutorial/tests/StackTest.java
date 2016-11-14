package it.uniba.tutorial.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import it.uniba.tutorial.Stack;


public class StackTest {
	
	private Stack<Integer> stk_i;
	private Stack<String> stk_s;
	
	
	@Before
	public void setUp() throws Exception {
		stk_i=new Stack<Integer>();
		stk_s=new Stack<String>();
	}

	@After
	public void tearDown() throws Exception {
		stk_i=null;
		stk_s=null;
	}

	@Test
	public void test_int() {
		Assert.assertTrue(stk_i.isEmpty());
		stk_i.push(5);
		Assert.assertFalse(stk_i.isEmpty());
		Assert.assertEquals(5, stk_i.peek().intValue());
		stk_i.push(25);
		stk_i.push(13);
		Assert.assertTrue(stk_i.size()==3);
		stk_i.pop();
		Assert.assertTrue(stk_i.size()==2);
	}
	
	@Test
	public void test_str() {
		Assert.assertTrue(stk_s.isEmpty());
		stk_s.push("String1");
		Assert.assertFalse(stk_s.isEmpty());
		Assert.assertEquals("String1", stk_s.peek());
		stk_s.push("String2");
		stk_s.push("String3");
		Assert.assertTrue(stk_s.size()==3);
		stk_s.pop();
		Assert.assertTrue(stk_s.size()==2);
	}

}
