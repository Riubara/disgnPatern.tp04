package tp4;

public class Mp4Player implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp4")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}

	}

}
