package Ex03_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB����Ŭ���� {
	private Connection conn;
	private PreparedStatement psmt;
	private void getConnection() {
		try {
		// 1. DB ����̹� �ε�
		// �� ȸ�翡�� interface�� ���缭 ���� ����̹��� �޸𸮿� �ø���.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. Connection ��ü ����
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		 conn = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(String id, String pass, String name) {
		try { // ����ó�� : �������� ������ �ƴϰ�, �����߿� �߻��ϴ� ���ܻ�Ȳ�� ó���ϴ� ����
			getConnection();
			// 3. Statements ��ü ����
			// ������ SQL���� �ۼ��ϰ� �غ��ϴ� �۾�
			String sql = "insert into member values (?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pass);
			psmt.setString(3, name);
			
			// 4. SQL�� ����
			// sql���� ������ ���� row�� ����
			int row = psmt.executeUpdate();
			// 5. ������ Ȯ��
			if(row !=0) {
				System.out.println("���༺��");
			}else {
				System.out.println("SQL�� ���� ����");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ŭ������ ã�� ������.");
		}finally { // ������ ���ܰ� �߻��ϴ��� �ݵ�� �����ϴ� ��ϱ���
			close();
		}
		
		
	}
	
	public void update(String id, String pass) {
		try { // ����ó�� : �������� ������ �ƴϰ�, �����߿� �߻��ϴ� ���ܻ�Ȳ�� ó���ϴ� ����
			getConnection();
			// 3. Statements ��ü ����
			// ������ SQL���� �ۼ��ϰ� �غ��ϴ� �۾�
			String sql = "update member set password=? where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pass);
			psmt.setString(2, id);
			
			// 4. SQL�� ����
			// sql���� ������ ���� row�� ����
			int row = psmt.executeUpdate();
			// 5. ������ Ȯ��
			if(row !=0) {
				System.out.println("���༺��");
			}else {
				System.out.println("SQL�� ���� ����");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ŭ������ ã�� ������.");
		}finally { // ������ ���ܰ� �߻��ϴ��� �ݵ�� �����ϴ� ��ϱ���
			close();
		}
	}
	
	public void delete(String id) {
		try { // ����ó�� : �������� ������ �ƴϰ�, �����߿� �߻��ϴ� ���ܻ�Ȳ�� ó���ϴ� ����
			getConnection();
			// 3. Statements ��ü ����
			// ������ SQL���� �ۼ��ϰ� �غ��ϴ� �۾�
			String sql = "delete member where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			// 4. SQL�� ����
			// sql���� ������ ���� row�� ����
			int row = psmt.executeUpdate();
			// 5. ������ Ȯ��
			if(row !=0) {
				System.out.println("���༺��");
			}else {
				System.out.println("SQL�� ���� ����");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ŭ������ ã�� ������.");
		}finally { // ������ ���ܰ� �߻��ϴ��� �ݵ�� �����ϴ� ��ϱ���
			close();
		}
	}
	
	public void close() { // DB���� ���� ��ü�� �޸𸮿��� �����ϴ� �޼ҵ�
	   try{
		   if(psmt != null) conn.close();
		   if(conn != null) conn.close();
	}catch(Exception e) {
		e.printStackTrace();}
	}

}
