import java.util.Scanner;
import java.util.Arrays;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int k = n;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[j];
                j++;
            } else {
                ans[i] = nums[k];
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size n
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = shuffle(nums, n);

        System.out.println("Shuffled Array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
