import java.util.Random;

public class EX02_�迭�ǽ� {

	public static void main(String[] args) {
		// 1) 10���� ������ �����ϴ� �迭 ����!
		// 2�� �⺻) ����(10~50)���� �迭 ���� ����!
		// 2�� ��ȭ!) �ߺ� ���� �̱�
		// 3) ���� ū ���� � ���̰� ���°�� �ִ��� ã��

		Random rd = new Random();

		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			int num1 = rd.nextInt(10, 51);
			num[i] = num1;

		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		int max = 0;
		int index = 0;
		for (int j = 0; j < num.length; j++) {
			if (max < num[j]) {
				max = num[j];
				index = j;

			}

		}
		System.out.println(max+"�� "+ index+"��°");
	}

}
