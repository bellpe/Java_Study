import java.util.Scanner;

public class EX03_������������� {

	public static void main(String[] args) {
		
		
		// ���� �Է� �޾Ƽ� �����
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
//		for(int i=1; i<=num; i++) {
//			 // System.out.println("*");
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		// �� �Ųٷ� ���
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 

	}

}
