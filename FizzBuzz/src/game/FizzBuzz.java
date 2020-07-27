package game;

public class FizzBuzz {

	public static void main(String[] args) {
		playFizzBuzz(100);
	}
	
	public static void playFizzBuzz(int stop) {
		for(int i = 1; i <= stop; i++) {
			if(isDivisibleBy(i,3) && isDivisibleBy(i,5)) {
				System.out.println("FIZZ BUZZ!");
			}
			else if(isDivisibleBy(i,3)) {
				System.out.println("FIZZ!");
			}
			else if(isDivisibleBy(i,5)) {
				System.out.println("BUZZ!");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isDivisibleBy(int input, int divideBy) {
			Double result = (double)input / divideBy;
			String s = String.valueOf(result);
			int indexOfDecimal = s.indexOf('.');
			String finalS = s.substring(indexOfDecimal + 1);
			
			return Long.parseLong(finalS) == 0;
		}
	
}