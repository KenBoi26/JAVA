package WEEK3;

import java.util.Scanner;

public class StringClass {
    // You are using Java
    public static void main1(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        
        String inp = sc.nextLine();
        
        int length = inp.length();
        
        System.out.println(length);
        
        sc.close();
        
    }

    // You are using Java
    public static void main2(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        
        String inp = sc.nextLine();
        
        char ch = sc.next().charAt(0);
        
        int firstIndex = inp.indexOf(ch);
        int secondIndex = inp.lastIndexOf(ch);
        
        if(firstIndex == -1){
            System.out.println(ch + " not found in the string");
        }else{
            System.out.println("First occurrence of " + ch + ": " + firstIndex);
            System.out.println("Last occurrence of " + ch + ": " + secondIndex);
        }
        
    }
}
