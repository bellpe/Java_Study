package Ex03_JDBC;

import java.util.ArrayList;

public class Main_selectAll {

	public static void main(String[] args) {
		// ��ü ȸ�� ������ �������� ���
		DB����Ŭ����2 db = new DB����Ŭ����2();
		ArrayList<Member> list = db.selectAll();
		System.out.println(list.size());

	}

}
