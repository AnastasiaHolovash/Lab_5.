public abstract class SentenceMember {
    int Letter_counter(Letter entered_char) {
        int counter = 0;
        for (Letter letter : Word.letters) {
            if (letter.equals(entered_char)) {
                counter++;
            }

        }
        return counter;
    }

}
