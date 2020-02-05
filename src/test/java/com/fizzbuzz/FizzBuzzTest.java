package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzzConverter fizzBuzzConverter;
	
	@Before
	public void initializeFizzBuzzInstance() {
		fizzBuzzConverter = new FizzBuzzConverter();
	}
	
	@Test
	public void testFizzBuzzConverterToGetOne() {
		assertEquals("1", fizzBuzzConverter.convert(1));
	}
	
	@Test
	public void testFizzBuzzConverterToGetTwo() {
		assertEquals("2", fizzBuzzConverter.convert(2));
	}
	
	@Test
	public void testFizzBuzzConverterToGetThree() {
		assertEquals("3", fizzBuzzConverter.convert(3));
	}
}