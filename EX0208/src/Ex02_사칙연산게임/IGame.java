package Ex02_사칙연산게임;

public interface IGame {
	//난수를 만드는 기능. 숫자가 계속 바뀌는
	void makeRandom();
	//퀴즈 메세지를 만드는 기능(3+3=)
	String getQuizMSG();
	//정답을 체크하는 기능
	boolean checkAnswer(int answer);

}
