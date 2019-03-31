import java.util.ArrayList;
import java.util.Collections;

class Text {

    private ArrayList big_string_with_count = new ArrayList();
    private char myChar;

    private Text(String textString, Letter entered_char) {
        System.out.println(textString);

        String[] splitString = textString.split("(?<=[?!.])");
        //System.out.println(splitString);
        Sentence[] sentences = new Sentence[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            sentences[i] = new Sentence(splitString[i], entered_char);

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

    static void Answer(String text, Letter entered_char){
        Text enter = new Text(text, entered_char);

    }
}
