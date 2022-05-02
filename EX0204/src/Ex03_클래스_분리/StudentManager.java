package Ex03_클래스_분리;

import java.util.HashMap;

// 학생 객체를 등록, 수정,탐색을 도와주는 클래스
public class StudentManager {
	private HashMap<String,HHDStudent> studentsMap  = new HashMap<>();
	
	// 학생 등록 기능
	public void addStudent(String name, String stuNum) {
		HHDStudent stu = new HHDStudent(name, stuNum);
		studentsMap.put(stuNum, stu);
	}
	// 등록 학생의 수를 알려주는 기능
	public int getStudentCount() {
		return studentsMap.size();
	}
	// 학번으로 해당 학생의 존재를 확인하는 기능
	// 해당 학생이 존재하면 학생의 이름을 리턴, 학생이 없다면 null을 리턴
	public String searchStudent(String stuNum) {
		if(studentsMap.containsKey(stuNum)) {
			return studentsMap.get(stuNum).getName();
		}else {
			return null;
		}
	}
	// 학생 성적을 수정하는 기능
	public void modifyScore(String stuNum, int javaScore, int databaseScore, 
							int pythonScore) {
		HHDStudent stu = studentsMap.get(stuNum); // 학번으로 학생찾기
		stu.setJavaScore(javaScore);
		stu.setDatabaseScore(databaseScore);
		stu.setpythonScore(pythonScore);
	}
	// 특정 학생을 꺼내가는 기능
	public HHDStudent findStudent(String stuNum) {
		return studentsMap.get(stuNum);
	}

}
