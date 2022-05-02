import PJH.Number;

public class Ex02_메소드_사용자정의클래스_사용하기 {

	public static void main(String[] args) {
		Number nb = new Number();
		
		 boolean result = nb.isDivisor(10, 3);
		 System.out.println(result);
		 
		 String result2 = nb.getDivisors(50);
		 System.out.println(result2);
		 
		 boolean result3 = nb.isPrimeNumber(17);
		 System.out.println(result3);

	}

}
