
public class EX04_비교연산 {

	public static void main(String[] args) {
		boolean isTrue = (3 < 5);
		System.out.println(isTrue);
		
		boolean isTrue2 = (5 != 5);
		System.out.println(isTrue2);
		
		boolean isTrue3 = (3 == 3.0);
		System.out.println(isTrue3);
		
		
		
		
		System.out.println(("== 논리연산 배우는 중 =="));
		int input = 15;
		
		// (입력한 숫자가 10보다 크고 짝수라면)
		boolean isTrue9 = (input > 10) && (input % 2 == 0);
		System.out.println(isTrue9);
		
		// (입력한 숫자가 10보다 크거나 짝수라면)
		boolean isTrue8 = (input > 10) || (input % 2 == 0);
		System.out.println(isTrue8);

	}

}
