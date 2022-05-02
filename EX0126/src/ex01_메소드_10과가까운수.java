
public class ex01_메소드_10과가까운수 {

	public static void main(String[] args) {
		// 2개의 정수를 입력받아 둘중에 10과 가까운수를 반환하는 메소드
		// close10을 만들어보자. 단 두 숫자 모두 거리가 같다면 0을 반환
		
		// 메소드 호출
		int num1 = 11;
		int num2 = 5;
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

	}
	
	// 메소드 정의
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
