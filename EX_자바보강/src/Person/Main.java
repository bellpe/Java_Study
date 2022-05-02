package Person;

public class Main {

	public static void main(String[] args) {
		
		// 실행되는 공간
		// 1. 설계도면을 가지고 객체(Object) 생성
		person nature = new person();
		// new -> 레퍼런스 변수 생성 키워드
		// 레퍼런스 변수 -> 참조값, 주소값
		System.out.println(nature);
		
		nature.name = "조자연";
		System.out.println(nature.name);
		// 성별, 나이 채워서 출력하기
		nature.gender = "여";
		System.out.println(nature.gender);
		nature.age = 29;
		System.out.println(nature.age);
		
		
		
		// 기능 불러오기
		nature.eat();
		System.out.println(nature.sleep());
		
		// 동일한 설계도면을 가지고 여러 개의 객체 생성 가능하다.
		// 동일한 설계도면을 가지고 자기자신을 만들어보자
		person jun = new person();
		System.out.println(jun);
		jun.name = "박준형";
		System.out.println(jun.name);
		jun.gender = "남";
		System.out.println(jun.gender);
		jun.age = 28;
		System.out.println(jun.age);

	}

}
