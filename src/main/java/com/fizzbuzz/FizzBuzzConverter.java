package com.fizzbuzz;

class FizzBuzzConverter {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FizzBuzz = "FizzBuzz";

	String convert(int number) {
		if (isFizzBuzzNumber(number))
			return FizzBuzz;
		else if (isFizzNumber(number))
			return FIZZ;
		else if (isBuzzNumber(number))
			return BUZZ;
		return String.valueOf(number);
	}

	private boolean isFizzNumber(int number) {
		if (number % 3 == 0)
			return true;
		return false;
	}

	private boolean isBuzzNumber(int number) {
		if (number % 5 == 0)
			return true;
		return false;
	}

	private boolean isFizzBuzzNumber(int number) {
		if (number % (3 * 5) == 0)
			return true;
		return false;
	}
}