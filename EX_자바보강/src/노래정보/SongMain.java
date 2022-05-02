package 노래정보;

public class SongMain {

	public static void main(String[] args) {
		// 코드가 실행되어지는 부분
		// 1. 설계도면을 가지고 객체 생성
		// 생성과 동시에 필드를 초기화
		Song song1 = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		Song song2 = new Song("사랑했나봐", "윤도현", 2005, "한국");
		// 1978년
		// 스웨덴
		// ABBA
		// Dancing Queen
		
		
		
		// 2. show() 메서드를 사용해서 노래의 정보를 출력
		// music1.show();
		
		song1.show();
		song2.show();

	}

}
