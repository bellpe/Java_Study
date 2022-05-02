
public class EX01_배열실습 {

	public static void main(String[] args) {
		// 배열 만드는 방법
		// 1. 데이터 세팅(초기화) 하면서 배열 생성!
//		int[] numbers = {2, 3, 7, 4, 1, 2, 5};
//		
//		// 2. 텅 빈 n칸 짜리 배열 생성!
//		int[] num2 = new int[10]; 
		// new = ★메모리를 새로 만드는 키워드!★ int형 10칸 배열 메모리 생성하겠다!
		
		// 1) 계절을 저장하는 season이라는 배열 생성과 동시에 데이터 넣기
		// 2) 팀원 이름을 저장하는 team이라는 배열 5칸 생성!
		// 2-1) 각각 칸에 이름 저장하기
		String[] season = {"봄", "여름", "가을", "겨울"};
		String[] team = new String[5];
		team[0] = "정호진";
		team[1] = "정혜선";
		team[2] = "여미지";
		team[3] = "이권창";
		team[4] = "박준형";
//		team[5] = "유"; 예외발생!! 5번 인덱스 없음!
		
		season = team; // 주소가 복사!
		
		System.out.println(season[2]);
		// team은 5칸, season은 4칸인데 이게 어떻게 가능함??
		team[2] = "칼국수"; // 내가 바꾼거는 team인데
		System.out.println(season[2]);
		// 왜 season이 바뀜?
		
		System.out.println(season[4]);
		// 3) 이거 어떻게 됨?? 1. 에러 2. 문제없다.(뭐가 나올까?)
		System.out.println(team[4]);
		

	}

}
