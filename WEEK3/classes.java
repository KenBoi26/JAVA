package WEEK3;
import java.util.Scanner;

class NumberClassifier {
    //type your code here
    int n;
    int[] numbers;
    
    void classifyNumbers(int[] numbers){
        numbers = numbers;
    }
    
    void printEvenNumbers(int[] numbers){
        System.out.printf("Even numbers: ");
        for(int number : numbers){
            if(number%2==0){
                System.out.printf("%d ",number);
            }
        }
        System.out.println();
    }
    
    void printOddNumbers(int[] numbers){
        System.out.printf("Odd numbers: ");
        for(int number : numbers){
            if(number%2!=0){
                System.out.printf("%d ",number);
            }
        }
        System.out.println();
    }
}

// You are using Java
class ArrayConcatenator {
    //Type your code here
    int[] arr;
    
    ArrayConcatenator(int[] arr1, int[] arr2){
        arr = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i:arr1){
            arr[index++] = i;
        }
        
        for(int i:arr2){
            arr[index++] = i;
        }
        
        
    }
    
    void printConcatenatedArray(){
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
    
}



public class classes {
    // You are using Java
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        NumberClassifier obj = new NumberClassifier();
        obj.n = scanner.nextInt();
        int[] arr = new int[obj.n];
        
        for (int i = 0; i < obj.n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        obj.classifyNumbers(arr);
        obj.printEvenNumbers(arr);
        obj.printOddNumbers(arr);

        scanner.close();
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int[] firstArray = new int[size1];
        for (int i = 0; i < size1; i++) {
            firstArray[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int[] secondArray = new int[size2];
        for (int i = 0; i < size2; i++) {
            secondArray[i] = scanner.nextInt();
        }

        ArrayConcatenator arrayConcatenator = new ArrayConcatenator(firstArray, secondArray);

        arrayConcatenator.printConcatenatedArray();
    }
}
