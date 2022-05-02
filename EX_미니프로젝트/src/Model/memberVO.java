package Model;

public class memberVO {
	private String id;
	  
	  private String pw;
	  
	  private int score;
	  
	  private int draw;
	  
	  private int streak;
	  
	  public memberVO(String id, String pw, int score, int draw, int streak) {
	    this.id = id;
	    this.pw = pw;
	    this.score = score;
	    this.draw = draw;
	    this.streak = streak;
	  }
	  
	  public String getId() {
	    return this.id;
	  }
	  
	  public void setId(String id) {
	    this.id = id;
	  }
	  
	  public String getPw() {
	    return this.pw;
	  }
	  
	  public void setPw(String pw) {
	    this.pw = pw;
	  }
	  
	  public int getScore() {
	    return this.score;
	  }
	  
	  public void setScore(int score) {
	    this.score = score;
	  }
	  
	  public int getDraw() {
	    return this.draw;
	  }
	  
	  public void setDraw(int draw) {
	    this.draw = draw;
	  }
	  
	  public int getStreak() {
	    return this.streak;
	  }
	  
	  public void setStreak(int streak) {
	    this.streak = streak;
	  }

}
