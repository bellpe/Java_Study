import java.util.Random;

public class EX01_메소드 {

	public static void main(String[] args) {
		// Method -> 함수
		// 기능!!
		
		Random rd = new Random();
		int num = rd.nextInt(1, 10);
		// Random 수를 뽑는 nextInt라는 메소드에 대해 정의하세요!
		// 매개변수, 리턴값, 호출 이라는 단어를 사용하여!
		
		// 도구(메소드)를 호출하고 매개변수 2(1, 10)개를 전달받아 각 원소 중 하나를 랜덤으로 수를 
		// 불러오고 리턴하는 메소드
		
		String name =  "이은비";
		if(name.equals("정세연")) {
			System.out.println("같지 않다!");
		}
		System.out.println(name.length());
		
		// 매개변수, 리턴값, 호출이라는 단어 꼭꼭꼭 사용하여 정의하기!!
		// String name에 있는 equals라는 메소드를 호출
		// equals 메소드에서 "정세연"이라는 데이터 매개변수 1개를 받아 name의 "이은비"와 비교하여
		// 리턴값 boolean형 FALSE를 호출한 곳으로 리턴 시켜준다
		// if문 밖의 syso에서 name에 있는 length 메소드를 호출하여 name의 변수 길이를 호출 
		
		int num22 = Integer.parseInt("1234"); // 문자열을 숫자로 바꿔주는 메소드!
		// Integer.parseInt라는 메소드를 호출
		// Integer.parseInt라는 메소드에서 문자열 "1234" 데이터 매개변수를 1개 받고
		// 리턴값 1234를 호출한 곳으로 리턴 시켜줌
		
		String num33 = Integer.toString(1234); // 숫자를 문자열로 바꿔주는 메소드!
		// Integer라는 (클래스)에 있는 toString라는 메소드를 호출
		// Integer.toString라는 메소드에서 숫자 1234 데이터 매개변수를 1개 받고
		// 리턴값 문자열 "1234"를 호출한 곳으로 리턴 시켜줌
		

	}

}
