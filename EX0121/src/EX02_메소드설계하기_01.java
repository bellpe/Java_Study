
public class EX02_�޼ҵ弳���ϱ�_01 {

	public static void main(String[] args) {
		// �� ���� ������ �Ű������� ���޹޾Ƽ� ���� �����ϴ� �޼ҵ� ����!
		
		// �� ���·� ����! ������ add �޼ҵ尡 ����ɱ��?
		// �޼ҵ�� ���� ����ɱ�?? => main���� ȣ���ؾ� �����!!
		
		int num = add(3, 5);
		double num1 = M(3, 5);
		double num2 = X(3, 5);
		double num3 = D(3, 5);
		
		System.out.println(num);
		System.out.println("���ϱ� : "+num+"\n����: "+num1+"\n���ϱ�: "+num2+"\n������: "+num3 );
		
		// ���� �޼ҵ�, ���ϱ� �޼ҵ�, ������ �޼ҵ�(�Ҽ�������)
		// 3�� �޼ҵ� �����ϰ� main���� ȣ���غ���~~
		
	}
	
	public static double M(double num1, double num2) {
		double m = num1 - num2;
		
		return m;
	}
	
	public static double X(double num1, double num2) {
		double x = num1 * num2;
		
		return x;
	} 
	
	public static double D(double num1, double num2) {
		 double D = num1 / num2;
		
		return D;
	}
	
	public static void temp(int num1) {
		num1 += 3;
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
		
		
	}

}
