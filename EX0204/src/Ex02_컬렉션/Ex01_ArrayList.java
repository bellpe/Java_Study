package Ex02_�÷���;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// ArrayList : ���������� �����͸� �����ϱ� ���� Ŭ����
		ArrayList<String> list =new ArrayList<>();
		// 1. ������ �߰�
		list.add("���");
		list.add("�ٳ���");
		list.add("����");
		list.add("����");
		// 2. ������ ������
		String result = list.get(0);
		System.out.println(result);
		String result2 = list.get(2);
		System.out.println(result2);
		//3. Ư�� ��ġ�� ������ �߰�
		list.add(1, "������");
		String result3 = list.get(2);
		System.out.println(result3);
		// 4. ������ ����
		list.remove(0);
		String result4 = list.get(0);
		System.out.println(result4);
		// 5. ��̸���Ʈ ũ�� Ȯ��
		System.out.println(list.size());
	}

}
