import java.util.Scanner;

public class Ex02_�Է� {

	public static void main(String[] args) {
		// �Է¹޴� ���(��ǻ�Ͱ� ����ڿ��� �Է¹޴� ��)
		// 1) �Է¹޴� ���� �ʿ�!!!
		Scanner scan = new Scanner(System.in);
		// ctrl + shift + o => import
		// 2) �������!
		// 2-1) ���� �Է� �ޱ�
		System.out.print("���ڸ� �Է��ϼ��� >> ");
		int num = scan.nextInt();
		// 4byte ������ num�̶�� �̸��� �޸𸮸� �����ϰ� scanner�� ���� �Է¹��� ���� �����Ͻÿ�.
		
		// 2-2) �Է��� ���ڸ� 2�� ������ ������ְ� �ʹ�!
		// �Է��� ���ڸ� �����س�����(����ؾ���)!! => ����!(=���� �����ϴ� ����:�޸�)
		System.out.println(num / 2);

	}

}
