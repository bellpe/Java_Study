
public class EX03_�ڹٹ迭���� {

	public static void main(String[] args) {
		// 1. ¦����° �ε����� ���
		int[] num = {13, 5, 7, 17, 3, 16, 19, 20, 2 ,1 };
		for(int i=0; i<=9; i+=2) {
			System.out.println(num[i]+" ");
		}
		System.out.println();
		
		// 2. Ȧ�� ����� ���
		int sum = 0;
		for(int i=0; i<=9; i++) {
			if(num[i]%2==1) {
				sum++;
			}
		}
		System.out.println("Ȧ����"+sum+"�� �Դϴ�");
		
		// 3. ��� ���� ��� ���ϱ�
		int hap=0;
		double avg=0;
		for(int i=0; i<=9; i++) {
			hap += num[1];
		}
		avg = hap/10.0;
		System.out.println("��� ���� �����"+avg);

	}

}
