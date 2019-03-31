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
}
