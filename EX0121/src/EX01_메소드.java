import java.util.Random;

public class EX01_�޼ҵ� {

	public static void main(String[] args) {
		// Method -> �Լ�
		// ���!!
		
		Random rd = new Random();
		int num = rd.nextInt(1, 10);
		// Random ���� �̴� nextInt��� �޼ҵ忡 ���� �����ϼ���!
		// �Ű�����, ���ϰ�, ȣ�� �̶�� �ܾ ����Ͽ�!
		
		// ����(�޼ҵ�)�� ȣ���ϰ� �Ű����� 2(1, 10)���� ���޹޾� �� ���� �� �ϳ��� �������� ���� 
		// �ҷ����� �����ϴ� �޼ҵ�
		
		String name =  "������";
		if(name.equals("������")) {
			System.out.println("���� �ʴ�!");
		}
		System.out.println(name.length());
		
		// �Ű�����, ���ϰ�, ȣ���̶�� �ܾ� ������ ����Ͽ� �����ϱ�!!
		// String name�� �ִ� equals��� �޼ҵ带 ȣ��
		// equals �޼ҵ忡�� "������"�̶�� ������ �Ű����� 1���� �޾� name�� "������"�� ���Ͽ�
		// ���ϰ� boolean�� FALSE�� ȣ���� ������ ���� �����ش�
		// if�� ���� syso���� name�� �ִ� length �޼ҵ带 ȣ���Ͽ� name�� ���� ���̸� ȣ�� 
		
		int num22 = Integer.parseInt("1234"); // ���ڿ��� ���ڷ� �ٲ��ִ� �޼ҵ�!
		// Integer.parseInt��� �޼ҵ带 ȣ��
		// Integer.parseInt��� �޼ҵ忡�� ���ڿ� "1234" ������ �Ű������� 1�� �ް�
		// ���ϰ� 1234�� ȣ���� ������ ���� ������
		
		String num33 = Integer.toString(1234); // ���ڸ� ���ڿ��� �ٲ��ִ� �޼ҵ�!
		// Integer��� (Ŭ����)�� �ִ� toString��� �޼ҵ带 ȣ��
		// Integer.toString��� �޼ҵ忡�� ���� 1234 ������ �Ű������� 1�� �ް�
		// ���ϰ� ���ڿ� "1234"�� ȣ���� ������ ���� ������
		

	}

}
