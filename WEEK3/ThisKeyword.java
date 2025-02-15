package WEEK3;


class PalindromeChecker {
    private int number;
    private boolean isPalindrome;
    {
        number = 0; 
        isPalindrome = false;
    }
    public PalindromeChecker(int number) {
        this.number = number;
        checkPalindrome(); 
    }
    private void checkPalindrome() {
        int originalNumber = number;
        int reversedNumber = 0;

        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        isPalindrome = (number == reversedNumber);
    }
    public void displayPalindromeCheckResult() {
        if (isPalindrome) {
            System.out.println(number+" is a Palindrome");
        } else {
            System.out.println(number+" is not a Palindrome");
        }
    }
}

class IncrementalCounter {
    private int count;

    public IncrementalCounter() {
        count = 0;
    }

    public void increment() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}


public class ThisKeyword {
    
}
