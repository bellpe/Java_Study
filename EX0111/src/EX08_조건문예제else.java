import java.util.Scanner;

public class EX08_조건문예제else {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num1 = 0;   // 준형씨 이건 초기화에요. 즉 새로 만든다! 라는 겁니다.
		int num2 = 0;   // 이미 만들었는데
		// 같은 이름의 변수를 아래서 또 초기화 시켰죠? 그럼 지우는게 좋나요?
		
		// 여ㅕ기는 0이라고 선언!(초기화)를 한거고
		
		// 좋다 아니다는 아니지만, 방법이죠
		// 예를 들자면
		// int num; 은 선언이구요
		// num = 0; 이게 0이라는 값을 num 변수에 담아준거에요!
		
		// int num = 0; 저 두 문장을 한 줄로 이렇게 표현하는거에요 아직은 아리까리 할겁니다~ 
		
		num1 = scan.nextInt();   // 그렇게 되면 여기는 변수니까 다른 값을 담은거구요
		num2 = scan.nextInt();
		
		
//		같은 방법은
//		int num1 = scan.nextInt();  저 두 문장을 이렇게 하나로 표현한거에요
		
		// 수학 처럼 일단 문법을 외우시는게 처음엔 방법 중 하나에요
		// 감이 잘 안온다면 저처럼
		//if (조건식){   실행문장   }  이렇게 써보고 하나하나 대입하는 것도 방법입니다! 네
		
		if(num1 > num2 ) {
			System.out.println(num1);
			
		} else {
			System.out.println(num2);
			
		}

	}

}
