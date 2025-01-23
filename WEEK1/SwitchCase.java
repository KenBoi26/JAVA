package WEEK1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                float inches = sc.nextFloat();
                System.out.printf("%.2f inches is equal to %.2f centimeters.", inches, inches*2.54);
                break;
            case 2:
                float pounds = sc.nextFloat();
                System.out.printf("%.2f pounds is equal to %.2f kilograms.", pounds, pounds*0.453592);
                break;
            case 3:
                float gallons = sc.nextFloat();
                System.out.printf("%.2f gallons is equal to %.2f liters.", gallons, gallons*3.78541);
                break;
        }

        sc.close();
    }
}
