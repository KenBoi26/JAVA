package WEEK1;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        
        if(side1 != side2 && side3!=side2 && side1!=side3){
            System.out.println("The triangle is scalene");
            if(side1*side1 + side2*side2 == side3*side3){
                System.out.println("The triangle is also right-angled");
            }
        }else if(side1 == side2 && side2==side3){
            System.out.println("The triangle is equilateral");
        }else{
            System.out.println("The triangle is isosceles");
        }

        sc.close();
    }
}
