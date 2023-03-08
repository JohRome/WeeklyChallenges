class Word {
    private String word;
    private String guess;
    public Word(String word) {
        this.word = word;
        this.guess = "";
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
    public boolean matchGuess(char letter) {
        return word.contains(Character.toString(letter));
    }
    public String displayLetter(char letter) {
        StringBuilder newGuess = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                newGuess.append(letter);
            } else {
                newGuess.append(guess.charAt(i));
            }
        }
        guess = newGuess.toString();
        return guess;
    }
    public boolean hasWon() {
        return guess.equals(word);
    }
}