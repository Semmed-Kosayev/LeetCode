package N977_Squares_of_a_Sorted_Array;

public class N977 {

    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int leftNum = nums[left];
            int rightNum = nums[right];
            if (Math.abs(leftNum) > Math.abs(rightNum)) {
                res[i] = leftNum*leftNum;
                left++;
            }
            else {
                res[i] = rightNum*rightNum;
                right--;
            }
        }

        return res;
    }
}
