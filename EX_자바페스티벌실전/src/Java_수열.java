import java.util.Scanner;

public class Java_���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n �Է� : ");
	    int num = sc.nextInt();
	    int sum = 1;
	    
	    for(int i = 1; i<=num; i++) {
	    System.out.print(sum+" ");
	    sum+=i;
	    }

	}

}
