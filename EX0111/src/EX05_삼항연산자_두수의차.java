import java.util.Scanner;

public class EX05_���׿�����_�μ����� {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("ù ��° ���� �Է� : ");
	int num = scan.nextInt();
	System.out.print("�� ���� ���� �Է� : ");
	int num1 = scan.nextInt();
	
	// 2. ū ������ ���� ��(����)�� �� ��� -> ���׿����� ���� ? �� �� �� ���� : ������ �� ����
	// 3. ���
	System.out.println(num>num1 ? num-num1 : num1-num);
	// Scanner�� ���������� �̿��غ����?? ���� �ǽ��ҽ��� �����ϼŵ� �˴ϴ� :)

	}

}
