import java.util.Scanner;

public class EX02_���ǹ� {

	public static void main(String[] args) {
		// ��ĳ�ʷ� ����(num) �ϳ� �Է¹ް� ������ּ���

		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� >> ");

		int num = scan.nextInt();

		// �������� ��� ������ �հ�/���հ�, Ȧ��/¦�� �����ߴ�! 2�����θ� �Ǵ��� �� �־���!
		// �׷��� �̹����� ����� �ο����ڰ� �մϴ�
		// 90�� �̻��̸� A, 80~90 ���̸� B, 70~80 ���̸� C, �������� F!

		if (num > 90) {
			System.out.println("A����̽ó׿�!");
		}

		if (num >= 80) {
			System.out.println("B����̽ó׿�!");
		} else if (num >= 70) {
			System.out.println("C����̽ó׿�!");
		} else {
			System.out.println("F����̽ó׿�!");
		}

	}

}
