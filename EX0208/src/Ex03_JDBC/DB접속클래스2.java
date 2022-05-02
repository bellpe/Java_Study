package Ex03_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DB����Ŭ����2 {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs; // select ����� ��� �ִ� ��ü
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	

	public void getConnection() {
		try {
			// 1. DB ����̹� �ε�
			// �� ȸ�翡�� interface�� ���缭 ���� ����̹��� �޸𸮿� �ø���.
			Class.forName(driver);
			// 2. Connection ��ü ����
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Member selectOne(String id) {
		Member m = null;
		try {
			//1~2. ����̹��ε� �� Ŀ�ؼ� ��ü ����
			getConnection();
			// 3. SQL �ۼ� �� �غ�
			String sql ="select* from member where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			// 4. SQL�� ����
			rs = psmt.executeQuery(); // select���� ����Ҷ� ȣ���ϴ� �޼ҵ�
			// 5. ���� ��� Ȯ��
			while(rs.next()) {
				String result_id =rs.getString("ID");
				String result_pass = rs.getString("PASSWORD");
				String result_name = rs.getString("NAME");
				m = new Member(result_id, result_pass, result_name);
			}
		}catch(Exception e) {
		e.printStackTrace();
		}finally {
			close();
		}
		return m; // ������ ȸ�� ��ü�� main���� ��ȯ(����)
	}
	
	
	public void close() { // DB���� ���� ��ü�� �޸𸮿��� �����ϴ� �޼ҵ�
		   try{
			   if(rs != null) rs.close();
			   if(psmt != null) conn.close();
			   if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();}
		}

	public ArrayList<Member> selectAll() {
		ArrayList<Member> list = new ArrayList<>();
		try {
			//1~2. ����̹��ε� �� Ŀ�ؼ� ��ü ����
			getConnection();
			// 3. SQL �ۼ� �� �غ�
			String sql ="select* from member";
			psmt = conn.prepareStatement(sql);
			// 4. SQL�� ����
			rs = psmt.executeQuery(); // select���� ����Ҷ� ȣ���ϴ� �޼ҵ�
			// 5. ���� ��� Ȯ��
			while(rs.next()) {
				String result_id =rs.getString("ID");
				String result_pass = rs.getString("PASSWORD");
				String result_name = rs.getString("NAME");
				Member m = new Member(result_id, result_pass, result_name);
				list.add(m);
			}
		}catch(Exception e) {
		e.printStackTrace();
		}finally {
			close();
		}
		return list;
		
	}

}
