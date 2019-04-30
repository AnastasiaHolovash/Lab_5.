class Sentence extends Main{
    private static final String PUNCTUATION_SYMBOLS = ";:,.!?";
    private String[] string_with_count;
    private SentenceMember[] sentenceMembers;

    public String[] addPunctuation;


    Sentence(String s, Letter entered_char) {
        String[] splitString = s.split("(?=[,.!?])|\\s");

        Word[] words = new Word[splitString.length];
        //Punctuation[] punctuations = new Punctuation[splitString.length];
        sentenceMembers = new SentenceMember[splitString.length];
        addPunctuation = new String[1];

        string_with_count = new String[words.length];

        for (int i = 0; i < splitString.length; i++) {

            if (PUNCTUATION_SYMBOLS.contains(splitString[i])) {
                sentenceMembers[i] = new Punctuation(splitString[i]);
                addPunctuation[0] = splitString[i];
                //punctuations[i] = new Punctuation(splitString[i]);
            } else {
                sentenceMembers[i] = new Word(splitString[i]);
                //words[i] = new Word(splitString[i]);
                //System.out.println(words[i].Letter_counter(entered_char));
                //string_with_count[i] = (words[i].Letter_counter(entered_char) + " : " + splitString[i]);
                string_with_count[i] = (sentenceMembers[i].Letter_counter(entered_char) + " : " + splitString[i]);
            }

        }

    }

    public String[] getList(){
        return string_with_count;
    }

    @Override
    public String toString() {
        String result = "";
        SentenceMember currentSentenceMember;
        for (int i = 0; i < sentenceMembers.length; i++) {
            currentSentenceMember = sentenceMembers[i];
            result += (currentSentenceMember instanceof Word && i != 0 ? " " : "") + sentenceMembers[i].toString();
        }
        return result;
    }


}
