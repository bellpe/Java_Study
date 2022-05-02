package 학생관리;

public class Student {
	
	// 학생들의 정보를 관리할 수 있는 설계도
	// 설계도는 설계만 진행할 수 있으므로 객체를 생성하는 main()X
	
	// 1.필드 : 데이터, 속성
	// 이름(String), 학번(String), 나이, 
	// Java점수, Web점수, Android점수(int)
	String name;
	String stunum;
	int age;
	int JavaScore;
	int WebScore;
	int AndroidScore;
	
	// 생성자 메소드 생성하기
	// 접근지정자, 리턴타입X, 메소드이름(=클래스이름 동일)
	// 생성자 메소드가 받아들일 매개변수 존재한다.
	
	// 객체를 생성할 때 field에 있는 데이터를 초기화 시킬 수 있는 메서드 생성
	// 생성자(constructor)
	// 1) 생성자도 메소드이다.
	// 2) 메서드의 이름이 클래스의 이름과 동일한 이름을 갖는다.
	// 3) 
	
	
	// alt +shift + s -> generate constructor using...fields
	
	public Student(String name, String stunum, int age, int JavaScore, int WebScore, int AndroidScore) {
		this.name = name;
		this.age = age;
		this.stunum = stunum;
		this.JavaScore = JavaScore;
		this.WebScore = WebScore;
		this.AndroidScore = AndroidScore;
	}
	
	
//	public Student(String name, String stunum, int age, int javaScore, int webScore, int androidScore) {
//		super();
//		this.name = name;
//		this.stunum = stunum;
//		this.age = age;
//		JavaScore = javaScore;
//		WebScore = webScore;
//		AndroidScore = androidScore;
//	}


	// 2.메서드 : 기능, 로직
	// show() 메소드 생성
	// 접근제한자 + 리턴타입 + 메소드 이름
	public void show() {
		System.out.println(name+"님 안녕하세요");
		System.out.println();
	}

}
