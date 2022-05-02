package Ex01_클래스와객체;

public class Seed {
	String name;
	int age;
	int hungry; 
	int O2;
	
	// 행동,
	public void feed(String food) {
		if(food.equals("물")) {
			System.out.println("(상쾌~)");
			hungry +=100;
			O2 += 10;
		}else if(food.equals("햇살")) {
			System.out.println("(만족~)");
			hungry +=100;
			O2 += 10;
		}else {
			System.out.println("(불편~)");
		}
	}

}
