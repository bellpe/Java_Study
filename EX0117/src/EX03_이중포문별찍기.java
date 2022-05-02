import java.util.Scanner;

public class EX03_이중포문별찍기 {

	public static void main(String[] args) {
		
		
		// 숫자 입력 받아서 별찍기
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
//		for(int i=1; i<=num; i++) {
//			 // System.out.println("*");
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		// 별 거꾸로 찍기
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 

	}

}
