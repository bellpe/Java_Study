import java.util.Arrays;

public class Ex04_메소드_배열의짝홀수판단하기 {

	public static void main(String[] args) {
		// 정수형 배열이 입력으로 들어오면 각 값이 짝수인지 홀수인지 판단해서
		// 배열로 반환하는 메소드 isOddEvenArray를 만들어보자.
		// 짝수라면 true, 홀수라면 false로 정의 한다.
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
