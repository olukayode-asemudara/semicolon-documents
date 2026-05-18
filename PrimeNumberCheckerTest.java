import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PrimeNumberCheckerTest{

	@Test
	public void testThatFactorsAreCounted(){
		//Given
		int number = 12;
		
		//When
		int expectedCount = PrimeNumberChecker.countFactorsOf(number);

		//check
		int actualCount = 6;
		assertEquals(actualCount, expectedCount);
	}

	@Test
	public void testThatCountIs2NumberIsPrime(){
		//Given
		int number = 17;
		
		//When
		boolean expected = PrimeNumberChecker.isPrime(number);

		assertTrue(expected);
	}

	@Test
	public void testThatCountIsNot2NumberIsNotPrime(){
		//Given
		int number = 18;
		
		//When
		boolean expected = PrimeNumberChecker.isPrime(number);

		assertFalse(expected);
	}

}
