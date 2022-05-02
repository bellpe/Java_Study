import java.util.Scanner;

public class EX03_배열연습 {

	public static void main(String[] args) {
		String[] 요일 = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("요일을 입력해주세요 >> ");
		String a = scan.next();
		for(int i=0; i<7; i++) {
			if(요일[i].equals(a)) {
				System.out.println(a+"는"+i+"번째 요일입니다!");
				break;
			} // break; 를 쓰면 동명이인(동일한 데이터)이 없다는 가정 하에 남은 인원들을
			// 또 더 이상 반복해서 돌릴 필요가 없기 때문에 효율적이다.
			else if(i+1==7){
				System.out.println("존재하지 않습니다!");
			}
		}
		
		

	}

}
