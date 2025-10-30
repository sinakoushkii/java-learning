import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class MusicPlayer {

    public static void playMusic(String filePath) {

        File file = new File(filePath);

        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            Scanner scanner = new Scanner(System.in);
            String response = "";


            while (!(response.equals("Q"))) {
                System.out.println("To Play -> P");
                System.out.println("To Stop -> S");
                System.out.println("To Reset ->R ");
                System.out.println("To Quit -> Q");
                System.out.print("Enter your choice: ");
                response = scanner.nextLine().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        } catch (LineUnavailableException e) {
            System.out.println("unable to access the audio file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("file not supported");
        } catch (IOException e) {
            System.out.println("IO Error");
        } catch (Exception e) {
            System.out.println("something went wrong...");
        }


    }
}
