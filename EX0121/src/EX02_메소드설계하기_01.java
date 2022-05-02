
public class EX02_메소드설계하기_01 {

	public static void main(String[] args) {
		// 두 개의 정수를 매개변수로 전달받아서 합을 리턴하는 메소드 설계!
		
		// 이 상태로 실행! 누르면 add 메소드가 실행될까요?
		// 메소드는 언제 실행될까?? => main에서 호출해야 실행됨!!
		
		int num = add(3, 5);
		double num1 = M(3, 5);
		double num2 = X(3, 5);
		double num3 = D(3, 5);
		
		System.out.println(num);
		System.out.println("더하기 : "+num+"\n빼기: "+num1+"\n곱하기: "+num2+"\n나누기: "+num3 );
		
		// 빼기 메소드, 곱하기 메소드, 나누기 메소드(소수점까지)
		// 3개 메소드 정의하고 main에서 호출해보기~~
		
	}
	
	public static double M(double num1, double num2) {
		double m = num1 - num2;
		
		return m;
	}
	
	public static double X(double num1, double num2) {
		double x = num1 * num2;
		
		return x;
	} 
	
	public static double D(double num1, double num2) {
		 double D = num1 / num2;
		
		return D;
	}
	
	public static void temp(int num1) {
		num1 += 3;
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
		
		
	}

}
