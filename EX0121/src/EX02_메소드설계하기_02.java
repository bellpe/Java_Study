
public class EX02_메소드설계하기_02 {

	public static void main(String[] args) {
		// 매개변수로 숫자 1개 전달받아서 "양수", "음수", "zero"를 리턴하는 메소드! 설계하고 
		// 3번 호출해보기~~
		String n = n1(1);
		System.out.println(n);

	}
	
	public static String n1(int num) {
		String a = ""; 
	if(num>0) {
		a = "양수";
	}else if(num==0) {
		a = "zero";
	}else {
		a = "음수";
	}
	return a;
	}
			
		
			
		
		
	}


