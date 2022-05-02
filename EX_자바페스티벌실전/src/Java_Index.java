
public class Java_Index {

	public static void main(String[] args) {
		
		boolean result = isDivide(10, 2);
		System.out.println("결과 확인 : "+result); // true
		
		boolean result2 = isDivide(10, 3);
		System.out.println("결과 확인 : "+result2); // false

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


