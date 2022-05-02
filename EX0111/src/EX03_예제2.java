import java.util.Scanner;

public class EX03_예제2 {

	public static void main(String[] args) {
	
		// 1) 입력받을 도구를 준비한다.
		// 2) 도구를 사용하여 정수(금액)를 입력받아 저장(변수)한다.
		// 3) 도구를 사용하여 정수(인원수)를 입력받아 저장(변수)한다.
		// 4) 금액/인원수의 결과를 출력한다
		Scanner scan1 = new Scanner(System.in);
		System.out.println();
		int num = scan1.nextInt();
		int num1 = scan1.nextInt();
		System.out.println(num/num1);

	}

}
