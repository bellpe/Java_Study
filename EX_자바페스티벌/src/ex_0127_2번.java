
public class ex_0127_2�� {

	public static void main(String[] args) {
		boolean result = isDivide(10, 2);
		System.out.println("��� Ȯ�� : "+result); // true
		
		boolean result2 = isDivide(10, 3);
		System.out.println("��� Ȯ�� : "+result2); // false

	}
	public static boolean isDivide(int base, int divisor) {
		boolean result = false;
		
		if(base%divisor==0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}

}
