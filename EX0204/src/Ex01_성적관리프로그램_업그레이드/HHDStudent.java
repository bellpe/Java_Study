package Ex01_�����������α׷�_���׷��̵�;

import Ex02_������.Student;

// �л��� ǥ���ϴ� Ŭ����(�л� ����, ����� ���)
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
