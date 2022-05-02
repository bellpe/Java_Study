import java.util.Scanner;

public class EX05_삼항연산자_두수의차 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("첫 번째 정수 입력 : ");
	int num = scan.nextInt();
	System.out.print("두 번쨰 정수 입력 : ");
	int num1 = scan.nextInt();
	
	// 2. 큰 수에서 작은 수(조건)를 뺀 결과 -> 삼항연산자 조건 ? 참 일 때 실행 : 거짓일 때 실행
	// 3. 출력
	System.out.println(num>num1 ? num-num1 : num1-num);
	// Scanner를 생성했으니 이용해볼까요?? 이전 실습소스를 참고하셔도 됩니다 :)

	}

}
