
package WEEK1;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if(year % 4 == 0){
            if(year%100 != 0 || year%400 == 0){
                System.out.println(year+" is a Leap Year");
            }else{
                System.out.println(year+" is not a Leap Year");
            }
        }else{
            System.out.println(year+" is not a Leap Year");
        }
    }
}
