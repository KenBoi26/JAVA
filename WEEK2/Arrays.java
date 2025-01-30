package WEEK2;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean found = false;
        int foundElement = -1;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j] && !found){
                    found = true;
                    foundElement = arr[i];
                }
            }
        }
        
        if(found){
            System.out.printf("%d", foundElement);
        }else{
            System.out.println("No repeated element found in the array");
        }
        
        
        sc.close();
        
    }
}
