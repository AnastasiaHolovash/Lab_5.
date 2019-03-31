class Sentence extends Main{
    private static final String PUNCTUATION_SYMBOLS = ";:,.!?";
    private String[] string_with_count;

    Sentence(String s, Letter entered_char) {
        String[] splitString = s.split("(?=[,.!?])|\\s");

        Word[] words = new Word[splitString.length];
        Punctuation[] punctuations = new Punctuation[splitString.length];

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
