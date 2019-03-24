import java.util.Arrays;

public class Sentence {
    private static final String PUNCTUATION_SYMBOLS = ";:,.!?";
    private Word [] words;
    private Punctuation [] punctuations;

    public Sentence(String s) {
        String[] splitString = s.split("(?=,|\\.|!|\\?)|\\s");
        //int numberOfSymbols = 0;

        //System.out.println(Arrays.toString(splitString));
/*
        for (int i = 0; i < splitString.length; i++) {
            if (PUNCTUATION_SYMBOLS.contains(splitString[i])) {
                numberOfSymbols ++;
            }
        }
        System.out.println(numberOfSymbols);
        System.out.println(splitString.length);
        System.out.println(splitString.length-numberOfSymbols);
        int numberOfWords = splitString.length-numberOfSymbols;

        words = new Word[numberOfWords];
        punctuations = new Punctuation[numberOfSymbols];
*/
        words = new Word[splitString.length];
        punctuations = new Punctuation[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            //System.out.println(splitString[i]);
           // words[i] = new Word(splitString[i]);

            if (PUNCTUATION_SYMBOLS.contains(splitString[i])) {
                punctuations[i] = new Punctuation(splitString[i]);
                //System.out.println(splitString[i]);
            } else {
                words[i] = new Word(splitString[i]);
                //System.out.println(splitString[i]);

            }

        }
    }
}
