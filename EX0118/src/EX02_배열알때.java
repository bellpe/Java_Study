import java.util.Scanner;

public class EX02_배열알때 {

	public static void main(String[] args) {
		// 회원 5명 ID(String) 저장할 배열~~
		String[] 회원들 = {"정세연", "박수현", "황해도", "채수민", "위홍주"};
		
		// 배열의 1번사람 출력해보자!!
		System.out.println(회원들[1]);
		
		// 배열의 3번 사람 출력해보자!
		System.out.println(회원들[3]);
		
		// 배열의 원소에 접근하는 방법! => 배열이름[인덱스] 이다.
		
		// 2번 자리에 "박병관" 이름 넣기
		회원들[2] = "박병관";
		System.out.println(회원들[2]);
		
		
		// id를 새로 입력받아 기존의 아이디들과 중복인지 아닌지 검사하기!
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID >> ");
		String newid = scan.next();
		for(int i=0; i<5; i++) {
			if(회원들[i].equals(newid)) {
				System.out.println("아이디가 중복입니다!");
			}
		}
		// 배열을 사용했을 때는 index(번호)라는 규칙이 생김!
		// => for 반복문을 사용할 수 있음!
		// 0부터 4까지 1씩 증가!
		// i(index)를 0부터 4까지 1씩 증가시키면서
		// i번째 회원이 새로운 아이디와 같다면
		// 중복이다! 출력
			
		
		

	}

}
