import java.lang.reflect.Array;

public class Text {
    public Sentence[] sentences;

    public Text(String textString) {
        System.out.println(textString);
        String[] splitString = textString.split("(?<=[?!.])");
        //System.out.println(splitString);
        sentences = new Sentence[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            sentences[i] = new Sentence(splitString[i]);
            //System.out.println(splitString[i]);
        }
    }
    //public Sentence[] getSentences(){return sentences;}
}
