import java.util.Scanner;

public class EX01_조건문실습 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아서 합격/불합격 여부를 판별해주고 싶습니다!
		// 평균 70점이 넘으면 합격인데! 한과목이라도 60점 미만이면 과락!
		// 80, 90, 80 => 합격
		// 80, 55, 90 => 불합격

		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수");
		int kor = scan.nextInt();
		System.out.print("영어점수");
		int eng = scan.nextInt();
		System.out.print("수학점수");
		int math = scan.nextInt();

		int a = kor + eng + math;

		if (a/ 3 >= 70 && kor >= 60 && eng >= 60 && math >= 60) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}

		if( a/3 < 70 || kor < 60 || eng < 60 || math < 60) {
			System.out.println("불합격입니다!");
		}else {
			System.out.println("합격입니다!");
		}
		// 불합격이었을 때 사유 출력하기

	}

}
