package soundsystem;

import org.springframework.stereotype.Component;
import static java.lang.System.*;

@Component
public class SgtPepper implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		out.print("Playing " + title + " by " + artist +"\n");
	}

}
