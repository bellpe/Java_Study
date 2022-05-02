
public class EX03_이중포문구구단 {

	public static void main(String[] args) {
		// 이중포문을 사용해서 2단 ~9단까지 출력하기
		for(int i=1; i<=9; i++) {
			//System.out.print("=="+i+"단"+"==");
			
			// 안에 있는 for문
			for(int j = 2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
		
		
		
			
		

	}

}
