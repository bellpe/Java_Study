import java.util.Scanner;

public class EX04_���ǹ�����2 {

	public static void main(String[] args) {
		// ���� 2.
		// ������ ��� ���α׷� ����� => ���� ī�忡 ����
		// �������� �Է¹޾� �� �޿��� ����ϴ� ���α׷��� ���弼��!
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int cnt = scan.nextInt(); 
		// ������ �������� ���� ���ʽ��� �޶���
		int bon1 = 0;
		int bon2 = 20;
		int bon3 = 30;
		int bon4 = 50;
		// 99���� ���ϴ� ���ʽ��� 0
		if(99 >= cnt) { // 99������ ������� �ɷ���! 100 �̻��� ������� ���⼭ ��Ƴ��Ҵ�!
			System.out.println("�� �޿��� " +(cnt+bon1)+ "��");
		}else if(199 >= cnt) { // 100~199 �ɷ��� ��
			System.out.println("�� �޿��� " +(cnt+bon2)+ "��");
		}else if(299 >= cnt) {
			System.out.println("�� �޿��� " +(cnt+bon3)+ "��" );
		}else { // 300 �̻��� �����
			System.out.println("�� �޿��� " +(cnt+bon4)+ "��");
		}

	}

}
