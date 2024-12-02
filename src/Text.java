public class Text {
    private Sentence[] sentences;
    /**
     * Constructs a Text from an array of sentences
     *
     * @param sentences the array of Sentence
     */
    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }
    /**
     * Gets the sentences in the text
     *
     * @return the array of Sentence
     */
    public Sentence[] getSentences() {
        return sentences;
    }
    /**
     * Sets the sentences in the text.
     *
     * @param sentences the new array of Sentence objects
     */
    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    /**
     * Processes the text by removing the longest substring
     * that starts with FirstL and ends with LastL in each sentence.
     *
     * @param firstL the starting character for the search
     * @param lastL  the ending character for the search
     */
    public void processText(char firstL, char lastL) {
        for (Sentence sentence : sentences) {
            Word[] words = sentence.getWords();
            StringBuilder sentenceStr = new StringBuilder();
            /**
             * Build the sentence as a string
             */
            for (Word word : words) {
                sentenceStr.append(word.toString()).append(" ");
            }

            String sentenceContent = sentenceStr.toString().trim();
            int startIdx = sentenceContent.indexOf(firstL);
            int endIdx = sentenceContent.lastIndexOf(lastL);
            /**
             * Remove substring between firstL and lastL
             */
            if (startIdx != -1 && endIdx > startIdx) {
                sentenceContent = sentenceContent.substring(0, startIdx) + sentenceContent.substring(endIdx + 1);
            }
            /**
             * Update the sentence with the processed content
             */
            String[] updatedWords = sentenceContent.split("\\s+");
            Word[] newWords = new Word[updatedWords.length];
            for (int i = 0; i < updatedWords.length; i++) {
                Letter[] letters = new Letter[updatedWords[i].length()];
                for (int j = 0; j < updatedWords[i].length(); j++) {
                    letters[j] = new Letter(updatedWords[i].charAt(j));
                }
                newWords[i] = new Word(letters);
            }
            sentence.setWords(newWords);
        }
    }
    /**
     * Returns the string representation of the text
     *
     * @return the text as a string
     */

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Sentence sentence : sentences) {
            text.append(sentence.toString()).append(" ");
        }
        return text.toString().trim();
    }
}

