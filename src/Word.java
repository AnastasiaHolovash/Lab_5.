class Word {
    private Letter[] letters;


    Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }

    int Letter_counter(Letter entered_char) {
        int counter = 0;
        for (Letter letter : letters) {
            if (letter.equals(entered_char)) {
                counter++;
            }

        }
        return counter;
    }

}
