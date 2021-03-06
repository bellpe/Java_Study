import java.util.Scanner;

public class EX07_조건문예제 {

	public static void main(String[] args) {
		// 1. int 타입 변수 num 선언, 키보드로 값을 입력받고,
		int num = 0;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		// 2. 만약에 num이 3의 배수이면서, 5의 배수라면 ->
		// if (조건식){   실행문장   }
		if(num % 5 == 0 && num % 3 == 0) { System.out.println("3과 5의 배수입니다");
			
		}
		
				
		// 자 준형씨, 이게 맞나? 싶을 때 가장 빨리 확인 하는 방법은 print 에요.
		// 초보라서가 아니라 실제 개발자들도 정말 많이 씁니다.
		// 디버깅이라고도 하고, 여기까지 쓴 코드가 맞나? 하고print를 찍어보는거에요
		// System.out.println(num%5);  //이게 우리 나머지! 연산자였어요
		// num%5 라는건 num을 5로 나눴을 때의 나머지.
		// 즉 5의 배수겠죠?네
		// 그런데 3의 배수이면서 5의 배수죠?
		//  -> 3의 배수 && 5의 배수   이 부분을 코드로 바꿔보세요
		// 좋습니다. 자 그럼 if문의 조건식이 완성 되었네요? 그 다음엔? 중활호입니다
		// 좋아요 직접 해봅시다
		// 3. "3과 5의 배수입니다" 출력
		// => 단순 if문

	}

}
