import java.util.Scanner;

public class EX02_입력구구단출력 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int num = scan.nextInt();
		System.out.print("범위 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.println(num+"* 1 = " +num*1);
		
		for(int i=1; i<=num2; i++) {
			System.out.println(num+"*"+i + "=" + num*i);
		}

	}

}
