
public class ex01_�޼ҵ� {

	public static void main(String[] args) {
		// 2���� ����� �Է¹޾� �� ū ���� ��ȯ�ϴ� �޼ҵ�
		// largerNumber�� ������. ��, �� ���� ũ�Ⱑ ���ٸ� 0�� ��ȯ�Ѵ�.
		
		// �޼ҵ� ȣ��(���)
		int result = largerNumber(10,10);
		System.out.println(result);

	}
	
	// �޼ҵ� ����
	public static int largerNumber(int num1, int num2) {
		// �� ū ���� ��ȯ�ϴ� �˰��� �ۼ�
		int result=0; // �޼ҵ��� ��� ���� ��� ����
		
		if(num1>num2) {
			result = num1;
		}else if(num2>num1) {
			result = num2;
		}else if(num1==num2) {
			result = 0;
		}
		
		return result;
	}

}
