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
	               System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
	               System.out.println("                                         ");
	               System.out.println("             Homerunball Game            ");
	               System.out.println("                (��^��^)��*����             ");
	               System.out.println("                                         ");
	               System.out.println("     [1] �α���   [2]ȸ������    [3] ����    ");
	               System.out.println("                                         ");
	               System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
	               System.out.print(">> ");
	               int i = sc.nextInt();
	               switch (i) {
	               
	               case 1:
	                  controller.loginBanner();
	                  System.out.print("���̵� �Է� ���ּ���>> ");
	                  id = sc.next();
	                  System.out.print("��й�ȣ�� �Է� ���ּ���>> ");
	                  pw = sc.next();
	                  
	                  member = controller.login(id, pw);
	                  
	                  if (member == null) {
	                     System.out.println("�α��� ����! �ٽ� �õ��Ͻðڽ��ϱ�?? [ Y / N ]");
	                     String str = sc.next();
	                     
	                     if (str.equals("n") || str.equals("N")) {
	                        toggle = false;
	                        tog = false;
	                        System.out.println("�����մϴ�.");
	                        System.out.println("�Ϸη� .. �ڡ�");
	                     }
	                     continue;
	                  }
	                  
	                  System.out.println("�α��μ���!");
	                  System.out.println();
	                  tog = false;
	                  continue;
	                  
	               case 2:
	                  controller.joinBanner();
	                  System.out.print("���̵� �Է� ���ּ���>> ");
	                  id = sc.next();
	                  System.out.print("��й�ȣ�� �Է� ���ּ���>> ");
	                  pw = sc.next();
	                  cnt = controller.join(id, pw);
	                  if (cnt > 0) {
	                     System.out.println("ȸ������ ����");
	                     System.out.println();
	                     continue;
	                  }
	                  System.out.println("ȸ������ ����! �ٽ� �õ��Ͻðڽ��ϱ�?? [ Y / N ]");
	                  input = sc.next();
	                  if (input.equals("n") || input.equals("N")) {
	                     System.out.println("�����մϴ�.");
	                     System.out.println("�Ϸη� .. �ڡ�");
	                     controller.save(member);
	                     toggle = false;
	                     tog = false;
	                  }
	                  continue;
	               }
	               
	               System.out.println("�����մϴ�.");
	               System.out.println("�Ϸη� .. �ڡ�");
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

	                  System.out.println("�ܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡ�");
	                  System.out.println("               �̱���                  ");
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
	                  System.out.println("�ܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡۡܡ�");
	                  controller.save(member);
	                  continue;
	               }
	               System.out.println(" (�����) �̱�Ƚ���� �����մϴ�. ");
	               continue;

	            case 2:
	               swit = false;
	               continue;
	            }
	            System.out.println("�����մϴ�.");
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
	            System.out.println("|              ������ �����ϼ���             |");
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
	            System.out.println("���� ����: " + pitcher.getName());
	            System.out.println("�ɷ�ġ : " + pitcher.getAbility());

	            int result = ((playerVO) players.get(selectPlayer - 1)).getAbility() - pitcher.getAbility();

	            if (result < 11) {
	               strike++;
	               System.out.println("");
	               int j;

	               for (j = 0; j < strike; j++) {
	                  System.out.print("");
	               }
	               for (j = 0; j < 3 - strike; j++) {
	                  System.out.print("��(�� �� �� l|l)/  ��Ʈ����ũ!");
	               }
	               System.out.println();

	            } else if (result < 51) {
	               System.out.println("��(>��< )��=3=3=3=3=3 ��Ÿ! 1�� �������ϴ�!");
	               score++;
	               System.out.println("����" + score + "�� �Դϴ�.");

	            } else {
	               System.out.println("�ݢ� ~ (��0�� ) Ȩ~~~��! 2�� �������ϴ�!");
	               score += 2;
	               System.out.println("����" + score + "�� �Դϴ�.");
	            }

	         } while (score < 10 && strike < 3);

	         if (score > 9) {
	            System.out.println("(����_��)/ �¸��ϼ̽��ϴ�.!!");
	            member.setScore(member.getScore() + 1);
	            member.setStreak(member.getStreak() + 1);

	            if (member.getStreak() == 2) {
	               System.out.println("2���¿� �����Ͽ� �̱� Ƚ���� 1ȸ �־����ϴ�. m(�ߣ�)m");
	               member.setDraw(member.getDraw() + 1);
	               member.setStreak(0);
	            }

	         } else {
	            System.out.println(" (��-_-)��~������  �й��Ͽ����ϴ�.");
	         }

	         System.out.print("����Ͻðڽ��ϰ�?? [ y / n ] >> ");
	         String choose = sc.next();

	         if (choose.equals("n") || choose.equals("N")) {
	            System.out.println("�����մϴ�.");
	            System.out.println("�Ϸη� .. �ڡ�");
	            controller.save(member);
	            toggle = false;
	            continue;
	         }

	         controller.save(member);
	         toggle = true;

	      }
	   }

}
