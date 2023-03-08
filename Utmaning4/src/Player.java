public class Player {
    private String name;
    private int guesses;
    private int points;
    public Player(String name) {
        this.name = name;
        guesses = 0;
        points = 0;
    }
    public void increaseGuesses() {
        guesses++;
    }
    public void increasePoints() {
        points++;
    }
    public void decreasePoints() { // Lade till att man kunde ta bort points
        points--;
    }

    public String getName() {
        return name;
    }

    public int getGuesses() {
        return guesses;
    }

    public int getPoints() {
        return points;
    }
    public String toString() {
        return name + " har gjort " + guesses + " gissningar";
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }
}
