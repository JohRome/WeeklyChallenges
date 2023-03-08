
import java.util.ArrayList;
import java.util.Scanner;

class Hangman {
    private final WordList wordList;
    private Word word;
    private Player player;
    private ArrayList<Character> guessedLetters;
    private char guessedLetter;
    public Hangman(WordList wordList) {
        this.wordList = wordList;
    }
    public void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("Välkommen till Hänga Gubben spelet - Hogwarts edition!");
        System.out.print("Skriv in vad du heter: ");
        String namn = input.nextLine();
        player = new Player(namn);
        word = new Word(wordList.randomWord());

        boolean keepPlaying = true;
        boolean winner = false;

        while (keepPlaying) {
            guessedLetters = new ArrayList<>();
            System.out.println();
            System.out.println("OK " + player.getName()+ "");
            this.word = new Word(wordList.randomWord());
            System.out.println("Du ska gissa på ett Hogwarts namn på " + word.getWord().length() + " bokstäver.");
            System.out.println("Lycka till!");

            while (!winner) {
                guess();
                word.displayLetter(guessedLetter);

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
                player.setGuesses(0);
                keepPlaying = true;
                winner = false;
            } else {
                keepPlaying = false;
                finishGame();
            }
        }
    }
    private void guess() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println(player);
        System.out.println(word.getGuess());
        System.out.println("Gissa på en bokstav:");
        String guess = input.next();
        guessedLetter = guess.charAt(0);
        player.increaseGuesses();

        if (guessedLetters.contains(guessedLetter))
        {
            System.out.println("Du har redan gissat på bokstaven " + guessedLetter + "! Försök att vara lite mer kreativ");
            player.decreasePoints();
            return;
        }
        guessedLetters.add(guessedLetter);
        if (!word.matchGuess(guessedLetter)) {
            System.out.println("Tyvärr, bokstaven " + guessedLetter + " finns inte i ordet.");
            player.decreasePoints();
            return;
        }
        else
        {
            System.out.println("Bra gissat! Bokstaven " + guessedLetter + " finns i ordet.");
            player.increasePoints();
        }
    }
    private Boolean winnerCheck() {
        return word.hasWon();
    }
    private void finishGame() {
        System.out.println("Tack för att du spelade!");
        System.out.println("Du fick: " + player.getPoints() + " poäng");
        System.exit(0);
    }
}
