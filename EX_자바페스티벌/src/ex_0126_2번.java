import java.util.Scanner;

public class ex_0126_2번 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 N입력 >> ");
		int N =scan.nextInt();
		int[][] arr = new int[N][N];
		int cnt=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=cnt;
				cnt++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				if(i%2==1) {
					System.out.print(arr[i][4-j]+"\t");
				}else {
					System.out.print(arr[i][j]+"\t");
				}
			}
			System.out.println();
		}

	}

}
