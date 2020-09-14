package game;

import java.util.stream.*;

public class FizzBuzz {

	public static void main(String[] args) {
		playFizzBuzz2(100);
	}
	
	@Deprecated
	public static void playFizzBuzz(int stop) {
		for(int i = 1; i <= stop; i++) {
			if(isDivisible(i,3) && isDivisible(i,5)) {
				System.out.println("FIZZ BUZZ!");
			}
			else if(isDivisible(i,3)) {
				System.out.println("FIZZ!");
			}
			else if(isDivisible(i,5)) {
				System.out.println("BUZZ!");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public static void playFizzBuzz2(int stop) {
		IntStream.range(1, stop + 1).forEach(i -> {
			if(isDivisible2(i,3) && isDivisible2(i,5)) {
				System.out.println("FIZZ BUZZ!");
			}
			else if(isDivisible2(i,3)) {
				System.out.println("FIZZ!");
			}
			else if(isDivisible2(i,5)) {
				System.out.println("BUZZ!");
			}
			else {
				System.out.println(i);
			}
		});
	}
	
	@Deprecated
	private static boolean isDivisible(int input, int divideBy) {
			double result = (double)input / divideBy;
			String s = String.valueOf(result);
			int indexOfDecimal = s.indexOf('.');
			String finalS = s.substring(indexOfDecimal + 1);
			
			return Long.parseLong(finalS) == 0;
		}
	
	private static boolean isDivisible2(int input, int divideBy) {
		return (double)input / divideBy == input / divideBy;
	}
	
}