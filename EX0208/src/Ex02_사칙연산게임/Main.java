package Ex02_��Ģ�������;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// ����, ����, ����, �������� �����Ӱ� ������ �� �ִ�
		// ��Ģ���� ������ �о��ؼ� ������.
		IGame plus = new PlusGame();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("====��Ģ���� ���� ����====");
		plus.makeRandom(); // ���� ����(���������� ���� 2�� ����)
		String msg = plus.getQuizMSG(); // ����޼��� ����
		System.out.print(msg); // 4+4=
		int input = sc.nextInt(); // ����ڰ� ������ �Է�
		boolean isSuccess = plus.checkAnswer(input); // ����Ȯ��
		
		System.out.println(isSuccess?"�����Դϴ�.":"Ʋ�Ƚ��ϴ�.");

	}

}
