package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Model.DAO;
import Model.memberVO;
import Model.playerVO;

public class Controller {
 Scanner sc = new Scanner(System.in);
     
     DAO dao = new DAO();
     
     memberVO member = null;
     
     Random ran = new Random();
     
     public void loginBanner() {
       System.out.println("============================================");
       System.out.println("                 �α��� ���ּ���               ");
       System.out.println("============================================");
     }
     
     public void joinBanner() {
       System.out.println("============================================");
       System.out.println("                 ȸ������ ���ּ���             ");
       System.out.println("============================================");
     }
     
     public void mainBanner() {
       System.out.println("============================================");
       System.out.println("                �޴��� �������ּ���             ");
       System.out.println("                                            ");
       System.out.println("         [1]�����̱�         [2]���ӽ���       ");
       System.out.println("============================================");
       System.out.print(">> ");
     }
     
     public void drawBanner(int drawCount) {
       System.out.println("============================================");
       System.out.println("            "+ drawCount + "  ȸ ���� �� �ֽ��ϴ�.   ");
       System.out.println("                                           ");
       System.out.println("         [1]�����̱�         [2]���ӽ���       ");
       System.out.println("============================================");
       System.out.print(">> ");
     }
     
     public memberVO login(String member_id, String member_pw) {
       this.member = this.dao.login(member_id, member_pw);
       return this.member;
     }
     
     public int join(String member_id, String member_pw) {
       int cnt = 0;
       if (this.dao.idCheck(member_id)) {
         cnt = this.dao.join(member_id, member_pw);
       } else {
         System.out.println("");
       } 
       return cnt;
     }
     
     public playerVO createPlayer() {
       String[] player_name = {"��ȣ��", "������", "������", "������", "�̱�â",
                             "������", "������" ,"�Ѽ���", "�̻��", "������",
                             "�ȼ���", "������", "���μ�", "���ؿ�", "�̽���",
                             "�ϼ���", "�̼���", "������", "��ټ�", "������",
                             "���Ϻ�", "��ȫ��", "�迵��", "�ȿ���", "��â��",
                             "������", "Ȳ�ص�"};
       
       String name = String.valueOf(player_name[this.ran.nextInt(player_name.length)]);
       int ability = this.ran.nextInt(100) + 1;
       playerVO player = new playerVO(name, ability);
       return player;
     }
     
     public ArrayList<playerVO> drawPlayer(int drawCount, String id) {
       ArrayList<playerVO> players = new ArrayList<>();
       playerVO player = null;
       int i;
       for (i = 0; i < drawCount; i++)
         players.add(createPlayer()); 
       for (i = 0; i < players.size(); i++)
         for (int j = 0; j < drawCount; j++); 
       this.dao.playerInsert(players, id);
       return players;
     }
     
     public ArrayList<playerVO> selectPlayer(String member_id) {
       ArrayList<playerVO> players = this.dao.selectPlayers(member_id);
       return players;
     }
     
     public playerVO selectPitcher(String member_id) {
       playerVO pitcher = this.dao.selectPitcher(member_id);
       return pitcher;
     }
     
     public void save(memberVO member) {
       int cnt = this.dao.save(member);
       if (cnt > 0) {
         System.out.println("");
       } else {
         System.out.println("");
       }
     }

}
