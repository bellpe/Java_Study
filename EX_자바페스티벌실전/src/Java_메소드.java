import java.util.Scanner;

public class Java_�޼ҵ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ݾ� : ");
		int money = sc.nextInt();
		System.out.print("�ܵ���ȯ");
		System.out.println("10000��" + money/10000+"��");
		System.out.println("5000��" + money%(10000/5000)+"��");
		System.out.println("1000��" + money%(10000/1000)+"��");
		System.out.println("500��" + money%(10000/500)+"��");
		System.out.println("100��" + money%(10000/100)+"��");
		

	}
	
}
