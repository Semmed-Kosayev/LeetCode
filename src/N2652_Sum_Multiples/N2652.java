package N2652_Sum_Multiples;

public class N2652 {

    public static void main(String[] args) {

    }

    public static int sumOfMultiples(int n) {
        if (n < 3) return 0;

        int sum = 0;

        for (int i = 3; i <= n; i++) {
            if ((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)) sum += i;
        }

        return sum;
    }
}
