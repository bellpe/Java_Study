import java.util.Random;
import java.util.Scanner;

public class EX02_plusGame {

	public static void main(String[] args) {
		// 1. �������� ���� 2�� �̾� ��� -> Random ������ 1~20
		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		
	
		
		int rdNum = rd.nextInt(20)+1;
		int rdNum1 = rd.nextInt(20)+1;
		// syso�� ���� �� Ȯ��!
		System.out.println("������ ��1 " + rdNum);
		System.out.println("������ ��2 " + rdNum1);
		// 2. ����ڰ� ���� �Է��ϵ���! -> Scanner
		System.out.print("�� : " + rdNum + "+" + rdNum1 + "=" );
		int num = scan.nextInt();
		// 3. �����̶�� Success! Ʋ�ȴٸ� Fail! ���
		if(rdNum+rdNum1 == num) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}

	}

}
