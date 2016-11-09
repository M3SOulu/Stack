package it.uniba.tutorial.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StackTest.class, StackTestFoo.class })
public class AllTests {

}
