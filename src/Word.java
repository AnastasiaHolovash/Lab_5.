public class Word {
    private Letter[] letters;

    public Word(String word){
        letters = new Letter[word.length()];
        for (int i =0; i < word.length(); i++){
            letters[i] = new Letter(word.charAt(i));
        }
        //System.out.println("W  >>  " + word);
        //System.out.println();
    }
}
