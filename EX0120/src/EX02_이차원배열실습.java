
public class EX02_�������迭�ǽ� {

	public static void main(String[] args) {
		
		String[] kor = {"��", "��"};
		String[] eng = {"A", "B"};
		String[] num = {"3", "4"};
		
		String[][] str = {kor, eng, num};
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				System.out.print(str[i][j]+"");
			}
			System.out.println();
		}

	}

}
