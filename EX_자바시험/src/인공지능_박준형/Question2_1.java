package �ΰ�����_������;
import java.util.Scanner;

public class Question2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruits = {"�ڸ�","����", "�ٳ���", "���"};
		System.out.println("ã�� ���� ���� : ");
		String Fruits = sc.next();
		int loc = 0;
		for (int i = 0; i<fruits.length; i++) {
			if(Fruits.equals(fruits[i])) {
				loc += i+1;
			}
		}
		System.out.println(Fruits+ "�� ��ġ�� " + loc+"���� �ֽ��ϴ�.");

	}

}
