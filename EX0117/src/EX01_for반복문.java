

public class EX01_for반복문 {

	public static void main(String[] args) {
		
		// (초기값; 조건식; 증가값)
//		for(int i=21; i<58; i++) { // for문 안에서 선언 = "지역변수" i -> for 밖에서 사용 불가능!!
//			System.out.println(i);
//		}
		// 96~53 출력
//		for(int i=96; i>52; i--) {
//		System.out.println(i);	
//		}
		
		// 21~57 홀수 출력
//		for(int i=21; i<58; i+=2) // i+=2 -> i=i+2
//			System.out.println(i);
		
		// 1부터 100까지 모두 더한 값
//		int sum = 0;
//		for(int i=1; i<101; i++) {
//			sum+=i;
//		} 
//		System.out.println(sum);
		
		// 1-2+3-4+...+99-100의 결과 출력
//		int sum = 0;
//		for(int i=1; i<101; i++) {
//			if(i%2==1) { // 홀수 판별
//				sum+=i;
//			}else { // 짝수 판별
//				sum-=i;
//			}
//		}
//		System.out.println(sum);
		
		// (77*1)+(76*2)+(75*3)+...+(1*77)의 결과 출력
//		1. int sum = 0;
//		int j=77;
//		for(int i=1; i<78; i++) {
//			sum += j*i;
//			j--;
//		}
//		System.out.println(sum);
		
//		2.int sum = 0;
//		for(int i=77; i>=1; i--) {  
//			System.out.println(i); // 77~1
//			System.out.println(78-i); // 1~77
//			
//			sum += i*(78-i);
//		} 
//		System.out.println(sum);
		
        // for문을 사용하여 구구단 2단을 출력하시오.
//		 for(int i=1; i<=9; i++){
//		 System.out.println(i); //1~9
//		 System.out.println("2*" + i + "=" + (2*i));
//		}
		
	
	}
		

}
