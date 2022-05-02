package Ex03_클래스_분리;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

//학생관리프로그램의 시작점, 사용자와 상호소통의 역할을 하는 클래스(인터페이스)
public class StudentConsole {

	public static void main(String[] args) {
		MP3Player player = new MP3Player();
		player.play("C:\\Users\\smhrd\\Downloads\\player\\start.mp3");
		
		// 기능(1. 학생등록, 2. 성적입력, 3. 전체성적조회)
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		while(true) {
			System.out.println("1.학생등록 2.성적입력 3.전체성적조회 4.종료");
			int choice = sc.nextInt();
			if(choice == 1) {
				//학생등록 (이름, 학번을 입력받아 객체를 생성)
				System.out.print("등록할 이름 입력 >>");
				String name = sc.next();
				System.out.print("등록할 학번 입력 >>");
				String stuNum = sc.next();
				manager.addStudent(name, stuNum); // manager에게 학생등록 호출
			}else if(choice == 2) {
				//성적입력 (자바,DB,파이썬 점수를 키보드로 입력 받아 학생 객체에 넣어주기)
				if(manager.getStudentCount() != 0) {
					System.out.print("수정할 학생의 학번 입력 >>");
					String stuNum = sc.next();
					
					String name = manager.searchStudent(stuNum); // 학생 유무 확인
					if(name != null) {
						System.out.print(name+"의 등록할 자바점수 입력 >>");
						int javaScore = sc.nextInt();
						System.out.print(name+"의 등록할 DB점수 입력 >>");
						int databaseScore = sc.nextInt();
						System.out.print(name+"의 등록할 파이썬점수 입력 >>");
						int pythonScore = sc.nextInt();
						
						manager.modifyScore(stuNum, javaScore, databaseScore, pythonScore);
					}else {
						System.out.println("등록된 학생이 없습니다.");
					}
				}else {
					System.out.println("학생을 먼저 등록해주세요.");
				}
			}else if(choice == 3) {
				//전체성적조회(학생이름, 자바/DB/파이썬 점수, 평균점수 출력)
				if(manager.getStudentCount() != 0) {
					System.out.print("조회할 학생의 학번 입력 >> ");
					String stuNum = sc.next();
					HHDStudent stu = manager.findStudent(stuNum);
					if(stu != null) {
						System.out.println("==================");
						System.out.println("학생 이름 : "+stu.getName());
						System.out.println("==================");
						stu.calAvg(); // 학생객체에게 평균점수를 계산하도록 메소드 호출
						System.out.println("평균점수 : "+stu.getAvg());
						System.out.println("==================");
						System.out.println("자바점수 : "+stu.getJavaScore());
						System.out.println("DB점수 : "+ stu.getDatabaseScore());
						System.out.println("파이썬 점수 : "+ stu.getPythonScore());
						System.out.println("==================");
					}else {
						System.out.println("등록된 학생이 없습니다.");
					}
				}else {
					System.out.println("학생을 먼저 등록해주세요");
				}
			}else if(choice == 4) {
				// 프로그램 종료
				break;
			}
		}

	}

}
