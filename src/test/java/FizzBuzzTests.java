import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tests1.FizzBuzz;

public class FizzBuzzTests {

	@Test
	public void testZeroZero() {
		assertEquals("0", FizzBuzz.Compute(0, 0));
		
	}

	@Test
	public void testOneTwo() {
		assertEquals("12", FizzBuzz.Compute(1, 2));
		
	}
	
	@Test
	public void testOneTwoThree() {
		assertEquals("12Fizz", FizzBuzz.Compute(1, 3));
		
	}
	
	@Test
	public void testOneFour() {
		assertEquals("12Fizz4", FizzBuzz.Compute(1, 4));
		
	}
	
	@Test
	public void testOneFive() {
		assertEquals("12Fizz4Buzz", FizzBuzz.Compute(1, 5));
		
	}

	@Test
	public void testOneSix() {
		assertEquals("12Fizz4BuzzFizz", FizzBuzz.Compute(1, 6));
		
	}
	
	@Test
	public void testOneSeven() {
		assertEquals("12Fizz4BuzzFizz7", FizzBuzz.Compute(1, 7));
		
	}
	
	@Test
	public void testOneNine() {
		assertEquals("12Fizz4BuzzFizz78Fizz", FizzBuzz.Compute(1, 9));
		
	}
	
	
	@Test
	public void testOneTen() {
		assertEquals("12Fizz4BuzzFizz78FizzBuzz", FizzBuzz.Compute(1, 10));
		
	}
	
	
	
	@Test
	public void testOnetwenty() {
		assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", FizzBuzz.Compute(1, 20));
		
	}
}


