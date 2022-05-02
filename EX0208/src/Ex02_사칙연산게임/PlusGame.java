package Ex02_사칙연산게임;

import java.util.Random;

public class PlusGame implements IGame {
	Random rd = new Random();
	int n1 = 0;
	int n2 = 0;

	@Override
	public void makeRandom() {
		n1 = rd.nextInt(1,100);
		n2 = rd.nextInt(1,100);
	}

	@Override
	public String getQuizMSG() {
		
		return  n1 + "+"+ n2 + "=";
	}

	@Override
	public boolean checkAnswer(int answer) {
		if(answer == n1+n2) {
			return true;
		}
		return false;
	}
public class multpleGame implements IGame {
		 Random rd = new Random();
		   int num1 = rd.nextInt();
		   int num2 = rd.nextInt();
		   @Override
		   public void makeRandom() {
		       num1 = rd.nextInt(1,101);
		       num2 = rd.nextInt(1,101);
		   }

		   @Override
		   public String getQuizMSG() {
		      // TODO Auto-generated method stub
		      return num1 +"*"+num2 + "=";
		   }


		   @Override
		   public boolean checkAnswer(int answer) {
		      if(answer == num1 * num2) {
		         return true;
		      }
		      return false;
		      
		   }
	}
public class MiusGame implements IGame{
	Random rd = new Random();
	   int num1 = 0, num2 = 0;

	   @Override
	   public void makeRandom() {
	      num1 = rd.nextInt(1, 101);
	      num2 = rd.nextInt(1, 101);
	   }

	   @Override
	   public String getQuizMSG() {
	      return num1 + " - " + num2 + " = " ;
	   }

	   @Override
	   public boolean checkAnswer(int answer) {
	      if(answer == num1 - num2) {
	         return true;
	      }
	      return false;
	      
	   }
}
public class DivisionGame implements IGame {
	   
	   int n1 = 0;
	   int n2 = 0;

	   @Override
	   public void makeRandom() {
	      Random rd = new Random();
	      n1 = rd.nextInt(1, 101);
	      n2 = rd.nextInt(1, 101);
	   }

	   @Override
	   public String getQuizMSG() {
	      return n1 + " / " + n2 + " = ";
	   }

	   @Override
	   public boolean checkAnswer(int answer) {
	      if (n1 / n2 == answer) {
	         return true;
	      } else {
	         return false;
	      }
	   }
}

}
