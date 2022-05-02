package Ex02_컬렉션;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// ArrayList : 순차적으로 데이터를 관리하기 좋은 클래스
		ArrayList<String> list =new ArrayList<>();
		// 1. 데이터 추가
		list.add("사과");
		list.add("바나나");
		list.add("포도");
		list.add("수박");
		// 2. 데이터 꺼내기
		String result = list.get(0);
		System.out.println(result);
		String result2 = list.get(2);
		System.out.println(result2);
		//3. 특정 위치에 데이터 추가
		list.add(1, "오렌지");
		String result3 = list.get(2);
		System.out.println(result3);
		// 4. 데이터 삭제
		list.remove(0);
		String result4 = list.get(0);
		System.out.println(result4);
		// 5. 어레이리스트 크기 확인
		System.out.println(list.size());
	}

}
