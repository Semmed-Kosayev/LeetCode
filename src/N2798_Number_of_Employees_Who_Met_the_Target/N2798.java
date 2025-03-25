package N2798_Number_of_Employees_Who_Met_the_Target;

public class N2798 {

    public static void main(String[] args) {

    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }
}
