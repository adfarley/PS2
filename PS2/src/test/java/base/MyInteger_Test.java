package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		
		MyInteger myIntEven = new MyInteger(4);
		MyInteger myIntOdd = new MyInteger(5);
				
		assertTrue(myIntEven.isEven() == true);
		assertTrue(MyInteger.isEven(4) == true);
		assertTrue(MyInteger.isEven(myIntEven) == true);
		
		assertTrue(myIntOdd.isOdd() == true);
		assertTrue(MyInteger.isOdd(5) == true);
		assertTrue(MyInteger.isOdd(myIntOdd) == true);
		
		assertTrue(myIntOdd.isPrime() == true);
		assertTrue(MyInteger.isPrime(5) == true);
		assertTrue(MyInteger.isPrime(myIntOdd) == true);
		
		assertTrue(myIntEven.isEven() == true);
		assertTrue(MyInteger.isEven(4) == true);
		
		
		
		
		
		
		
	}

}
