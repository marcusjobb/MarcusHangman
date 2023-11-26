package Jin23Hangman;

import java.util.ArrayList;
import java.util.Random;

public class WordList {
    private ArrayList<String> wordList;
    private String word; // det ord som föreslagits  (slumpmässigt)

    // Konstruktor
    // Skapar en wordList med ett antal ord
    public WordList() {
        wordList = new ArrayList<String>();
        wordList.add("katt");
        // Används IT-relaterade ord
        wordList.add("dator");
        wordList.add("programmering");
        wordList.add("java");
        wordList.add("kod");
        wordList.add("algoritmer");
        wordList.add("databas");
        wordList.add("webb");
        wordList.add("webbsida");
        wordList.add("webbplats");
        wordList.add("webbserver");
        wordList.add("webbläsare");
        wordList.add("webbdesign");
        wordList.add("webbutveckling");
        wordList.add("Systemutveckling");
        wordList.add("Systemarkitektur");
        wordList.add("Systemdesign");
        wordList.add("Diagram");
        wordList.add("UML");
        wordList.add("Klassdiagram");
        wordList.add("UseCase");
        wordList.add("UseCaseDiagram");
    }

    // Slumpar fram ett ord från wordListn
    public String randomWord() {
        Random random = new Random();
        word = wordList.get(random.nextInt(wordList.size()));
        return word;
    }

    // Lägger till ett ord till wordListn
    public void addWord(String word) {
        wordList.add(word);
    }

    // Tar bort ett ord från wordListn
    public void removeWord(String word) {
        wordList.remove(word);
    }

    // Visar nuvarande valda ordet
    public String getword() {
        return word;
    }

}
