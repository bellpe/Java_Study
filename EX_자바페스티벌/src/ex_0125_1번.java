import java.util.Scanner;

public class ex_0125_1�� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"��° �� �Է� : ");
			arr[i] = scan.nextInt();
		}
		for(int j=1; j<arr.length; j++) {
			for(int k=0; k<arr.length-j; k++) {
				if(arr[k]>arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}
			}
		}
		System.out.println("���� ��");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
