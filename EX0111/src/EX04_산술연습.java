import java.util.Scanner;

public class EX04_산술연습 {

	public static void main(String[] args) {
		// 아름, 국어, 영어, 수학점수를 입력받아 합계와 평균을 출혁하세요
		// ㅇㅇㅇ님 합계 :_점, 평균 :_점
		
		// 1. 데이터(model), 2. 입력부/출력부(VieW), 3. 연산(control)
		
		Scanner scan = new Scanner(System.in);
		
		 // 공간만 미리 생성!
		int kor = 0, eng = 0, math = 0, total = 0;
		double avg = 0;
		
		// 입력부/출력부
		System.out.println("이름 : ");
		String name = scan.next(); // 문자열 입력받는 방법
		
		System.out.println("국어: ");
		kor = scan.nextInt();
		System.out.println("영어 : ");
		eng = scan.nextInt();
		System.out.println("수학: ");
		math = scan.nextInt();
		
		//연산
		total = kor + eng + math;
		avg = total / 3.0;
		
		//결과출력
		System.out.println("합계 :" + total);
		System.out.println("평균 :" + avg);

	}

}
