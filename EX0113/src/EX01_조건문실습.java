import java.util.Scanner;

public class EX01_���ǹ��ǽ� {

	public static void main(String[] args) {
		// ����, ����, ���� ������ �Է¹޾Ƽ� �հ�/���հ� ���θ� �Ǻ����ְ� �ͽ��ϴ�!
		// ��� 70���� ������ �հ��ε�! �Ѱ����̶� 60�� �̸��̸� ����!
		// 80, 90, 80 => �հ�
		// 80, 55, 90 => ���հ�

		Scanner scan = new Scanner(System.in);
		System.out.print("��������");
		int kor = scan.nextInt();
		System.out.print("��������");
		int eng = scan.nextInt();
		System.out.print("��������");
		int math = scan.nextInt();

		int a = kor + eng + math;

		if (a/ 3 >= 70 && kor >= 60 && eng >= 60 && math >= 60) {
			System.out.println("�հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�!");
		}

		if( a/3 < 70 || kor < 60 || eng < 60 || math < 60) {
			System.out.println("���հ��Դϴ�!");
		}else {
			System.out.println("�հ��Դϴ�!");
		}
		// ���հ��̾��� �� ���� ����ϱ�

	}

}
