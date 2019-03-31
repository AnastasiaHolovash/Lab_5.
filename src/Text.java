import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Text {
    public Sentence[] sentences;
    ArrayList big_string_with_count = new ArrayList();

    public Text(String textString) {
        System.out.println(textString);

        String[] splitString = textString.split("(?<=[?!.])");
        //System.out.println(splitString);
        sentences = new Sentence[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            sentences[i] = new Sentence(splitString[i]);

            for(String k: sentences[i].getList()){
                //System.out.println(k);
                if (k != null) {
                    big_string_with_count.add(k);
                }

            }
            //System.out.println(splitString[i]);
        }
        for (Object i: big_string_with_count) {
            System.out.println(i);
        }
        big_string_with_count.sort(Collections.reverseOrder());
        System.out.println("==========Sorted=========");
        for (Object i: big_string_with_count) {
            System.out.println(i);
        }

    }

    public static void Answer(String text){
        Text enter = new Text(text);

    }

/*
    public ArrayList Answer_2 () {
        ArrayList big_string_with_count = new ArrayList();
        //int pos = 0;
        for (int i = 0; i < sentences.length ; i++) {
            //string_with_count
            for (int j = 0; j < sentences[i].getList().length ; i++){
                big_string_with_count.add(sentences[i].getList()[j]);
            }
            //pos += sentences[i].getList().length;

        }
        for(Object k: big_string_with_count){
            System.out.println(k);
        }
        return big_string_with_count;

    }
*/




    /*
     static void Answer(String text, String entered_char) {
        Text enter = new Text(text);
        Text text = (Text) entered_char;
    }

    static void Answer(String text, char entered_char) {
        Text enter = new Text(text);
        Letter entered_char = new Letter()

    }*/

    //public Sentence[] getSentences(){return sentences;}
}
