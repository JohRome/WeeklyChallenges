import java.util.ArrayList;
import java.util.Random;

class WordList {
    private ArrayList<String> wordList;
    private String word;
    public WordList() {
        wordList = new ArrayList<>();
        wordList.add("hermione");
        wordList.add("harry");
        wordList.add("ron");
        wordList.add("voldermort");
        wordList.add("albus");
        wordList.add("dumbledor");
        wordList.add("snape");
        wordList.add("bellatrix");
    }
    public String randomWord() {
        Random random = new Random();
        word = wordList.get(random.nextInt(wordList.size()));
        return word;
    }
    public void addWord(String word) {
        wordList.add(word);
    }
    public void removeWord(String word) {
        wordList.remove(word);
    }
    public String getword() {
        return word;
    }
}