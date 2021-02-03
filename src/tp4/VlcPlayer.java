package tp4;

public class VlcPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}

	}

}
