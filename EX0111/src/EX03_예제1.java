import java.util.Scanner;

public class EX03_예제1 {

	public static void main(String[] args) {
		// 예제 1.java 숫자를 입력받아 3으로 나눈 결과를 출력하세요(소수점까지)
		// 예제 2.java 더치페이 계산기를 만들어봅시다!
		//      총 금액과 인원수를 입력받아 한사람당 얼마씩 내야하는지 출력하세요
		//ex)
		// 총금액 : 5000 <-
		// 인원수 : 2 <-
		// 한 사람당 2500원!
		
		// 예제 3. java
		// % 이 연산자는 나머지를 구하는 연산자입니다.
		// 5%2 = 1
		// 10%8 = 2
		// 10%6 = 4
		// 이 연산자를 사용하여 54600원을 거슬러 줄 때
		// 10000원, 5000원, 1000원, 500원, 100원
		// 몇 개씩 거슬러줘야하는지 출력!
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		int num = scan.nextInt();
		System.out.println(num / 3f);

	}

}
