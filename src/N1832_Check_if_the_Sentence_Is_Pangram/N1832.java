package N1832_Check_if_the_Sentence_Is_Pangram;

import java.util.HashSet;

public class N1832 {

    public static void main(String[] args) {
        boolean bool = checkIfPangram("leetcode");
        System.out.println(bool);
    }

    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            set.add(c);
        }
        return set.size() == 26;
    }
}
