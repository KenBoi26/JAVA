package WEEK1;
import java.util.Scanner;

public class Static {
    public static void ques1(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        String status = sc.nextLine();
        int model = sc.nextInt();
        
        System.out.println("Device Name: "+name);
        System.out.println("Status: "+status);
        System.out.println("Model Number: "+model);
        
        sc.close();
    }

    public static void ques2(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int result = (a + b - c * d / a) % b;
        
        System.out.println("(a + b - c * d / a) % b = "+result);
        
        sc.close();
    }

    public static void ques3(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int total = (n*45) + ((n%k == 0 ? (n/k)-1 : n/k) * 15);
        
        System.out.println(total+" minutes");
        
        sc.close();
    }

    // You are using Java
    public static void ques4(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        
        int x1, y1, x2, y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        
        double distance1, distance2;
        distance1 = Math.sqrt((x1*x1 + y1*y1));
        distance2 = Math.sqrt((x2*x2 + y2*y2));
        
        if(distance1 > distance2){
            System.out.printf("Closer Distance: %.1f%n", distance2);
        }else{
            System.out.printf("Closer Distance: %.1f%n", distance1);
        }
        
        if(x1 == x2){
            System.out.println("Orientation: Vertical");
        }else if(y1 == y2){
            System.out.println("Orientation: Horizontal");
        }else{
            System.out.println("Orientation: Oblique");
        }
        
        sc.close();
    
    }


    // You are using Java
    public static void ques5(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        
        int rent, lease;
        rent = sc.nextInt();
        lease = sc.nextInt();
        
        int total = rent*lease;
        System.out.println("Total Cost: "+total);
        
        if(total <= 1000){
            total = 1;
        }else if(total >=1000 && total <= 5000){
            total = 2;
        }else{
            total = 3;
        }
        
        switch(total){
            case 1:
                System.out.println("Payment Method Suggestion: Payment by cash or check is recommended.");
                break;
            case 2:
                System.out.println("Payment Method Suggestion: Payment by credit card is recommended.");
                break;
            case 3:
                System.out.println("Payment Method Suggestion: Payment by bank transfer is recommended.");
                break;
        }
        sc.close();
    }
}
