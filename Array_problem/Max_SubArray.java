import java.util.Scanner;

public class Solution {

    // Function to find maximum subarray sum (Kadane's Algorithm)
    public static int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int cursum = 0;

        for (int i = 0; i < nums.length; i++) {
            cursum += nums[i];

            if (cursum > maxsum) {
                maxsum = cursum;
            }

            // If current sum becomes negative, reset it
            if (cursum < 0) {
                cursum = 0;
            }
        }

        return maxsum;
    }

    // Main method (Program execution starts here)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum is: " + result);

        sc.close();
    }
}
