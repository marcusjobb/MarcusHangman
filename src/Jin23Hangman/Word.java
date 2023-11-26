package Jin23Hangman;

public class Word {
    private String word;
    private String guess;
    // Konstruktor
    // Tar emot ett ord (den man ska gissa på) och lagrar den i ord
    // därefter skapar den en gissning som är lika lång som ordet
    // och fyller den med streck
    public Word(String word) {
        this.word = word;
        this.guess = "";
        // Loop som fyller gissningen med streck i lika många
        // iterationer som ordet är långt
        for (int i = 0; i < word.length(); i++) {
            guess += "-";
        }
    }

    public String getWord() {
        return word;
    }

    public String getGuess() {
        return guess;
    }

    public boolean matchGuess(char bokstav) {
        return word.contains(Character.toString(bokstav));
    }

    public String displayLetter(char bokstav) {
        String newGuess = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == bokstav) {
                newGuess += bokstav;
            } else {
                newGuess += guess.charAt(i);
            }
        }
        guess = newGuess;
        return guess;
    }

    public boolean hasWon() {
        return guess.equals(word);
    }
}
