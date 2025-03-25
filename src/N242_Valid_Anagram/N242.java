package N242_Valid_Anagram;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class N242 {

    public static void main(String[] args) {
        boolean anagram = isAnagram("anagram", "nagaram");
        System.out.println(anagram);
    }

    public static boolean isAnagram(String s, String t) {
        Map<String, Long> sMap = Arrays.stream(s.split(""))
                .collect(
                        Collectors.groupingBy(
                                str -> str,
                                Collectors.counting()
                        )
                );
        Map<String, Long> tMap = Arrays.stream(t.split(""))
                .collect(
                        Collectors.groupingBy(
                                str -> str,
                                Collectors.counting()
                        )
                );

        return sMap.equals(tMap);
    }
}
