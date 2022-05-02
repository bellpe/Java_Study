package Ex03_Ŭ����_�и�;

import java.util.HashMap;

// �л� ��ü�� ���, ����,Ž���� �����ִ� Ŭ����
public class StudentManager {
	private HashMap<String,HHDStudent> studentsMap  = new HashMap<>();
	
	// �л� ��� ���
	public void addStudent(String name, String stuNum) {
		HHDStudent stu = new HHDStudent(name, stuNum);
		studentsMap.put(stuNum, stu);
	}
	// ��� �л��� ���� �˷��ִ� ���
	public int getStudentCount() {
		return studentsMap.size();
	}
	// �й����� �ش� �л��� ���縦 Ȯ���ϴ� ���
	// �ش� �л��� �����ϸ� �л��� �̸��� ����, �л��� ���ٸ� null�� ����
	public String searchStudent(String stuNum) {
		if(studentsMap.containsKey(stuNum)) {
			return studentsMap.get(stuNum).getName();
		}else {
			return null;
		}
	}
	// �л� ������ �����ϴ� ���
	public void modifyScore(String stuNum, int javaScore, int databaseScore, 
							int pythonScore) {
		HHDStudent stu = studentsMap.get(stuNum); // �й����� �л�ã��
		stu.setJavaScore(javaScore);
		stu.setDatabaseScore(databaseScore);
		stu.setpythonScore(pythonScore);
	}
	// Ư�� �л��� �������� ���
	public HHDStudent findStudent(String stuNum) {
		return studentsMap.get(stuNum);
	}

}
