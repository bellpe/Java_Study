package 인공지능_박준형;
import java.util.Scanner;

public class Question2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		int k = 1;
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		for (int i =0; i< arr.length; i++) {
			for (int j = 0; j <arr[0].length; j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}

	}

}
