package N2114_Maximum_Number_of_Words_Found_in_Sentences;

public class N2114 {

    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]
                {"please wait", "continue to fight", "continue to win"}));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int length = sentence.split(" ").length;
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
