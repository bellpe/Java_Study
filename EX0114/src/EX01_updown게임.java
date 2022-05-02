import java.util.Random;
import java.util.Scanner;

public class EX01_updown게임 {

	public static void main(String[] args) {
		// 1) 컴퓨터가 랜덤으로 1~100까지 하나 뽑는다!
		// 2) 숫자를 입력한다!
		// 3) 랜덤수보다 입력한 수가 더 크면 DOWN 이라고 출력한다!
		// 4) 랜덤수보다 입력한 수가 더 작으면 UP 이라고 출력한다!
		// 5) 맞추면 마셔마셔 먹고 죽어 네발로 기어가~~ 네발로 기어가~~ 출력한다!
		
		// 랜덤 수 뽑는 법!(★Scanner랑 헷갈리지 말자!!!★)
		// 1. 도구 준비
		Random rd = new Random(); // 도구니까 import 까지! (ctrl+shift+o)
		Scanner scan = new Scanner(System.in);
		// 2. 숫자뽑기!
		int rdNum = rd.nextInt(100)+1;
		int num1 = 0;
		// (99)=0~99 (0~n-1까지) (+1 하면 1부터 100까지)
		// (10, 100); = 10~99 (0~n-1)
		
		System.out.println("랜덤 수 : " + rdNum);
		
		while(rdNum != num1) { // 반복이 계속될 조건 => 틀렸으면 반복!
			System.out.print("입력한수 : ");
			num1 = scan.nextInt();
			
			if(rdNum < num1) {
				System.out.println("DOWN");
			}else if(rdNum > num1) {
				System.out.println("UP");
			}else {
				System.out.println("마셔마셔 먹고 죽어 네발로 기어가~~ 네발로 기어가~~");
			}
		}
		
		

	}

}
