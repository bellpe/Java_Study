
public class EX01_입출력 {

	public static void main(String[] args) {
		// 1. 출력 명령어 작성하기!
		// 잠깐! 컴퓨터는 숫자 vs 문자
		System.out.println(54); // 숫자
		System.out.println("54"); // 문자
		// ctrl + s 저장 단축키!
		// 팀원들 이름 다섯명 출력~~
		System.out.println("여미지");
		System.out.println("정호진");
		System.out.println("양혜선");
		System.out.println("이권창");
		System.out.println("박준형");
		System.out.println("정세연");
		System.out.println("이은비");
		// syso + ctrl + 스페이스 바 -> 단축키
		System.out.println(10 + 10); // 10+10 결과를 출력해라!
		System.out.println(5 - 9); // 5-9의 결과를 출력해라
		// ctrl + shift + f => 정렬 단축기
		System.out.println(5 / 2); //5/2의 결과를 출력해라 정수/정수
		System.out.println(5 / 2f);
		System.out.println(5 / 2.0);
		// 연산할 때 정수와 실수를 가지고 연산하면 더 많은 걸 표현할 수 있는 실수로 바뀜
		System.out.println((float)(5/2));
		System.out.println((float) 5/2);
		// 출력, 연산, 형변환
		System.out.println(10 + 10);
		System.out.println(10 + "10");
		System.out.println(5 + "1" + 5); // 앞에서 부터 계산!
		System.out.println(5 + 1 + "5");
		System.out.println(5 + (1 + "5"));
		System.out.println("5" + 1 +5);
		// 10+"10" -> 숫자+문자 => 문자
		

	}

}
