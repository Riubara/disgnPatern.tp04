package tp4;

public class NotDefPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		System.out.println("Invalid media " + audioType + " format not supported");

	}

}
