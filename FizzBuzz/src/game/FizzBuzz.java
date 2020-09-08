package game;

public class FizzBuzz {

	public static void main(String[] args) {
		playFizzBuzz(100);
	}
	
	public static void playFizzBuzz(int stop) {
		for(int i = 1; i <= stop; i++) {
			if(isDivisibleBy2(i,3) && isDivisibleBy(i,5)) {
				System.out.println("FIZZ BUZZ!");
			}
			else if(isDivisibleBy2(i,3)) {
				System.out.println("FIZZ!");
			}
			else if(isDivisibleBy2(i,5)) {
				System.out.println("BUZZ!");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	@Deprecated
	private static boolean isDivisibleBy(int input, int divideBy) {
			double result = (double)input / divideBy;
			String s = String.valueOf(result);
			int indexOfDecimal = s.indexOf('.');
			String finalS = s.substring(indexOfDecimal + 1);
			
			return Long.parseLong(finalS) == 0;
		}
	
	private static boolean isDivisibleBy2(int input, int divideBy) {
		double divised = (double)input / divideBy;
		int divisedInteger = (int)divised;
		
		return divised == divisedInteger;
	}
	
}