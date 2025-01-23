import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        
        
        int result = (num1+num2+num3+num4+num5)/5;
        
        System.out.println("Average score: "+result);
        
        if(result >= 50){
            System.out.println("The student has passed");
        }else{
            System.out.println("The student has failed");
        }
    }
}
