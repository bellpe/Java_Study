import java.util.Random;
import java.util.Scanner;

public class EX02_plusGame {

	public static void main(String[] args) {
		// 1. 랜덤으로 정수 2개 뽑아 출력 -> Random 범위는 1~20
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		
	
		
		int rdNum = rd.nextInt(20)+1;
		int rdNum1 = rd.nextInt(20)+1;
		// syso로 랜덤 수 확인!
		System.out.println("랜덤한 수1 " + rdNum);
		System.out.println("랜덤한 수2 " + rdNum1);
		// 2. 사용자가 합을 입력하도록! -> Scanner
		System.out.print("합 : " + rdNum + "+" + rdNum1 + "=" );
		int num = scan.nextInt();
		// 3. 정답이라면 Success! 틀렸다면 Fail! 출력
		if(rdNum+rdNum1 == num) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}

	}

}
