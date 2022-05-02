
public class ex_0126_1¹ø {

	  public static void main(String[] args) {
	      
	      int[][] arr = new int[7][7];
	      int num = 1;
	      for (int i = 0; i < arr.length; i++) {
	         for (int j = 0; j < arr[i].length; j++) {
	            arr[i][j] = 0;
	            if (i == 0 && j == 3) {
	               arr[i][j] = num;
	               num++;
	            }
	            if (i == 1 && (j >= 2 && j <= 4)) {
	               arr[i][j] = num;
	               num++;
	            }
	            if (i == 2 && (j >= 1 && j <= 5)) {
	               arr[i][j] = num;
	               num++;
	            }
	            if (i == 3 && (j >= 0 && j <= 6)) {
	               arr[i][j] = num;
	               num++;
	            }
	            if (i == 4 && (j >= 1 && j <= 5)) {
	               arr[i][j] = num;
	               num++;
	            }
	            if (i == 5 && (j >= 2 && j <= 4)) {
	               arr[i][j] = num;
	               num++;
	            }
	            if (i == 6 && j == 3) {
	               arr[i][j] = num;
	               num++;
	            }
	         }
	      }
	      for (int i = 0; i < arr.length; i++) {
	         for (int j = 0; j < arr[i].length; j++) {
	            System.out.print(arr[i][j] + "\t");
	         }
	         System.out.println();
	      }
	   }
	}
