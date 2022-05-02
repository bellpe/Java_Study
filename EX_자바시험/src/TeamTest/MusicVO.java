package TeamTest;

public class MusicVO {
	private String title;
	private String singer;
	private int playTime;
	
	public MusicVO(String title, String singer, int playTime) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getSinger() {
		return this.singer;
	}
	
	

}
