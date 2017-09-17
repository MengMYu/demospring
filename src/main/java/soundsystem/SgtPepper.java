package soundsystem;
import static java.lang.System.*;
import org.springframework.stereotype.Component;

@Component
public class SgtPepper implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	public void play() {
		out.println("Playing " + title + " by " + artist);
	}

}
