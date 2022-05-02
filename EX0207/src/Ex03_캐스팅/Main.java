package Ex03_캐스팅;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		Dog d = new Dog();
		
		// 업캐스팅 : 하위 타입을 상위타입으로 형변환
		// 실제 캑체가 변환되는게 아니라 껍데기가 상위타입으로 변환되는 것
		Animal a = c;
		
		// 다운캐스팅 : 상위타입을 하위타입으로 형변환
		Cat c2 = (Cat)a;

	}

}
