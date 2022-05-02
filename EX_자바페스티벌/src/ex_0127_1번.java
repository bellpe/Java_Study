
public class ex_0127_1¹ø {

	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		char k = 'A';
		int n=0;
		for(int i=0, l=arr.length; i<arr.length/2+1; i++, l-=2 ) {
			int m = 0;
			for(int j=0; j<i; j++) {
				arr[n][m] = ' ';
				m++;
			}
			for(int j=0; j<l; j++) {
				arr[n][m] = k;
				k++;
				m++;
			}
			for(int j=0; j<i; j++) {
				m++;
			}
			n++;
		}
		for(int i=0, l=3; i<arr.length/2; i++, l+=2) {
			int m =0;
			for(int j=0; j<arr.length/2-1-i; j++) {
				arr[n][m] = ' ';
				m++;
			}
			for(int j=0; j<l; j++) {
				arr[n][m]=k;
				k++;
				m++;
			}
			for(int j=0; j<arr.length/2-1-i; j++) {
				arr[n][m] = ' ';
				m++;
			}
			n++;
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
