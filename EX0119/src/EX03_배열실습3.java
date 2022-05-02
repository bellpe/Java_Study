import java.util.Arrays;
import java.util.Random;

public class EX03_배열실습3 {

	public static void main(String[] args) {
		// 과제 겸 실습!
		// 1단계) 배열에 들어있는 수 만큼 하트 찍기!
		// 3 : ♥♥♥
		// 4 : ♥♥♥♥
		// 2 : ♥♥
		// 4 : ♥♥♥♥
		// 1 : ♥
//		int[] heart = {3,4,2,4,1};
//		for(int i=0; i<heart.length; i++) {
//			System.out.print(heart[i]+" : ");
//			for(int j=0; j<heart[i]; j++) {
//				System.out.print("♥");
//			}
//			System.out.println();
		// 2단계)
		// 랜덤으로 1~5까지의 수 50개 뽑고 각 숫자별 개수세기
		int[] numbers = new int[30];
		Random rand = new Random();
		for(int i=0; i<numbers.length; i++) {
			numbers [i] = rand.nextInt(1,6);
		}
		System.out.println(Arrays.toString(numbers));
		int[] cnt = new int[5];
		for(int i=0; i<numbers.length; i++) {
			cnt[numbers[i]-1]++;
		}
		System.out.println(Arrays.toString(cnt));
		
		
		}
		
		
	
		
		// 마라맛!)
		// A,B,C,D,F 중에 랜덤으로 50개 뽑고 각 알파벳 별 개수 세어서 그래프(■) 그리기
		// A (10개) : ■ ■ ■ ■ ■ ■ ■ ■ ■ ■
		// B (8개) : ■ ■ ■ ■ ■ ■ ■ ■

	}


