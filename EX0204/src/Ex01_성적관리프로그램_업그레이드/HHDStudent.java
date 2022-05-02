package Ex01_성적관리프로그램_업그레이드;

import Ex02_생성자.Student;

// 학생을 표현하는 클래스(학생 정보, 기능을 담당)
public class HHDStudent extends Student{

	public HHDStudent(String name, String stuNum) {
		super(name, stuNum);
	}
	public int getJavaScore() {
		return javaScore;
	}
	public int getDatabaseScore() {
		return databaseScore;
	}
	public int getPythonScore() {
		return pythonScore;
	}

}
