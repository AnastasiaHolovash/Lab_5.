import java.util.Arrays;

class Word extends SentenceMember{
    public static Letter[] letters;


    Word(String word) {
        //public static Letter[] letters;
        //System.out.println(word);
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
        System.out.println(Arrays.toString(letters));
    }
/*
    int Letter_counter(Letter entered_char) {
        int counter = 0;
        for (Letter letter : letters) {
            if (letter.equals(entered_char)) {
                counter++;
            }

        }
        return counter;
    }
*/
    @Override
    public String toString() {
        String result = "";
        for (Letter letter : letters) {
            result += letter.toString();
        }
        return result;
    }

}
