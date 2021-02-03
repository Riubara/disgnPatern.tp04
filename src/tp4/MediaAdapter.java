package tp4;

public class MediaAdapter implements MediaPlayer {

	private MediaPlayer player;

	public MediaAdapter(String type) {
		
		this.player = new NotDefPlayer();
		
		if (type.toLowerCase().equals("mp3")) {
			this.player = new AudioPlayer();
		}
		if (type.toLowerCase().equals("mp4")) {
			this.player = new Mp4Player();
		}
		if (type.toLowerCase().equals("vlc")) {
			this.player = new VlcPlayer();
		}
	}

	@Override
	public void play(String type, String name) {
		this.player.play(type, name);

	}

}
