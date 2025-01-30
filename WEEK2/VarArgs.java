package WEEK2;

public class VarArgs {

    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3: " + sum(1, 2, 3));
        System.out.println("Sum of 4, 5: " + sum(4, 5));
        System.out.println("Sum of 10, 20, 30, 40: " + sum(10, 20, 30, 40));
        System.out.println("Sum with no arguments: " + sum());
    }
}
