package �л�����;

public class Student {
	
	// �л����� ������ ������ �� �ִ� ���赵
	// ���赵�� ���踸 ������ �� �����Ƿ� ��ü�� �����ϴ� main()X
	
	// 1.�ʵ� : ������, �Ӽ�
	// �̸�(String), �й�(String), ����, 
	// Java����, Web����, Android����(int)
	String name;
	String stunum;
	int age;
	int JavaScore;
	int WebScore;
	int AndroidScore;
	
	// ������ �޼ҵ� �����ϱ�
	// ����������, ����Ÿ��X, �޼ҵ��̸�(=Ŭ�����̸� ����)
	// ������ �޼ҵ尡 �޾Ƶ��� �Ű����� �����Ѵ�.
	
	// ��ü�� ������ �� field�� �ִ� �����͸� �ʱ�ȭ ��ų �� �ִ� �޼��� ����
	// ������(constructor)
	// 1) �����ڵ� �޼ҵ��̴�.
	// 2) �޼����� �̸��� Ŭ������ �̸��� ������ �̸��� ���´�.
	// 3) 
	
	
	// alt +shift + s -> generate constructor using...fields
	
	public Student(String name, String stunum, int age, int JavaScore, int WebScore, int AndroidScore) {
		this.name = name;
		this.age = age;
		this.stunum = stunum;
		this.JavaScore = JavaScore;
		this.WebScore = WebScore;
		this.AndroidScore = AndroidScore;
	}
	
	
//	public Student(String name, String stunum, int age, int javaScore, int webScore, int androidScore) {
//		super();
//		this.name = name;
//		this.stunum = stunum;
//		this.age = age;
//		JavaScore = javaScore;
//		WebScore = webScore;
//		AndroidScore = androidScore;
//	}


	// 2.�޼��� : ���, ����
	// show() �޼ҵ� ����
	// ���������� + ����Ÿ�� + �޼ҵ� �̸�
	public void show() {
		System.out.println(name+"�� �ȳ��ϼ���");
		System.out.println();
	}

}
