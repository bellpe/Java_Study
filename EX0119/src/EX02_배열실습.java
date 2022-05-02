import java.util.Random;

public class EX02_배열실습 {

	public static void main(String[] args) {
		// 1) 10개의 정수를 저장하는 배열 생성!
		// 2번 기본) 랜덤(10~50)으로 배열 원소 셋팅!
		// 2번 심화!) 중복 없이 뽑기
		// 3) 가장 큰 수는 어떤 것이고 몇번째에 있는지 찾기

		Random rd = new Random();

		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			int num1 = rd.nextInt(10, 51);
			num[i] = num1;

		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		int max = 0;
		int index = 0;
		for (int j = 0; j < num.length; j++) {
			if (max < num[j]) {
				max = num[j];
				index = j;

			}

		}
		System.out.println(max+"는 "+ index+"번째");
	}

}
