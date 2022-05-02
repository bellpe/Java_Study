package Ex03_클래스_분리;

import Ex02_생성자.Student;

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
