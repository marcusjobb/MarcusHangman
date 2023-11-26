package Jin23Hangman;

class Player {
    private String name;
    private int guesses;
    private int points;

    public Player(String name) {
        this.name = name;
        guesses = 0;
        points = 0;
    }

    public String getName() {
        return name;
    }

    // Returnera antalet gissningar spelaren har gjort
    public int getGuesses() {
        return guesses;
    }

    public int getScore() {
        return points;
    }

    public void increaseGuesses() {
        guesses++;
    }

    public void increasePoints() {
        points++;
    }

    public String toString () {
        return name + " har " + points + " poäng och har gissat " + guesses + " gånger.";
    }
}