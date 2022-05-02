package Ex03_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DB접속클래스2 {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs; // select 결과를 담고 있는 객체
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	

	public void getConnection() {
		try {
			// 1. DB 드라이버 로딩
			// 각 회사에서 interface를 맞춰서 만든 드라이버를 메모리에 올린다.
			Class.forName(driver);
			// 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Member selectOne(String id) {
		Member m = null;
		try {
			//1~2. 드라이버로딩 및 커넥션 객체 생성
			getConnection();
			// 3. SQL 작성 및 준비
			String sql ="select* from member where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			// 4. SQL문 실행
			rs = psmt.executeQuery(); // select문을 사용할때 호출하는 메소드
			// 5. 실행 결과 확인
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
		return m; // 생성한 회원 객체를 main에게 반환(전달)
	}
	
	
	public void close() { // DB접속 관련 객체를 메모리에서 해제하는 메소드
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
			//1~2. 드라이버로딩 및 커넥션 객체 생성
			getConnection();
			// 3. SQL 작성 및 준비
			String sql ="select* from member";
			psmt = conn.prepareStatement(sql);
			// 4. SQL문 실행
			rs = psmt.executeQuery(); // select문을 사용할때 호출하는 메소드
			// 5. 실행 결과 확인
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
