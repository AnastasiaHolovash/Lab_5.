public class Sentence {
    private static final String PUNCTUATION_SYMBOLS = ";:,.!?";
    private Word [] words;
    private Punctuation [] punctuations;
    Letter entered_char = new Letter('l');
    private String[] string_with_count;


    public Sentence(String s) {
        String[] splitString = s.split("(?=,|\\.|!|\\?)|\\s");

        words = new Word[splitString.length];
        punctuations = new Punctuation[splitString.length];

        string_with_count = new String[words.length];

        for (int i = 0; i < splitString.length; i++) {
            //System.out.println(splitString[i]);
           // words[i] = new Word(splitString[i]);

            if (PUNCTUATION_SYMBOLS.contains(splitString[i])) {
                punctuations[i] = new Punctuation(splitString[i]);
                //System.out.println(splitString[i]);
            } else {
                words[i] = new Word(splitString[i]);
                System.out.println(words[i].Letter_counter(entered_char));
                string_with_count[i] = (words[i].Letter_counter(entered_char) + " : " + splitString[i]);
            }

        }

    }

    public String[] getList(){
        return string_with_count;
    }


}
