package com.fizzbuzz;

class FizzBuzzConverter {

	private static final String FIZZ = "Fizz";

	String convert(int number) {
		if (isFizzNumber(number))
			return FIZZ;
		return String.valueOf(number);
	}

	private boolean isFizzNumber(int number) {
		if (number % 3 == 0)
			return true;
		return false;
	}
}