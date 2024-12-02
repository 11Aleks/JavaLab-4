/**
 * Represents a single letter
 */
public class Letter {
    private char value;
    /**
     * Constructs a Letter
     *
     * @param value the character value of the letter
     */
    public Letter(char value) {
        this.value = value;
    }
    /**
     * Gets the value of the letter
     *
     * @return the character value
     */
    public char getValue() {
        return value;
    }
    /**
     * Sets the value of the letter
     *
     * @param value the new character value
     */
    public void setValue(char value) {
        this.value = value;
    }
}

