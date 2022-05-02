import java.util.Scanner;

public class EX02_조건문 {

	public static void main(String[] args) {
		// 스캐너로 숫자(num) 하나 입력받게 만들어주세요

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");

		int num = scan.nextInt();

		// 이전까지 배운 내용은 합격/불합격, 홀수/짝수 구분했다! 2갈래로만 판단할 수 있었다!
		// 그런데 이번에는 등급을 부여하자고 합니다
		// 90점 이상이면 A, 80~90 사이면 B, 70~80 사이면 C, 나머지면 F!

		if (num > 90) {
			System.out.println("A등급이시네요!");
		}

		if (num >= 80) {
			System.out.println("B등급이시네요!");
		} else if (num >= 70) {
			System.out.println("C등급이시네요!");
		} else {
			System.out.println("F등급이시네요!");
		}

	}

}
