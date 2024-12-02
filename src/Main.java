public class Main {
    public static void main(String[] args) {
        /**
         * Create letters for words and after that create a word
         */
        Letter[] letters1 = { new Letter('Д'), new Letter('в'), new Letter('а') };
        Letter[] letters2 = { new Letter('п'), new Letter('л'), new Letter('ю'), new Letter('с') };
        Letter[] letters3 = { new Letter('д'), new Letter('в'), new Letter('а') };
        Letter[] letters4 = { new Letter('р'), new Letter('о'), new Letter('в'), new Letter('н'), new Letter('о') };
        Letter[] letters5 = { new Letter('ч'), new Letter('е'), new Letter('т'), new Letter('ы'), new Letter('р'), new Letter('и') };

        Word word1 = new Word(letters1);
        Word word2 = new Word(letters2);
        Word word3 = new Word(letters3);
        Word word4 = new Word(letters4);
        Word word5 = new Word(letters5);
/**
 * Create sentence
 */
        Sentence sentence = new Sentence(new Word[] { word1, word2, word3, word4, word5 }, '.');

/**
 * Create a text and print the text before processing
 */
        Text text = new Text(new Sentence[] { sentence });

        System.out.println("Текст перед обробкою:");
        System.out.println(text);

/**
 * Process the text by removing substring between firstL and lastL
 */
        char firstL = 'п';
        char lastL = 'д';
        text.processText(firstL, lastL);
/**
 * Print the text after processing
 */
        System.out.println("\nТекст після обробки:");
        System.out.println(text);
    }
}
