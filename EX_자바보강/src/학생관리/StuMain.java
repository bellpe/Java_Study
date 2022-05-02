package 학생관리;

public class StuMain {

	public static void main(String[] args) {
		
		// 1. 설계도면을 가지고 객체 생성
		Student student1 = new Student("홍길동", "20164206", 22, 50, 89, 77);
		
		// 생성자
		
		
		// 2. 생성된 객체의 데이터에 접근하기(설계도)
//		
		System.out.println(student1.name);
		
		student1.show();

	}

}
