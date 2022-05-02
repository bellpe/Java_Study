package Ex01_�����������α׷�_���׷��̵�;

import java.util.HashMap;
import java.util.Scanner;

public class Ex01_�����������α׷�_���׷��̵� {

	public static void main(String[] args) {
		// ���(1. �л����, 2. �����Է�, 3. ��ü������ȸ)
		Scanner sc = new Scanner(System.in);
		HashMap<String,HHDStudent> studentsMap  = new HashMap<>();
		while(true) {
			System.out.println("1.�л���� 2.�����Է� 3.��ü������ȸ 4.����");
			int choice = sc.nextInt();
			if(choice == 1) {
				//�л���� (�̸�, �й��� �Է¹޾� ��ü�� ����)
				System.out.print("����� �̸� �Է� >>");
				String name = sc.next();
				System.out.print("����� �й� �Է� >>");
				String stuNum = sc.next();
				HHDStudent stu = new HHDStudent(name, stuNum);
				studentsMap.put(stuNum, stu);
			}else if(choice == 2) {
				//�����Է� (�ڹ�,DB,���̽� ������ Ű����� �Է� �޾� �л� ��ü�� �־��ֱ�)
				if(studentsMap.size() != 0) {
					System.out.print("������ �л��� �й� �Է� >>");
					String stuNum = sc.next();
					HHDStudent stu = studentsMap.get(stuNum); // �й����� �л�ã��
					if(stu != null) {
						String name = stu.getName();
						System.out.print("����� �ڹ����� �Է� >>");
						int javaScore = sc.nextInt();
						System.out.print("����� DB���� �Է� >>");
						int databaseScore = sc.nextInt();
						System.out.print("����� ���̽����� �Է� >>");
						int pythonScore = sc.nextInt();
						
						stu.setJavaScore(javaScore);
						stu.setDatabaseScore(databaseScore);
						stu.setpythonScore(pythonScore);
					}else {
						System.out.println("��ϵ� �л��� �����ϴ�.");
					}
				}else {
					System.out.println("�л��� ���� ������ּ���.");
				}
			}else if(choice == 3) {
				//��ü������ȸ(�л��̸�, �ڹ�/DB/���̽� ����, ������� ���)
				if(studentsMap.size() != 0) {
					System.out.print("������ �л��� �й� �Է� >> ");
					String stuNum = sc.next();
					if(studentsMap.containsKey(stuNum)) {
						HHDStudent stu = studentsMap.get(stuNum);
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
