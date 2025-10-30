import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "pizza";
        int wrongGuesses=0;

        System.out.println("***********************");
        System.out.println("Welcome to Hangman Game");
        System.out.println("***********************");

        ArrayList<Character> wordState=new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordState.add(i,'_');
        }
        while (wrongGuesses<3){
            System.out.println("");
            System.out.println("Wrong Guesses: "+ wrongGuesses);
            System.out.println("----------------------");
            System.out.print("Word :");
            for(Character c:wordState){
                System.out.print(c + " ");
            }
            if(!wordState.contains('_')){
                System.out.println("");
                System.out.println("You Win !");
                break;
            }
            System.out.println();

            System.out.print("Enter a letter :");
            char letter = scanner.next().toLowerCase().charAt(0);


            if(word.indexOf(letter)==-1){
                wrongGuesses++;
            }else {


                for (int i=0;i<word.length();i++){
                  if(word.charAt(i)==letter){
                      wordState.set(i,letter);
                  }
                }

            }

        }
        if(wrongGuesses==3){
            System.out.println("Game Over");
        }
        scanner.close();
    }
}
