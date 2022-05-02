package Ex02_컬렉션;

import java.util.HashMap;

public class Ex02_HashMap {

	public static void main(String[] args) {
		// HashMap : key와 value 형태로 값을 저장하여 데이터를 관리하는 클래스
		// 사전이랑 비슷함
		HashMap<String, String> map = new HashMap<>();
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("orange", "오렌지");
		
		String result = map.get("banana");
		System.out.println(result);
		
		map.remove("apple");
		
		System.out.println(map.size());

	}

}
