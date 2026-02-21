import java.util.Scanner;

class Solution {

    public boolean isPalindrome(int x) {
        int temp = x;
        long rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }

        return rev == temp;
    }
}

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Solution obj = new Solution();
        boolean result = obj.isPalindrome(number);

        if (result) {
            System.out.println("The number is a Palindrome.");
        } else {
            System.out.println("The number is NOT a Palindrome.");
        }

        sc.close();
    }
}
