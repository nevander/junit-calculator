package test;

import main.Calculator;

import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testSubstract() throws Exception {
		double z1 = 1.7;
		double z2 = 0.7;
		
		double wynik = classUnderTest.subtract(z1, z2);
		Assert.assertEquals(1, wynik, 0.00001);
	}
	@Test
	public void testMultiply() throws Exception {
		double z1 = 2;
		double z2 = 3;
		
		double wynik = classUnderTest.multiply(z1, z2);
		Assert.assertEquals(6, wynik, 0.00001);
	}
	@Test
	public void testDevide() throws Exception {
		double z1 = 6;
		double z2 = 2;
		
		double wynik = classUnderTest.divide(z1, z2);
		Assert.assertEquals(3, wynik, 0.00001);
	}
	@Test (expected = Exception.class)
	public void testDevide1() throws Exception {
		double z1 = 6;
		double z2 = 0;
		
		double wynik = classUnderTest.divide(z1, z2);
		
	}
	@Test
	public void testSum() throws Exception {
		double z1 = 2;
		double z2 = 3;
		
		double wynik = classUnderTest.sum(z1, z2);
		Assert.assertEquals(5, wynik, 0.00001);
	}
}
