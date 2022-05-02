package 인공지능_박준형;
import java.util.Scanner;

public class Question2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruits = {"자몽","망고", "바나나", "멜론"};
		System.out.println("찾고 싶은 과일 : ");
		String Fruits = sc.next();
		int loc = 0;
		for (int i = 0; i<fruits.length; i++) {
			if(Fruits.equals(fruits[i])) {
				loc += i+1;
			}
		}
		System.out.println(Fruits+ "의 위치는 " + loc+"번에 있습니다.");

	}

}
