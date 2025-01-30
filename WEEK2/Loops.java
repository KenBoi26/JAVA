package WEEK2;
import java.util.Scanner;
public class Loops {
    // You are using Java



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int sum = 0;
        int dig = 0;
        int og = num;
        
        
        do{
            sum += num%10;
            dig++;
            num/=10;
        }while(num > 0);
        
        if(dig == sum){
            System.out.printf("The number of digits in %d matches the sum of its digits.", og);
        }else{
            System.out.printf("The number of digits in %d does not match the sum of its digits.", og);
        }
    }

}
