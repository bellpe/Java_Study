
public class ex01_�޼ҵ�_10�������� {

	public static void main(String[] args) {
		// 2���� ������ �Է¹޾� ���߿� 10�� �������� ��ȯ�ϴ� �޼ҵ�
		// close10�� ������. �� �� ���� ��� �Ÿ��� ���ٸ� 0�� ��ȯ
		
		// �޼ҵ� ȣ��
		int num1 = 11;
		int num2 = 5;
		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);

	}
	
	// �޼ҵ� ����
	public static int close10(int num1, int num2) {
		int result = 0;
		
		if(Math.abs(num1-10)>Math.abs(num2-10)) {
			result = num2;
		}else if(Math.abs(num1-10)<Math.abs(num2-10)) {
			result = num1;
		}else {
			result = 0;
		}
		return result;
	}

}
