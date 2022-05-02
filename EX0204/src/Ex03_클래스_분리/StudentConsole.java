package Ex03_Ŭ����_�и�;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;

//�л��������α׷��� ������, ����ڿ� ��ȣ������ ������ �ϴ� Ŭ����(�������̽�)
public class StudentConsole {

	public static void main(String[] args) {
		MP3Player player = new MP3Player();
		player.play("C:\\Users\\smhrd\\Downloads\\player\\start.mp3");
		
		// ���(1. �л����, 2. �����Է�, 3. ��ü������ȸ)
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();
		while(true) {
			System.out.println("1.�л���� 2.�����Է� 3.��ü������ȸ 4.����");
			int choice = sc.nextInt();
			if(choice == 1) {
				//�л���� (�̸�, �й��� �Է¹޾� ��ü�� ����)
				System.out.print("����� �̸� �Է� >>");
				String name = sc.next();
				System.out.print("����� �й� �Է� >>");
				String stuNum = sc.next();
				manager.addStudent(name, stuNum); // manager���� �л���� ȣ��
			}else if(choice == 2) {
				//�����Է� (�ڹ�,DB,���̽� ������ Ű����� �Է� �޾� �л� ��ü�� �־��ֱ�)
				if(manager.getStudentCount() != 0) {
					System.out.print("������ �л��� �й� �Է� >>");
					String stuNum = sc.next();
					
					String name = manager.searchStudent(stuNum); // �л� ���� Ȯ��
					if(name != null) {
						System.out.print(name+"�� ����� �ڹ����� �Է� >>");
						int javaScore = sc.nextInt();
						System.out.print(name+"�� ����� DB���� �Է� >>");
						int databaseScore = sc.nextInt();
						System.out.print(name+"�� ����� ���̽����� �Է� >>");
						int pythonScore = sc.nextInt();
						
						manager.modifyScore(stuNum, javaScore, databaseScore, pythonScore);
					}else {
						System.out.println("��ϵ� �л��� �����ϴ�.");
					}
				}else {
					System.out.println("�л��� ���� ������ּ���.");
				}
			}else if(choice == 3) {
				//��ü������ȸ(�л��̸�, �ڹ�/DB/���̽� ����, ������� ���)
				if(manager.getStudentCount() != 0) {
					System.out.print("��ȸ�� �л��� �й� �Է� >> ");
					String stuNum = sc.next();
					HHDStudent stu = manager.findStudent(stuNum);
					if(stu != null) {
						System.out.println("==================");
						System.out.println("�л� �̸� : "+stu.getName());
						System.out.println("==================");
						stu.calAvg(); // �л���ü���� ��������� ����ϵ��� �޼ҵ� ȣ��
						System.out.println("������� : "+stu.getAvg());
						System.out.println("==================");
						System.out.println("�ڹ����� : "+stu.getJavaScore());
						System.out.println("DB���� : "+ stu.getDatabaseScore());
						System.out.println("���̽� ���� : "+ stu.getPythonScore());
						System.out.println("==================");
					}else {
						System.out.println("��ϵ� �л��� �����ϴ�.");
					}
				}else {
					System.out.println("�л��� ���� ������ּ���");
				}
			}else if(choice == 4) {
				// ���α׷� ����
				break;
			}
		}

	}

}
