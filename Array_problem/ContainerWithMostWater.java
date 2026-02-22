import java.util.*;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxwater = 0;
        int low = 0;
        int high = height.length - 1;

        while (low < high) {
            int width = high - low;
            int ht;

            if (height[low] < height[high]) {
                ht = height[low];
                low++;
            } else {
                ht = height[high];
                high--;
            }

            int curWater = width * ht;

            if (curWater > maxwater) {
                maxwater = curWater;
            }
        }

        return maxwater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = maxArea(height);
        System.out.println("Maximum Water = " + result);

        sc.close();
    }
}
