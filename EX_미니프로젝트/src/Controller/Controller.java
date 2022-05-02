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
       System.out.println("                 로그인 해주세요               ");
       System.out.println("============================================");
     }
     
     public void joinBanner() {
       System.out.println("============================================");
       System.out.println("                 회원가입 해주세요             ");
       System.out.println("============================================");
     }
     
     public void mainBanner() {
       System.out.println("============================================");
       System.out.println("                메뉴를 선택해주세요             ");
       System.out.println("                                            ");
       System.out.println("         [1]선수뽑기         [2]게임시작       ");
       System.out.println("============================================");
       System.out.print(">> ");
     }
     
     public void drawBanner(int drawCount) {
       System.out.println("============================================");
       System.out.println("            "+ drawCount + "  회 뽑을 수 있습니다.   ");
       System.out.println("                                           ");
       System.out.println("         [1]선수뽑기         [2]게임시작       ");
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
       String[] player_name = {"정호진", "양혜선", "박준형", "여미지", "이권창",
                             "허혜주", "엄선경" ,"한세윤", "이상원", "유도영",
                             "안성민", "공지연", "안인성", "김준용", "이승윤",
                             "하성진", "이선재", "김찬주", "김다솔", "김현상",
                             "김하빈", "나홍주", "김영현", "안영균", "김창현",
                             "정세연", "황해도"};
       
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
