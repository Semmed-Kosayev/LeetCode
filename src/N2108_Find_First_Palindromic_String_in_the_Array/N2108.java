package N2108_Find_First_Palindromic_String_in_the_Array;

public class N2108 {

    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }

    public static String firstPalindrome(String[] words) {
        String result = "";
        for (String word : words) {
            int left = 0, right = word.length() - 1;
            char[] charArr = word.toCharArray();
            boolean isPalindrome = true;
            while (left < right) {
                if (charArr[left] != charArr[right]) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if (isPalindrome) {
                result = word;
                break;
            }
        }
        return result;
    }
}
