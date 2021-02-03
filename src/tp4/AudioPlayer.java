package tp4;

public class AudioPlayer implements MediaPlayer {
	
	private MediaAdapter adapteur;

  public void play(String audioType, String fileName) {

    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing mp3 file. Name: " + fileName);
    }
    else {
    	adapteur = new MediaAdapter(audioType);
    	adapteur.play(audioType, fileName);
    }
    
  }
}
