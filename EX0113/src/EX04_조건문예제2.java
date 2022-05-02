import java.util.Scanner;

public class EX04_조건문예제2 {

	public static void main(String[] args) {
		// 예제 2.
		// 성과급 계산 프로그램 만들기 => 사진 카톡에 있음
		// 실적액을 입력받아 총 급여를 계산하는 프로그램을 만드세요!
		
		Scanner scan = new Scanner(System.in);
		System.out.print("실적을 입력하세요 : ");
		int cnt = scan.nextInt(); 
		// 실적에 얼마인지에 따라서 보너스가 달라짐
		int bon1 = 0;
		int bon2 = 20;
		int bon3 = 30;
		int bon4 = 50;
		// 99만원 이하는 보너스가 0
		if(99 >= cnt) { // 99이하인 사람들을 걸렀음! 100 이상인 사람들은 여기서 살아남았다!
			System.out.println("총 급여는 " +(cnt+bon1)+ "원");
		}else if(199 >= cnt) { // 100~199 걸러야 됨
			System.out.println("총 급여는 " +(cnt+bon2)+ "원");
		}else if(299 >= cnt) {
			System.out.println("총 급여는 " +(cnt+bon3)+ "원" );
		}else { // 300 이상인 사람들
			System.out.println("총 급여는 " +(cnt+bon4)+ "원");
		}

	}

}
