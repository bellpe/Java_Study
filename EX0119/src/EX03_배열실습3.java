import java.util.Arrays;
import java.util.Random;

public class EX03_�迭�ǽ�3 {

	public static void main(String[] args) {
		// ���� �� �ǽ�!
		// 1�ܰ�) �迭�� ����ִ� �� ��ŭ ��Ʈ ���!
		// 3 : ������
		// 4 : ��������
		// 2 : ����
		// 4 : ��������
		// 1 : ��
//		int[] heart = {3,4,2,4,1};
//		for(int i=0; i<heart.length; i++) {
//			System.out.print(heart[i]+" : ");
//			for(int j=0; j<heart[i]; j++) {
//				System.out.print("��");
//			}
//			System.out.println();
		// 2�ܰ�)
		// �������� 1~5������ �� 50�� �̰� �� ���ں� ��������
		int[] numbers = new int[30];
		Random rand = new Random();
		for(int i=0; i<numbers.length; i++) {
			numbers [i] = rand.nextInt(1,6);
		}
		System.out.println(Arrays.toString(numbers));
		int[] cnt = new int[5];
		for(int i=0; i<numbers.length; i++) {
			cnt[numbers[i]-1]++;
		}
		System.out.println(Arrays.toString(cnt));
		
		
		}
		
		
	
		
		// �����!)
		// A,B,C,D,F �߿� �������� 50�� �̰� �� ���ĺ� �� ���� ��� �׷���(��) �׸���
		// A (10��) : �� �� �� �� �� �� �� �� �� ��
		// B (8��) : �� �� �� �� �� �� �� ��

	}


