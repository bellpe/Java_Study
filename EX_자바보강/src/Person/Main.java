package Person;

public class Main {

	public static void main(String[] args) {
		
		// ����Ǵ� ����
		// 1. ���赵���� ������ ��ü(Object) ����
		person nature = new person();
		// new -> ���۷��� ���� ���� Ű����
		// ���۷��� ���� -> ������, �ּҰ�
		System.out.println(nature);
		
		nature.name = "���ڿ�";
		System.out.println(nature.name);
		// ����, ���� ä���� ����ϱ�
		nature.gender = "��";
		System.out.println(nature.gender);
		nature.age = 29;
		System.out.println(nature.age);
		
		
		
		// ��� �ҷ�����
		nature.eat();
		System.out.println(nature.sleep());
		
		// ������ ���赵���� ������ ���� ���� ��ü ���� �����ϴ�.
		// ������ ���赵���� ������ �ڱ��ڽ��� ������
		person jun = new person();
		System.out.println(jun);
		jun.name = "������";
		System.out.println(jun.name);
		jun.gender = "��";
		System.out.println(jun.gender);
		jun.age = 28;
		System.out.println(jun.age);

	}

}
