import java.util.Scanner;

public class EX01_�迭�������� {

	public static void main(String[] args) {
		// ȸ������ �� �� ���̵� �ߺ�üũ��� ����
		// ���� ���ԵǾ��ִ� ȸ���� 5��!
		// ���� �����Ϸ��� ����� ���̵� �ߺ��Ǵ��� Ȯ���ϰ� �ʹ�!
		
		// ���̵�ϱ� ���ڿ� ������ �����ص־߰ڴ�!!
		String id1 = "������";
		String id2 = "�ڼ���";
		String id3 = "Ȳ�ص�";
		String id4 = "ä����";
		String id5 = "��ȫ��";
		
		// ���� �����Ϸ��� ��� id(������ : newID) �Է¹���!
		Scanner scan = new Scanner(System.in);
		System.out.print("ID >> ");
		String ���ο���̵� = scan.next();
		
		// ���࿡ ù��° ����̶� ID�� �ߺ��̶�� "���̵��ߺ�!" �̶�� ����ϰ� �ʹ�!
		if(id1.equals(���ο���̵�)) {
			System.out.println("���̵��ߺ�!");
		}
		// ���࿡ �ι�° ����̶� ID�� �ߺ��̶�� "���̵��ߺ�!" �̶�� ����ϰ� �ʹ�!
		if(id2.equals(���ο���̵�)) {
			System.out.println("���̵��ߺ�!");
		}

	}

}
