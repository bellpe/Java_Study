import java.util.Scanner;

public class ex_0124_2�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] ar = new int[5];
		for(int i=0; i<ar.length; i++) {
			System.out.print(i+1+"��° �� �Է� : ");
			ar[i] = scan.nextInt();
		}
		for(int j=0; j<ar.length-1; j++) {
			int minIndex = j;
			for(int i=j+1; i<ar.length; i++) {
				if(ar[minIndex]> ar[i]) {
					minIndex = i;
				}
			}
			int temp = ar[minIndex];
			ar[minIndex] = ar[j];
			ar[j] = temp;
		}
		System.out.println("���� ��");
		for(int i = 0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
