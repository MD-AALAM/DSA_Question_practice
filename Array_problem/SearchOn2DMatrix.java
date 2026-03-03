import java.util.Scanner;

public class SearchOn2DMatrix {

    // Function to search target in matrix
    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Convert 1D index to 2D index
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            } 
            else if (matrix[row][col] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example matrix (sorted row-wise and first element of each row > last of previous row)
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        System.out.print("Enter target number: ");
        int target = sc.nextInt();

        boolean result = searchMatrix(matrix, target);

        if (result) {
            System.out.println("Target found in matrix ✅");
        } else {
            System.out.println("Target not found in matrix ❌");
        }

        sc.close();
    }
}
