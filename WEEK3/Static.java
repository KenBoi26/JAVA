package WEEK3;

import java.util.Scanner;

// You are using Java
class ExpenseAnalyzer {
    //type your code here
    public int calculateMaxRemainingBudget(int[] expenses){
        int n = expenses.length;
        if(n == 1){
            return 0;
        }
        
        int totalSum = 0;
        for(int i : expenses){
            totalSum += i;
        }
        
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;
        
        for(int i=0; i<n; i++){
            currSum += expenses[i];
            
            if(currSum < minSum){
                minSum = currSum;
            }
            
            if(currSum > 0){
                currSum = 0;
            }
        }
        
        int maxSum = totalSum - minSum;
        
        if(totalSum == minSum){
            maxSum = 0;
        }
        
        return maxSum;
    }
}

class StringOps {
    public String manipulate(String... args) {
        if (args.length == 1 && args[0] instanceof String) {
            return new StringBuilder(args[0]).reverse().toString(); 
        } else if (args.length == 2 && args[0] instanceof String && args[1] instanceof String) {
            return args[0] + args[1]; 
        } else {
            return "Invalid input";
        }
    }
}

public class Static {
    // You are using Java
    public static void main1(String[] args) {
        //type your code here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            
        }
        
        for(int i=0; i<size; i++){
            int sumRight = 0;
            for(int j=i+1; j<size; j++){
                sumRight += arr[j];
            }
            
            if(arr[i] > sumRight){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();

    }
    

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] expenses = new int[n];
        for (int i = 0; i < n; i++) {
            expenses[i] = scanner.nextInt();
        }

        ExpenseAnalyzer analyzer = new ExpenseAnalyzer();
        int maxRemainingBudget = analyzer.calculateMaxRemainingBudget(expenses);

        System.out.println(maxRemainingBudget);

        scanner.close();
    }

    public static void main3(String[] args) {
        StringOps seetha = new StringOps();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] input_data = input.split(" ");
        String result = seetha.manipulate(input_data);
        System.out.println(result);

        scanner.close();
    }
}
