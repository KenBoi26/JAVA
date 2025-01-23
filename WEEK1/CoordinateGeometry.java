package WEEK1;

import java.util.Scanner;

public class CoordinateGeometry {
    public static void main(String[] args) {
     //Type your code here
    Scanner sc = new Scanner(System.in);
    
    int choice = sc.nextInt();
    float x1, x2, y1, y2;
     
    switch(choice){
        case 1:
            x1 = sc.nextFloat();
            y1 = sc.nextFloat();
            x2 = sc.nextFloat();
            y2 = sc.nextFloat();
            System.out.printf("Slope: %.1f%n", ((y2-y1)/(x2-x1)));
            break;
        case 2:
            x1 = sc.nextFloat();
            y1 = sc.nextFloat();
            x2 = sc.nextFloat();
            y2 = sc.nextFloat();
            System.out.printf("Distance: %.2f%n", Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
            break;
        case 3:
            x1 = sc.nextFloat();
            y1 = sc.nextFloat();
            x2 = sc.nextFloat();
            y2 = sc.nextFloat();
            System.out.printf("Midpoint: (%.1f, %.1f)", (x2+x1)/2, (y2+y1)/2);
            break;
        default:
            System.out.println("Invalid choice. Please select a valid option.");
            break;
    }
 }
}
