import java.util.Scanner;

public class EX03_자바배열연습 {

	public static void main(String[] args) {
		String[] week= {"월", "화", "수", "목", "금", "토", "일"};
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 >> ");
		String keyword = scan.next();
		
		boolean isFind = false;
		for(int i=0; i<week.length; i++) {
			if(week[i].equals(keyword)) {
				System.out.println(keyword+"는"+i++);
				isFind =true;
				break;
			}
		}
		if(!isFind) {
			System.out.println("존재하지 않는 요일입니다.");
		}

	}

}
