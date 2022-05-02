import java.util.Arrays;

public class ex02_�޼ҵ�_���� {

	public static void main(String[] args) {
		// 1. �� ����(base, divisor)�� �Է¹޾Ƽ� divisor�� base�� ������� �ƴ�����
		// �˷��ִ� �޼ҵ� isDivisor�� ������
		// isDvisor(10,2)
		boolean result = isDivisor(10, 2);
		System.out.println(result); // true
		
		boolean result2 = isDivisor(10, 3);
		System.out.println(result2); // false
		
		// 2. ���� �Ѱ�(number)�� �Է¹޾� number�� ����� ��ȯ�ϴ� �޼ҵ�
		// getDivisors�� ������.
		// getDivisors(10) -> 10�� ����� -> "1,2,5,10"
		// getDivisors(6) -> 6�� ����� -> "1,2,3,6"
		String result3 = getDivisors(10);
		System.out.println(result3); // 1,2,5,10
		
		
		// 3. �ϳ��� ������ �Է¹޾� �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��ϴ� �޼ҵ�
		// isPrimeNumber�� ������
		boolean result4 = isPrimeNumber(13);
		System.out.println(result4);

	}
	
	public static boolean isDivisor(int base, int divisor) {
		boolean result = false;
		
		if(base%divisor==0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	} 
	
	public static String getDivisors(int number) {
		String result = "";
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				result += (i+","); // result = result + i;
			}
				
			
		}
		
		return result+number;
	}
		
	public static boolean isPrimeNumber(int number ) {
		String divisors = getDivisors(number);
		String[] array = divisors.split(",");
		System.out.println(Arrays.toString(array)); // �迭�� �� ��ҵ��� ���ڿ��� ������ִ� ���
		
		// ������ ���� ������� �̿��� �Ҽ����� �ƴ��� �Ǻ��ϴ� �˰���
		// ��Ʈ : �迭�� ����
		
		
		return array.length == 2;
	}
		
		
}
	


