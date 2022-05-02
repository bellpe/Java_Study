
public class Ex03_메소드_배열의총합구하기 {

	public static void main(String[] args) {
		// 정수형 배열을 입력 받아 총합을 계산해 반환하는 메소드
		// getArraySum을 만들어보자.
		// 메소드 호출
		int[] array = {3,10,8,7,1};
		int arr = getArraySum(array);
		System.out.println(arr);
		// int A =30;
		// chage

	}
	// call by value(값의 복사)
	// call by reference (주소 값)
	public static int getArraySum(int[] arr) {
		int result = 0; // 총합이 담길 변수
		for(int i=0; i<arr.length; i++) {
			result += arr[i]; // 같은 내용 result = result+ arr[i];
		}
		return result;
	}
	

}
