
public class EX03_자바배열과제 {

	public static void main(String[] args) {
		// 1. 짝수번째 인덱스만 출력
		int[] num = {13, 5, 7, 17, 3, 16, 19, 20, 2 ,1 };
		for(int i=0; i<=9; i+=2) {
			System.out.println(num[i]+" ");
		}
		System.out.println();
		
		// 2. 홀수 몇개인지 출력
		int sum = 0;
		for(int i=0; i<=9; i++) {
			if(num[i]%2==1) {
				sum++;
			}
		}
		System.out.println("홀수는"+sum+"개 입니다");
		
		// 3. 모든 수의 평균 구하기
		int hap=0;
		double avg=0;
		for(int i=0; i<=9; i++) {
			hap += num[1];
		}
		avg = hap/10.0;
		System.out.println("모든 수의 평균은"+avg);

	}

}
