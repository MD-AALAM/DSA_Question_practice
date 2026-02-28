import java.util.*;

public class Solution {

    public static List<String> buildArray(int[] target, int n) {
        List<String> ls = new ArrayList<>();
        int k = 1;

        for (int i = 0; i < target.length; i++) {
            while (k < target[i]) {
                ls.add("Push");
                ls.add("Pop");
                k++;
            }
            ls.add("Push");
            k++;
        }

        return ls;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of target array
        System.out.print("Enter size of target array: ");
        int size = sc.nextInt();

        int[] target = new int[size];

        // Input target elements
        System.out.println("Enter elements of target array:");
        for (int i = 0; i < size; i++) {
            target[i] = sc.nextInt();
        }

        // Input n
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // Call function
        List<String> result = buildArray(target, n);

        // Print result
        System.out.println("Operations:");
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
