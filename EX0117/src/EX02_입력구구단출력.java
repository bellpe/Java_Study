import java.util.Scanner;

public class EX02_�Է±�������� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num = scan.nextInt();
		System.out.print("���� �Է� : ");
		int num2 = scan.nextInt();
		
		System.out.println(num+"* 1 = " +num*1);
		
		for(int i=1; i<=num2; i++) {
			System.out.println(num+"*"+i + "=" + num*i);
		}

	}

}
