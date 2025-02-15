package WEEK3;
import java.util.Scanner;

// You are using Java
class Calculator {
    //type your code here
    public int sum(int[] arr){
        int total = 0;
        for(int num:arr){
            total += num;
        }
        
        return total;
    }
    
    public double sum(double[] arr){
        double total = 0;
        for(double num:arr){
            total += num;
        }
        
        return total;
    }
}

// You are using Java
class GeometryCalculator {
    //type your code here
    public double calculateVolume(double side){
        return side*side*side;
    }
    
    public double calculateVolume(double base, double height){
        
        return (base * height)/3.0;
    }
 }
 

public class ConstructorOverloading {
    
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String intInput = scanner.nextLine();
        String[] intStrings = intInput.split(" ");
        int[] intArray = new int[intStrings.length];
        for (int i = 0; i < intStrings.length; i++) {
            intArray[i] = Integer.parseInt(intStrings[i]);
        }
        
        int intSum = calculator.sum(intArray);

        String doubleInput = scanner.nextLine();
        String[] doubleStrings = doubleInput.split(" ");
        double[] doubleArray = new double[doubleStrings.length];
        for (int i = 0; i < doubleStrings.length; i++) {
            doubleArray[i] = Double.parseDouble(doubleStrings[i]);
        }
        double doubleSum = calculator.sum(doubleArray);
        
        System.out.println("Sum of integers: " + intSum);
        System.out.println("Sum of doubles: " + doubleSum);

        scanner.close();
    }

    public static void main2(String[] args) {
        GeometryCalculator calculator = new GeometryCalculator();
        Scanner scanner = new Scanner(System.in);

        int shape = scanner.nextInt();

        if (shape == 1) {
            double sideLength = scanner.nextDouble();
            double cubeVolume = calculator.calculateVolume(sideLength);
            System.out.printf("Volume of the cube: %.2f%n", cubeVolume);
        } 
        
        else if (shape == 2) {
            double baseArea = scanner.nextDouble();
            double height = scanner.nextDouble();
            double pyramidVolume = calculator.calculateVolume(baseArea, height);
            System.out.printf("Volume of the pyramid: %.2f%n", pyramidVolume);
        } 
        
        else {
            System.out.println("Invalid");
        }

        scanner.close();
    }

}
