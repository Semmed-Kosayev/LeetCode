package N202_Happy_Number;

import java.util.HashSet;

public class N202 {

    public static void main(String[] args) {
        System.out.println(isHappy(18));
    }

    public static boolean isHappy(int n) {
        HashSet<String> seen = new HashSet<>();
        String numString = String.valueOf(n);

        while (!seen.contains(numString)) {
            seen.add(numString);
            int sum = 0;

            for (int i = 0; i < numString.length(); i++) {
                int digit = Integer.parseInt(numString.charAt(i) + "");
                sum += digit*digit;
            }

            if (sum == 1) {
                return true;
            }

            numString = Integer.toString(sum);
        }

        return false;
    }
}
