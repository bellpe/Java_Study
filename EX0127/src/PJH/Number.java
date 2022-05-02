package PJH;
import java.util.Arrays;

public class Number {
	public static boolean isDivisor(int base, int divisor) {
		boolean result = false;
		if(base%divisor==0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	} 
	
	public static String getDivisors(int number) {
		String result = "";
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				result += (i+","); 
			}
		}
		return result+number;
	}
		
	public static boolean isPrimeNumber(int number ) {
		String divisors = getDivisors(number);
		String[] array = divisors.split(",");
		System.out.println(Arrays.toString(array));
		return array.length == 2;
	}
}
