import java.util.Scanner;

public class EX08_조건문예제ifelse {

	public static void main(String[] args) {
		
		// 60점 이상이면 합격입니다.
		// 60점 미만이면 불합격입니다.
		
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		// 1. 만약 60점 이상이면 합격입니다. -> 조건문 if
		// 2. 60점 미만이면 붛합격입니다. -> 조건이 아닌 경우 -> else
		if(score >=60) {
			System.out.println("합격입니다.");
		} else {  // 그렇지 않으면 (else는 조건 쓰지 않는다 )
			System.out.println("불합격입니다.");
			
		}

	}

}
