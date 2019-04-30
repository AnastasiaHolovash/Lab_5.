import java.util.ArrayList;
import java.util.Collections;

class Text {

    private Sentence[] sentences;
    private ArrayList big_string_with_count = new ArrayList();

    private Text(String textString, Letter entered_char) {
        System.out.println("==========Original=========");
        System.out.println();
        System.out.println(textString);
        System.out.println();

        String[] splitString = textString.split("(?<=[?!.])");
        sentences = new Sentence[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            sentences[i] = new Sentence(splitString[i], entered_char);

            for(String k: sentences[i].getList()){
                if (k != null) {
                    big_string_with_count.add(k);
                }

            }
        }
        for (Object i: big_string_with_count) {
            //System.out.println(i);
        }
        big_string_with_count.sort(Collections.reverseOrder());
        System.out.println("==========Sorted=========");
        System.out.println();
        for (Object i: big_string_with_count) {
            System.out.println(i);
        }

    }

    static void Answer(String text, Letter entered_char){
        Text enter = new Text(text, entered_char);

    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence sentence : sentences) {
            result += sentence.toString() + " ";
        }
        return result;
    }
}
