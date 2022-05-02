package Ex03_JDBC;

import java.util.ArrayList;

public class Main_selectAll {

	public static void main(String[] args) {
		// 전체 회원 정보를 가져오는 기능
		DB접속클래스2 db = new DB접속클래스2();
		ArrayList<Member> list = db.selectAll();
		System.out.println(list.size());

	}

}
