import java.util.Arrays;

public class Ex04_�޼ҵ�_�迭��¦Ȧ���Ǵ��ϱ� {

	public static void main(String[] args) {
		// ������ �迭�� �Է����� ������ �� ���� ¦������ Ȧ������ �Ǵ��ؼ�
		// �迭�� ��ȯ�ϴ� �޼ҵ� isOddEvenArray�� ������.
		// ¦����� true, Ȧ����� false�� ���� �Ѵ�.
		int[] inputArray = {9,10,5,1};
		boolean[] result = isOddEvenArray(inputArray);
		System.out.println(Arrays.toString(result));

	}
	
	public static boolean[] isOddEvenArray(int[] array) {
		boolean[] result = new boolean[array.length] ;
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				result[i] = true;
			}else {
				result[i] = false;
			}
		}
		return result;
	}

}
