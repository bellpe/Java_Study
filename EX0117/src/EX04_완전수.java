
public class EX04_완전수 {

	public static void main(String[] args) {
		
		// 1. 약수 구하기(약수 = 나눴을 때 나머지가 0인 수)
//		System.out.println("6의 약수는 ");
//		for(int i=1; i<6; i++) { // 1부터 5까지 1씩 증가
//			if(6%i==0) { //
//				System.out.println(i+" ");
//			}
//		}
		// 2. 완전수인지 판단 (6을 제외한 1, 2 ,3의 합이 6과 같을 때)
		
//		int sum=0;
//		
//		for(int i=1; i<6; i++) {
//			if(6%i ==0) { // i가 6의 약수냐??
//				sum+=i;
//			}
//		}
//		if(sum == 6) {
//			System.out.println("완전수입니다!");
//		}
		
		
		// 3. 1~1000까지 반복을 하면서 완전수 판단
		
		//1부터 1000까지 1씩 증가 // 변수 한 번에 바꾸기 alt+shift+r
		// target => 완전수인지 아닌지 판단할 수
		// 원리! target을 1부터 target-1까지 나누면서 약수의 합을 구한 뒤
		// 약수의 합이 target과 같으면 target은 완전수!
		for(int target=1; target<=1000; target++) {
			int sum=0;
			
			for(int i=1; i<target; i++) {
				if(target%i ==0) { // i가 6의 약수냐??
					sum+=i;
				}
			}
			if(sum == target) {
				System.out.println(target+"은 완전수입니다!");
			}
		}

	}

}
