import java.util.Scanner;

public class EX03_�ڹٹ迭���� {

	public static void main(String[] args) {
		String[] week= {"��", "ȭ", "��", "��", "��", "��", "��"};
		Scanner scan = new Scanner(System.in);
		System.out.print("�˻��� >> ");
		String keyword = scan.next();
		
		boolean isFind = false;
		for(int i=0; i<week.length; i++) {
			if(week[i].equals(keyword)) {
				System.out.println(keyword+"��"+i++);
				isFind =true;
				break;
			}
		}
		if(!isFind) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}

	}

}
