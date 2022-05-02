import java.util.Scanner;

public class EX02_메소드설계하기_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번재 숫자 입력 >> ");
		int n1 = scan.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int n2 = scan.nextInt();
		
		int num1 = num2(n1,n2);
		System.out.print(n1+","+n2+"=");
		System.out.println(num1);

	}
	public static int num2(int a, int b){
		int n1 = 0, n2 = 0;
		if(a<10) {n1 = 10-a;}
		else {n1 = a-10;}
		
		if(b<10) {n2 = 10-b;}
		else {n2 = b-10;}
		
		if(n1>n2) {return b;}
		else if(n2>n1) {return a;}
		else {return-1;}
	}

}
