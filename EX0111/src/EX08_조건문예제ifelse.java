import java.util.Scanner;

public class EX08_���ǹ�����ifelse {

	public static void main(String[] args) {
		
		// 60�� �̻��̸� �հ��Դϴ�.
		// 60�� �̸��̸� ���հ��Դϴ�.
		
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		// 1. ���� 60�� �̻��̸� �հ��Դϴ�. -> ���ǹ� if
		// 2. 60�� �̸��̸� ���հ��Դϴ�. -> ������ �ƴ� ��� -> else
		if(score >=60) {
			System.out.println("�հ��Դϴ�.");
		} else {  // �׷��� ������ (else�� ���� ���� �ʴ´� )
			System.out.println("���հ��Դϴ�.");
			
		}

	}

}
