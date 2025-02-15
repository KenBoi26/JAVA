package WEEK3;

import java.util.Scanner;

// You are using Java
class StringManipulation {
    //type your code here
    public static String insertSubstring(String og, String toInsert, int pos){
        StringBuilder sb = new StringBuilder(og);
        
        sb.insert(pos, toInsert);
        return sb.toString();
    }
}

class StringManipulation1 {
    public static String concatenateUnique(String firstString, String secondString) {
        StringBuilder result = new StringBuilder();

        boolean[] uniqueChars = new boolean[256];
        for (char c : firstString.toCharArray()) {
            if (!uniqueChars[c]) {
                result.append(c);
                uniqueChars[c] = true;
            }
        }
        for (char c : secondString.toCharArray()) {
            if (!uniqueChars[c]) {
                result.append(c);
                uniqueChars[c] = true;
            }
        }

        return result.toString();
    }
}


public class StringBuilderClass {
    
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String originalString = scanner.nextLine();
        String substringToInsert = scanner.nextLine();
        int insertionPosition = scanner.nextInt();
        String result = StringManipulation.insertSubstring(originalString, substringToInsert, insertionPosition);
        System.out.println(result);

        scanner.close();
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String concatenatedString = StringManipulation1.concatenateUnique(firstString, secondString);
        System.out.println(concatenatedString);

        scanner.close();
    }
}
