
public class Ex03_�޼ҵ�_�迭�����ձ��ϱ� {

	public static void main(String[] args) {
		// ������ �迭�� �Է� �޾� ������ ����� ��ȯ�ϴ� �޼ҵ�
		// getArraySum�� ������.
		// �޼ҵ� ȣ��
		int[] array = {3,10,8,7,1};
		int arr = getArraySum(array);
		System.out.println(arr);
		// int A =30;
		// chage

	}
	// call by value(���� ����)
	// call by reference (�ּ� ��)
	public static int getArraySum(int[] arr) {
		int result = 0; // ������ ��� ����
		for(int i=0; i<arr.length; i++) {
			result += arr[i]; // ���� ���� result = result+ arr[i];
		}
		return result;
	}
	

}
