
public class ex_0125_3¹ø {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int k=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=k;
				k++;
			}
		}
		for(int i=arr.length-1; i>=0; i--) {
			for(int j=arr[0].length-1; j>=0; j--) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
