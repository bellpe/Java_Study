package Ex01_Ŭ�����Ͱ�ü;

public class Seed {
	String name;
	int age;
	int hungry; 
	int O2;
	
	// �ൿ,
	public void feed(String food) {
		if(food.equals("��")) {
			System.out.println("(����~)");
			hungry +=100;
			O2 += 10;
		}else if(food.equals("�޻�")) {
			System.out.println("(����~)");
			hungry +=100;
			O2 += 10;
		}else {
			System.out.println("(����~)");
		}
	}

}
