public class Word {
    private Letter[] letters;


    public Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
        System.out.println("W  >>  " + word);
        //System.out.println();
    }

    public int Letter_counter(Letter entered_char) {
        //Word entered_char = (Word) entered_char;
        int counter = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(entered_char)) {
                //return false;
                counter++;
            }
            //System.out.println("entered_char = " + entered_char.toString());

        }
        return counter;
    }

}
