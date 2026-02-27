import java.util.*;

public class Solution {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        // Mark visited numbers as negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
        // Find missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (numbers between 1 and " + n + "):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> missingNumbers = findDisappearedNumbers(nums);

        System.out.println("Missing numbers are:");
        System.out.println(missingNumbers);

        sc.close();
    }
}
