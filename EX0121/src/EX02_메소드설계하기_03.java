import java.util.Scanner;

public class EX02_메소드설계하기_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 : ");
		int a =scan.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		int b = scan.nextInt();
		
		boolean n1 = divisor1(a,b);
		System.out.println(n1);

	}
	
	public static boolean divisor1(int a, int b) {
		
		if(a%b ==0) {
			boolean divisor2 = true;
			return divisor2;
		}else {
			boolean divisor2 = false;
			return divisor2;
		}
	}

}
