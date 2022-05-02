import java.util.Scanner;

public class ex_0126_3¹ø {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[5][5];
		int cnt=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = cnt;
				cnt++;
			}
		}
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}

	}

}
