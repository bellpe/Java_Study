
public class EX01_�迭�ǽ� {

	public static void main(String[] args) {
		// �迭 ����� ���
		// 1. ������ ����(�ʱ�ȭ) �ϸ鼭 �迭 ����!
//		int[] numbers = {2, 3, 7, 4, 1, 2, 5};
//		
//		// 2. �� �� nĭ ¥�� �迭 ����!
//		int[] num2 = new int[10]; 
		// new = �ڸ޸𸮸� ���� ����� Ű����!�� int�� 10ĭ �迭 �޸� �����ϰڴ�!
		
		// 1) ������ �����ϴ� season�̶�� �迭 ������ ���ÿ� ������ �ֱ�
		// 2) ���� �̸��� �����ϴ� team�̶�� �迭 5ĭ ����!
		// 2-1) ���� ĭ�� �̸� �����ϱ�
		String[] season = {"��", "����", "����", "�ܿ�"};
		String[] team = new String[5];
		team[0] = "��ȣ��";
		team[1] = "������";
		team[2] = "������";
		team[3] = "�̱�â";
		team[4] = "������";
//		team[5] = "��"; ���ܹ߻�!! 5�� �ε��� ����!
		
		season = team; // �ּҰ� ����!
		
		System.out.println(season[2]);
		// team�� 5ĭ, season�� 4ĭ�ε� �̰� ��� ������??
		team[2] = "Į����"; // ���� �ٲ۰Ŵ� team�ε�
		System.out.println(season[2]);
		// �� season�� �ٲ�?
		
		System.out.println(season[4]);
		// 3) �̰� ��� ��?? 1. ���� 2. ��������.(���� ���ñ�?)
		System.out.println(team[4]);
		

	}

}
