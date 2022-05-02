package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Model.memberVO;
import Model.playerVO;

public class Main {
	 public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      Controller controller = new Controller();
	      memberVO member = null;
	      ArrayList<playerVO> players = null;
	      boolean toggle = true;

	      while (toggle) {
	         boolean tog = true;

	         if (member == null)

	            while (tog) {
	               String id, pw;
	               int cnt;
	               String input;;
	               System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
	               System.out.println("                                         ");
	               System.out.println("             Homerunball Game            ");
	               System.out.println("                (ㄴ^□^)ㄱ*～●             ");
	               System.out.println("                                         ");
	               System.out.println("     [1] 로그인   [2]회원가입    [3] 종료    ");
	               System.out.println("                                         ");
	               System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
	               System.out.print(">> ");
	               int i = sc.nextInt();
	               switch (i) {
	               
	               case 1:
	                  controller.loginBanner();
	                  System.out.print("아이디를 입력 해주세요>> ");
	                  id = sc.next();
	                  System.out.print("비밀번호를 입력 해주세요>> ");
	                  pw = sc.next();
	                  
	                  member = controller.login(id, pw);
	                  
	                  if (member == null) {
	                     System.out.println("로그인 실패! 다시 시도하시겠습니까?? [ Y / N ]");
	                     String str = sc.next();
	                     
	                     if (str.equals("n") || str.equals("N")) {
	                        toggle = false;
	                        tog = false;
	                        System.out.println("종료합니다.");
	                        System.out.println("뾰로롱 .. ★☆");
	                     }
	                     continue;
	                  }
	                  
	                  System.out.println("로그인성공!");
	                  System.out.println();
	                  tog = false;
	                  continue;
	                  
	               case 2:
	                  controller.joinBanner();
	                  System.out.print("아이디를 입력 해주세요>> ");
	                  id = sc.next();
	                  System.out.print("비밀번호를 입력 해주세요>> ");
	                  pw = sc.next();
	                  cnt = controller.join(id, pw);
	                  if (cnt > 0) {
	                     System.out.println("회원가입 성공");
	                     System.out.println();
	                     continue;
	                  }
	                  System.out.println("회원가입 실패! 다시 시도하시겠습니까?? [ Y / N ]");
	                  input = sc.next();
	                  if (input.equals("n") || input.equals("N")) {
	                     System.out.println("종료합니다.");
	                     System.out.println("뾰로롱 .. ★☆");
	                     controller.save(member);
	                     toggle = false;
	                     tog = false;
	                  }
	                  continue;
	               }
	               
	               System.out.println("종료합니다.");
	               System.out.println("뾰로롱 .. ★☆");
	               toggle = false;
	               break;
	            }

	         if (!toggle) continue;
	         boolean swit = true;
	         while (swit) {
	            controller.drawBanner(member.getDraw());
	            int i = sc.nextInt();
	            switch (i) {
	            case 1:
	               if (member.getDraw() > 0) {
	                  players = controller.drawPlayer(member.getDraw(), member.getId());
	                  member.setDraw(0);

	                  System.out.println("●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○");
	                  System.out.println("               뽑기결과                  ");
	                  System.out.print(" ");

	                  int j;
	                  for (j = 0; j < players.size(); j++) {
	                     System.out.print(String.valueOf(((playerVO) players.get(j)).getName()) + "\t");
	                     System.out.println(" |");
	                     System.out.print("| ");
	                  }

	                  for (j = 0; j < players.size(); j++) {
	                     System.out.print(String.valueOf(((playerVO) players.get(j)).getAbility()) + "\t");
	                     System.out.println(" |");
	                  }
	                  System.out.println("●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○●○");
	                  controller.save(member);
	                  continue;
	               }
	               System.out.println(" (￣ｏ￣) 뽑기횟수가 부족합니다. ");
	               continue;

	            case 2:
	               swit = false;
	               continue;
	            }
	            System.out.println("종료합니다.");
	            controller.save(member);
	            toggle = false;
	            swit = false;
	         }
	         if (!toggle)
	            continue;

	         int score = 0;
	         int strike = 0;

	         do {
	            players = controller.selectPlayer(member.getId());
	            System.out.println("============================================");
	            System.out.println("               Homerunball Game             ");
	            System.out.println("============================================");
	            System.out.println("|              선수를 선택하세요             |");
	            System.out.print("| ");

	            int i;
	            for (i = 0; i < players.size(); i++) 
	               System.out.print("[ " + (i + 1) + " ]" + "\t");
	               System.out.println(" |");
	               System.out.print("| ");
	            

	            for (i = 0; i < players.size(); i++) 
	               System.out.print(String.valueOf(((playerVO) players.get(i)).getName()) + "\t");
	               System.out.println(" |");
	               System.out.print("| ");
	            

	            for (i = 0; i < players.size(); i++) 
	               System.out.print(String.valueOf(((playerVO) players.get(i)).getAbility()) + "\t");
	               System.out.println(" |");
	               System.out.print(">> ");
	            
	            int selectPlayer = sc.nextInt();
	            System.out.println("============================================");
	            System.out.println();

	            playerVO pitcher = controller.selectPitcher(member.getId());
	            System.out.println("등판 투수: " + pitcher.getName());
	            System.out.println("능력치 : " + pitcher.getAbility());

	            int result = ((playerVO) players.get(selectPlayer - 1)).getAbility() - pitcher.getAbility();

	            if (result < 11) {
	               strike++;
	               System.out.println("");
	               int j;

	               for (j = 0; j < strike; j++) {
	                  System.out.print("");
	               }
	               for (j = 0; j < 3 - strike; j++) {
	                  System.out.print("＼(º □ º l|l)/  스트라이크!");
	               }
	               System.out.println();

	            } else if (result < 51) {
	               System.out.println("ㄴ(>▽< )ㄱ=3=3=3=3=3 안타! 1점 가져갑니다!");
	               score++;
	               System.out.println("현재" + score + "점 입니다.");

	            } else {
	               System.out.println("♬♪ ~ (˘0˘ ) 홈~~~런! 2점 가져갑니다!");
	               score += 2;
	               System.out.println("현재" + score + "점 입니다.");
	            }

	         } while (score < 10 && strike < 3);

	         if (score > 9) {
	            System.out.println("(┌■_■)/ 승리하셨습니다.!!");
	            member.setScore(member.getScore() + 1);
	            member.setStreak(member.getStreak() + 1);

	            if (member.getStreak() == 2) {
	               System.out.println("2연승에 성공하여 뽑기 횟수가 1회 주어집니다. m(＿＿)m");
	               member.setDraw(member.getDraw() + 1);
	               member.setStreak(0);
	            }

	         } else {
	            System.out.println(" (ノ-_-)ノ~┻━┻  패배하였습니다.");
	         }

	         System.out.print("계속하시겠습니가?? [ y / n ] >> ");
	         String choose = sc.next();

	         if (choose.equals("n") || choose.equals("N")) {
	            System.out.println("종료합니다.");
	            System.out.println("뾰로롱 .. ★☆");
	            controller.save(member);
	            toggle = false;
	            continue;
	         }

	         controller.save(member);
	         toggle = true;

	      }
	   }

}
