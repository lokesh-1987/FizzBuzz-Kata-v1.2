package com.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private static final String _1 = "1";
	private static final String _2 = "2";
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FizzBuzz = "FizzBuzz";
	
	private FizzBuzzConverter fizzBuzzConverter;
	
	@Before
	public void initializeFizzBuzzInstance() {
		fizzBuzzConverter = new FizzBuzzConverter();
	}
	
	@Test
	public void testFizzBuzzConverterToGetOne() {
		assertEquals(_1, fizzBuzzConverter.convert(1));
	}
	
	@Test
	public void testFizzBuzzConverterToGetTwo() {
		assertEquals(_2, fizzBuzzConverter.convert(2));
	}
	
	@Test
	public void testFizzBuzzConverterToGetThree() {
		assertEquals(FIZZ, fizzBuzzConverter.convert(3));
	}
	
	@Test
	public void testFizzBuzzConverterToGetSix() {
		assertEquals(FIZZ, fizzBuzzConverter.convert(6));
	}
	
	@Test
	public void testFizzBuzzConverterToGetMultiplesOfThreeAsFizz() {
		assertEquals(FIZZ, fizzBuzzConverter.convert(9));
	}
	
	@Test
	public void testFizzBuzzConverterToGetFive() {
		assertEquals(BUZZ, fizzBuzzConverter.convert(5));
	}
	
	@Test
	public void testFizzBuzzConverterToGetTen() {
		assertEquals(BUZZ, fizzBuzzConverter.convert(10));
	}
	
	@Test
	public void testFizzBuzzConverterToGetMultiplesOfFiveAsBuzz() {
		assertEquals(BUZZ, fizzBuzzConverter.convert(25));
	}
	
	@Test
	public void testToGetMultiplesOfThreeAndFiveAsFizzBuzz() {
		assertEquals(FizzBuzz, fizzBuzzConverter.convert(15));
	}
}