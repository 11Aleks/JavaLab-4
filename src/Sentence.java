/**
 * Shows a sentence, which is a collection of words followed by a separator.
 */
public class Sentence {
    private Word[] words;
    private char separator;
    /**
     * Constructs a Sentence from an array of words and a separator
     *
     * @param words     the array
     * @param separator the punctuation mark
     */
    public Sentence(Word[] words, char separator) {
        this.words = words;
        this.separator = separator;
    }
    /**
     * Gets the words in the sentence
     *
     * @return the array of Word
     */
    public Word[] getWords() {
        return words;
    }
    /**
     * Sets the words in the sentence
     *
     * @param words the new array of Word
     */
    public void setWords(Word[] words) {
        this.words = words;
    }
    /**
     * Gets the separator of the sentence
     *
     * @return the separator character
     */
    public char getSeparator() {
        return separator;
    }
    /**
     * Sets the separator of the sentence
     *
     * @param separator the new separator character
     */
    public void setSeparator(char separator) {
        this.separator = separator;
    }
    /**
     * Returns the string representation of the sentence
     *
     * @return the sentence as a string
     */
    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        for (Word word : words) {
            sentence.append(word.toString()).append(" ");
        }
        sentence.append(separator);
        return sentence.toString();
    }
}

