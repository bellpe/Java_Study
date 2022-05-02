
public class Ex01_메소드_사칙연산 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1, num2, op));
		double result2 = cal(10.5, 1.3, '-');
		System.out.println(result2);

	}
	
	public static int cal(int num1, int num2, char op) {
		
		int result=0;
		if(op == '+') {
			result = num1+num2;
		}else if(op == '-') {
			result = num1-num2;
		}else if(op == '*') {
			result = num1*num2;
		}else if(op == '/') {
			result = num1/num2;
		}
		
		return result;
	}

	
	
	// 메소드 오버로딩(증복정의)
	// 조건 : 1. 메소드이름은 동일, 2. 매개변수의 개수나 데이터 타입이 달라야한다.
	public static double cal(double num1, double num2, char op) {
		double result = 0;
		if(op == '+') {
			result = num1+num2;
		}else if(op == '-') {
			result = num1-num2;
		}else if(op == '*') {
			result = num1*num2;
		}else if(op == '/') {
			result = num1/num2;
		}
		return result;
	
	}
}
