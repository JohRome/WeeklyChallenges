public class Main {
    public static void main(String[] args) {
        Hangman hangman = new Hangman(new WordList());
        hangman.start();
    }
}
