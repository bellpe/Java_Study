import java.util.Scanner;

public class EX03_�迭���� {

	public static void main(String[] args) {
		String[] ���� = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� >> ");
		String a = scan.next();
		for(int i=0; i<7; i++) {
			if(����[i].equals(a)) {
				System.out.println(a+"��"+i+"��° �����Դϴ�!");
				break;
			} // break; �� ���� ��������(������ ������)�� ���ٴ� ���� �Ͽ� ���� �ο�����
			// �� �� �̻� �ݺ��ؼ� ���� �ʿ䰡 ���� ������ ȿ�����̴�.
			else if(i+1==7){
				System.out.println("�������� �ʽ��ϴ�!");
			}
		}
		
		

	}

}
