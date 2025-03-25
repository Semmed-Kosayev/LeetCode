package N258_Add_Digits;

public class N258 {

    public static void main(String[] args) {
        System.out.println(addDigits(10));
    }

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int result = ((num-1)%9)+1;

        return result;
    }
}
