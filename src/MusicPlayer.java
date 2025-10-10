import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {

    public static void playMusic(String filePath){

        File file = new File(filePath);
        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch (LineUnavailableException e) {
            System.out.println("unable to access the audio file");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("file not supported");
        }
        catch (IOException e) {
            System.out.println("IO Error");
        }
        catch (Exception e){
            System.out.println("something went wrong...");
        }


    }
}
