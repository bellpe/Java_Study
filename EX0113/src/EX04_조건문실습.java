import java.util.Scanner;

public class EX04_조건문실습 {

	public static void main(String[] args) {
		// 예제 1.
		// 숫자를 하나 입력 받아서 양수, 음수, 0을 판별해주세요!
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println("양수입니다!");
		}else if(num == 0) {
			System.out.println("0입니다!");
		}else {
			System.out.println("음수입니다!");
		}
		
		// 예제 2.
		// 성과급 계산 프로그램 만들기 => 사진 카톡에 있음
		
		// 예제 3.
		// 가위바위보 게임 만들기!

	}

}
