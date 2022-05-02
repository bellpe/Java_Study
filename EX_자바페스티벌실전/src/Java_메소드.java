import java.util.Scanner;

public class Java_메소드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 금액 : ");
		int money = sc.nextInt();
		System.out.print("잔돈변환");
		System.out.println("10000원" + money/10000+"개");
		System.out.println("5000원" + money%(10000/5000)+"개");
		System.out.println("1000원" + money%(10000/1000)+"개");
		System.out.println("500원" + money%(10000/500)+"개");
		System.out.println("100원" + money%(10000/100)+"개");
		

	}
	
}
