package soundsystem;

public class BlankDisc implements CompactDisc {
	private String title;
	private String arstist;

	public BlankDisc(String title, String artist) {
		this.title = title;
		this.arstist = artist;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + arstist);
	}
 }
