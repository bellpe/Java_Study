
public class EX04_������ {

	public static void main(String[] args) {
		
		// 1. ��� ���ϱ�(��� = ������ �� �������� 0�� ��)
//		System.out.println("6�� ����� ");
//		for(int i=1; i<6; i++) { // 1���� 5���� 1�� ����
//			if(6%i==0) { //
//				System.out.println(i+" ");
//			}
//		}
		// 2. ���������� �Ǵ� (6�� ������ 1, 2 ,3�� ���� 6�� ���� ��)
		
//		int sum=0;
//		
//		for(int i=1; i<6; i++) {
//			if(6%i ==0) { // i�� 6�� �����??
//				sum+=i;
//			}
//		}
//		if(sum == 6) {
//			System.out.println("�������Դϴ�!");
//		}
		
		
		// 3. 1~1000���� �ݺ��� �ϸ鼭 ������ �Ǵ�
		
		//1���� 1000���� 1�� ���� // ���� �� ���� �ٲٱ� alt+shift+r
		// target => ���������� �ƴ��� �Ǵ��� ��
		// ����! target�� 1���� target-1���� �����鼭 ����� ���� ���� ��
		// ����� ���� target�� ������ target�� ������!
		for(int target=1; target<=1000; target++) {
			int sum=0;
			
			for(int i=1; i<target; i++) {
				if(target%i ==0) { // i�� 6�� �����??
					sum+=i;
				}
			}
			if(sum == target) {
				System.out.println(target+"�� �������Դϴ�!");
			}
		}

	}

}
