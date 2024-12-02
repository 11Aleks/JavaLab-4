/**
 * Represents a word, which is a collection of letters
 */
public class Word {
    private Letter[] letters;
    /**
     * Constructs a Word from an array of letters
     *
     * @param letters the array of Letter
     */
    public Word(Letter[] letters) {
        this.letters = letters;
    }
    /**
     * Gets the letters that form the word
     *
     * @return the array of Letter
     */
    public Letter[] getLetters() {
        return letters;
    }
    /**
     * Sets the letters that create the word
     *
     * @param letters the new array of Letter
     */
    public void setLetters(Letter[] letters) {
        this.letters = letters;
    }
    /**
     * Returns the string representation of the word
     *
     * @return the word as a string
     */
    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for (Letter letter : letters) {
            word.append(letter.getValue());
        }
        return word.toString();
    }
}

