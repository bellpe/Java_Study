package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class DAO {
 ArrayList<memberVO> rank = new ArrayList<>(0);
     
     Connection conn = null;
     
     ResultSet rs = null;
     
     PreparedStatement psmt = null;
     
     memberVO member = null;
     
     Scanner sc = new Scanner(System.in);
     
     int cnt = 0;
     
     String sql = "";
     
     public void connection() {
       try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
         String id = "campus_g_1_0207";
         String pw = "smhrd1";
         this.conn = DriverManager.getConnection(url, id, pw);
       } catch (Exception exception) {}
     }
     
     public void close() {
       try {
         if (this.rs != null)
           this.rs.close(); 
         if (this.psmt != null)
           this.psmt.close(); 
         if (this.conn != null)
           this.conn.close(); 
       } catch (Exception exception) {}
     }
     
     public boolean idCheck(String member_id) {
       boolean Check = true;
       connection();
       try {
         this.sql = "select * from member_info where id = ?";
         this.psmt = this.conn.prepareStatement(this.sql);
         this.psmt.setString(1, member_id);
         this.rs = this.psmt.executeQuery();
         Check = !this.rs.next();
       } catch (Exception exception) {}
       close();
       return Check;
     }
     
     public int join(String member_id, String member_pw) {
       connection();
       try {
         this.sql = "insert into member_info values(?, ?, 0, 5, 0)";
         this.psmt = this.conn.prepareStatement(this.sql);
         this.psmt.setString(1, member_id);
         this.psmt.setString(2, member_pw);
         this.cnt = this.psmt.executeUpdate();
       } catch (Exception exception) {}
       close();
       return this.cnt;
     }
     
     public memberVO login(String member_id, String member_pw) {
       memberVO member = null;
       connection();
       try {
         this.sql = "select * from member_info where id = ? and pw = ?";
         this.psmt = this.conn.prepareStatement(this.sql);
         this.psmt.setString(1, member_id);
         this.psmt.setString(2, member_pw);
         this.rs = this.psmt.executeQuery();
         if (this.rs.next()) {
           String id = this.rs.getString(1);
           String pw = this.rs.getString(2);
           int score = this.rs.getInt(3);
           int draw = this.rs.getInt(4);
           int streak = this.rs.getInt(5);
           member = new memberVO(id, pw, score, draw, streak);
         } 
       } catch (Exception exception) {}
       return member;
     }
     
     public void playerInsert(ArrayList<playerVO> players, String id) {
       for (int i = 0; i < players.size(); i++) {
         connection();
         try {
           this.sql = "insert into player values(player_seq.nextval, ?,?,?)";
           this.psmt = this.conn.prepareStatement(this.sql);
           this.psmt.setString(1, ((playerVO)players.get(i)).getName());
           this.psmt.setString(2, id);
           this.psmt.setInt(3, ((playerVO)players.get(i)).getAbility());
           this.cnt = this.psmt.executeUpdate();
         } catch (Exception e) {
           e.printStackTrace();
         } 
         close();
       } 
     }
     
     public ArrayList<playerVO> selectPlayers(String member_id) {
       ArrayList<playerVO> players = new ArrayList<>();
       connection();
       try {
         this.sql = "select * from player where id = ?";
         this.psmt = this.conn.prepareStatement(this.sql);
         this.psmt.setString(1, member_id);
         this.rs = this.psmt.executeQuery();
         while (this.rs.next()) {
           String player_name = this.rs.getString(2);
           int ability = this.rs.getInt(4);
           players.add(new playerVO(player_name, member_id, ability));
         } 
       } catch (Exception exception) {}
       close();
       return players;
     }
     
     public playerVO selectPitcher(String member_id) {
       playerVO pitcher = null;
       connection();
       try {
         this.sql = "select * from ( select * from player order by dbms_random.random ) where rownum < 2 and id not in (?)";
         this.psmt = this.conn.prepareStatement(this.sql);
         this.psmt.setString(1, member_id);
         this.rs = this.psmt.executeQuery();
         if (this.rs.next()) {
           String player_name = this.rs.getString(2);
           int ability = this.rs.getInt(4);
           pitcher = new playerVO(player_name, member_id, ability);
         } else {
           System.out.println("");
         } 
       } catch (Exception exception) {}
       close();
       return pitcher;
     }
     
     public int save(memberVO member) {
       connection();
       try {
         this.sql = "update member_info set score=?, draw=?,streak=? where id = ?";
         this.psmt = this.conn.prepareStatement(this.sql);
         this.psmt.setInt(1, member.getScore());
         this.psmt.setInt(2, member.getDraw());
         this.psmt.setInt(3, member.getStreak());
         this.psmt.setString(4, member.getId());
         this.cnt = this.psmt.executeUpdate();
       } catch (Exception e) {
         e.printStackTrace();
       } 
       close();
       return this.cnt;
     }
     
     public ArrayList<memberVO> ranking() {
       return this.rank;
     }
   

}
