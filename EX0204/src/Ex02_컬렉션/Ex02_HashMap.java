package Ex02_�÷���;

import java.util.HashMap;

public class Ex02_HashMap {

	public static void main(String[] args) {
		// HashMap : key�� value ���·� ���� �����Ͽ� �����͸� �����ϴ� Ŭ����
		// �����̶� �����
		HashMap<String, String> map = new HashMap<>();
		
		map.put("apple", "���");
		map.put("banana", "�ٳ���");
		map.put("orange", "������");
		
		String result = map.get("banana");
		System.out.println(result);
		
		map.remove("apple");
		
		System.out.println(map.size());

	}

}
