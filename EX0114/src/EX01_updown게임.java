import java.util.Random;
import java.util.Scanner;

public class EX01_updown���� {

	public static void main(String[] args) {
		// 1) ��ǻ�Ͱ� �������� 1~100���� �ϳ� �̴´�!
		// 2) ���ڸ� �Է��Ѵ�!
		// 3) ���������� �Է��� ���� �� ũ�� DOWN �̶�� ����Ѵ�!
		// 4) ���������� �Է��� ���� �� ������ UP �̶�� ����Ѵ�!
		// 5) ���߸� ���Ÿ��� �԰� �׾� �׹߷� ��~~ �׹߷� ��~~ ����Ѵ�!
		
		// ���� �� �̴� ��!(��Scanner�� �򰥸��� ����!!!��)
		// 1. ���� �غ�
		Random rd = new Random(); // �����ϱ� import ����! (ctrl+shift+o)
		Scanner scan = new Scanner(System.in);
		// 2. ���ڻ̱�!
		int rdNum = rd.nextInt(100)+1;
		int num1 = 0;
		// (99)=0~99 (0~n-1����) (+1 �ϸ� 1���� 100����)
		// (10, 100); = 10~99 (0~n-1)
		
		System.out.println("���� �� : " + rdNum);
		
		while(rdNum != num1) { // �ݺ��� ��ӵ� ���� => Ʋ������ �ݺ�!
			System.out.print("�Է��Ѽ� : ");
			num1 = scan.nextInt();
			
			if(rdNum < num1) {
				System.out.println("DOWN");
			}else if(rdNum > num1) {
				System.out.println("UP");
			}else {
				System.out.println("���Ÿ��� �԰� �׾� �׹߷� ��~~ �׹߷� ��~~");
			}
		}
		
		

	}

}
