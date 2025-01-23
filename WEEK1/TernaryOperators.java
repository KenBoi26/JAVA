package WEEK1;
import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int pos = (num1 > 0 && num2 > 0) ? 1 : 0;
        int div = (num1%2 == 0 || num2%2 == 0) ? 0 : 1;
        
        String result = (pos == 1 && div == 1) ? "Both integers are positive and not multiples of 2" : "The condition is not met for both integers";
        
        System.out.println(result);
        
    }
}

