import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[x]) {
                x++;
                nums[x] = nums[i];
            }
        }

        return x + 1;
    }
}

public class RemoveDuplicate {
    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = sol.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
