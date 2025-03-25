package N387_First_Unique_Character_in_a_String;

import java.util.HashMap;

public class N387 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) return -1;

        HashMap<Character, Integer> map = new HashMap<>();

        char[] st=s.toCharArray();
        for(char c:st){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < st.length; i++) {
            if (map.get(st[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
