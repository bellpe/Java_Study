import java.util.Scanner;

public class EX02_�迭�˶� {

	public static void main(String[] args) {
		// ȸ�� 5�� ID(String) ������ �迭~~
		String[] ȸ���� = {"������", "�ڼ���", "Ȳ�ص�", "ä����", "��ȫ��"};
		
		// �迭�� 1����� ����غ���!!
		System.out.println(ȸ����[1]);
		
		// �迭�� 3�� ��� ����غ���!
		System.out.println(ȸ����[3]);
		
		// �迭�� ���ҿ� �����ϴ� ���! => �迭�̸�[�ε���] �̴�.
		
		// 2�� �ڸ��� "�ں���" �̸� �ֱ�
		ȸ����[2] = "�ں���";
		System.out.println(ȸ����[2]);
		
		
		// id�� ���� �Է¹޾� ������ ���̵��� �ߺ����� �ƴ��� �˻��ϱ�!
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID >> ");
		String newid = scan.next();
		for(int i=0; i<5; i++) {
			if(ȸ����[i].equals(newid)) {
				System.out.println("���̵� �ߺ��Դϴ�!");
			}
		}
		// �迭�� ������� ���� index(��ȣ)��� ��Ģ�� ����!
		// => for �ݺ����� ����� �� ����!
		// 0���� 4���� 1�� ����!
		// i(index)�� 0���� 4���� 1�� ������Ű�鼭
		// i��° ȸ���� ���ο� ���̵�� ���ٸ�
		// �ߺ��̴�! ���
			
		
		

	}

}
