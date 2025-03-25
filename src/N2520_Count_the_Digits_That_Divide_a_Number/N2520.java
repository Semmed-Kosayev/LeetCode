package N2520_Count_the_Digits_That_Divide_a_Number;

import java.util.HashSet;

public class N2520 {

    public static void main(String[] args) {

    }

    public static int countDigits(int num) {
        HashSet<Integer> objects = new HashSet<>();
        int count = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (num % digit == 0 && !objects.contains(digit)) {
                objects.add(num);
                count++;
            }
            temp = temp / 10;
        }

        return count;
    }
}
