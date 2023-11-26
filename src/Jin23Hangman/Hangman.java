package Jin23Hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    private WordList wordList;
    private Word word;
    private Player player;
    private ArrayList<Character> guessedLetters;

    public Hangman() {
        wordList = new WordList();
    }

    public void start() {
        System.out.println("Välkommen till spelet Hänga gubbe!");

        Scanner input = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String namn = input.nextLine();
        player = new Player(namn);

        Boolean keepPlaying = true;
        Boolean winner = false;

        while (keepPlaying) {
            guessedLetters = new ArrayList<Character>();
            System.out.println();
            System.out.println("OK " + player.getName()+ "");
            this.word = new Word(wordList.randomWord());
            System.out.println("Du ska gissa på ett ord som består av " + word.getWord().length() + " bokstäver.");
            System.out.println("Lycka till!");
            while (!winner) {
                guess();
                word.displayLetter(letter);
                System.out.println(word.getGuess());

                winner = winnerCheck();
                if (winner) {
                    System.out.println("Grattis! Du gissade rätt!");
                    System.out.println("Ordet var " + word.getWord());
                }
            }
            System.out.println("Vill du spela igen? (j/n)");
            String svar = input.next();

            if (svar.equals("j")) {
                keepPlaying = true;
                winner = false;
            } else {
                keepPlaying = false;
                finishGame();
            }
        }
    }

    Boolean winnerCheck() {
        return word.hasWon();
    }

    private void guess() {
        System.out.println();
        System.out.println(player);
        System.out.println(word.getGuess());
        System.out.println("Gissa på en bokstav:");
        String guess = input.next();
        char letter = guess.charAt(0);
        player.increaseGuesses();

        if (guessedLetters.contains(letter))
        {
            System.out.println("Du har redan gissat på bokstaven " + letter + "! Försök att vara lite mer kreativ");
            return;
        }
        guessedLetters.add(letter);
        if (!word.matchGuess(letter)) {
            System.out.println("Tyvärr, bokstaven " + letter + " finns inte i ordet.");
            return;
        }
        else
        {
            System.out.println("Bra gissat! Bokstaven " + letter + " finns i ordet.");
        }
    }

    private void finishGame() {
        System.out.println("Tack för att du spelade!");
        System.exit(0);
    }
}
