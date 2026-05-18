public class PrimeNumberChecker{
	public static int countFactorsOf(int numberToCheck){
	
	int count = 0;

		for (int factor = 1; factor <= numberToCheck; factor++){
			if (numberToCheck % factor == 0) count++;
		}
		return count;
	}

	public static boolean isPrime(int numberToCheck){
		return countFactorsOf(numberToCheck) == 2;
	}
}