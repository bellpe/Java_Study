import java.util.Scanner;

public class EX06_조건문연습 {

	public static void main(String[] args) {
		
		// 1. int타입 변수 age 선언, 키보드로 값을 입력 받기. -> Scanner!!
		int age = 0;
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		
		// 2. 만약에 age가 20보다 크거나 같다면 -> 조건문!!
		// if (조건식) { 실행문장 }
		if (age >= 20) {
			// 3. "성인입니다." 출력
			System.out.println("성인입니다.");
			
		}
		
		
		

	}

}
