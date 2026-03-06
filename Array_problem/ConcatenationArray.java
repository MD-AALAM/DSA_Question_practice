import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2 * size];

        for (int i = 0; i < size; i++) {
            ans[i] = nums[i];
        }

        for (int i = 0; i < size; i++) {
            ans[size + i] = nums[i];
        }

        return ans;
    }
}

public class ConcatenationArray {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 3};   // example input

        int[] result = obj.getConcatenation(nums);

        System.out.println("Concatenated Array:");
        System.out.println(Arrays.toString(result));
    }
}
