import java.util.Arrays;

public class ex02_메소드_재사용 {

	public static void main(String[] args) {
		// 1. 두 정수(base, divisor)를 입력받아서 divisor가 base의 약수인지 아닌지를
		// 알려주는 메소드 isDivisor를 만들어보자
		// isDvisor(10,2)
		boolean result = isDivisor(10, 2);
		System.out.println(result); // true
		
		boolean result2 = isDivisor(10, 3);
		System.out.println(result2); // false
		
		// 2. 정수 한개(number)를 입력받아 number의 약수를 반환하는 메소드
		// getDivisors를 만들어보자.
		// getDivisors(10) -> 10의 약수들 -> "1,2,5,10"
		// getDivisors(6) -> 6의 약수들 -> "1,2,3,6"
		String result3 = getDivisors(10);
		System.out.println(result3); // 1,2,5,10
		
		
		// 3. 하나의 정수를 입력받아 해당 숫자가 소수인지 아닌지 판별하는 메소드
		// isPrimeNumber를 만들어보자
		boolean result4 = isPrimeNumber(13);
		System.out.println(result4);

	}
	
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
				result += (i+","); // result = result + i;
			}
				
			
		}
		
		return result+number;
	}
		
	public static boolean isPrimeNumber(int number ) {
		String divisors = getDivisors(number);
		String[] array = divisors.split(",");
		System.out.println(Arrays.toString(array)); // 배열의 각 요소들을 문자열로 만들어주는 기능
		
		// 위에서 구한 약수들을 이용해 소수인지 아닌지 판별하는 알고리즘
		// 힌트 : 배열의 길이
		
		
		return array.length == 2;
	}
		
		
}
	


