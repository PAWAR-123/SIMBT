
import java.util.Scanner;

public class Hangman {
    private static String[] words = {"vikas ", "balu", "amol", "rittu", "anjana"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Guess a letter:");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newAsterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newAsterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newAsterisk += word.charAt(i);
            } else {
                newAsterisk += "*";
            }
        }

        if (asterisk.equals(newAsterisk)) {
            count++;
            drawHangman();
        } else {
            asterisk = newAsterisk;
        }

        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void drawHangman() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
        } else if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println();
        } else if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println();
        } else if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println();
        } else if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println();
        } else if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println();
        } else if (count == 7) {
            System.out.println("Sorry, you lose! The word was " + word);
        }
    }
}
