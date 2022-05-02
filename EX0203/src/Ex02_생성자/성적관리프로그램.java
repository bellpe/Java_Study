package Ex02_생성자;

public class 성적관리프로그램 {

	public static void main(String[] args) {
		// 1. 학생 객체(object) 생성
		Student s1 = new Student("정세연","002");
		Student s2 = new Student("홍길동","001");
		
		// 2. 학생의 성적정보 입력
		s1.setJavaScore(98);
		s1.setDatabaseScore(75);
		s1.setpythonScore(100);
		
		s2.setJavaScore(78);
		s2.setDatabaseScore(100);
		s2.setpythonScore(69);
		
		// 3. 학생 성적정보 확인(평균)
		// 학번 : 평균
		s1.calAvg();
		s2.calAvg();
		System.out.println(s1.getName()+":"+s1.getAvg());
		System.out.println(s2.getName()+":"+s2.getAvg());

	}

}
