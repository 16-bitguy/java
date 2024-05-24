import java.util.Scanner;

public class SubsetSumProblem {

    // Returns true if there is a subset of the given array with the given sum
    public static boolean hasSubsetSum(int[] arr, int n, int sum) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        // Exclude the last element and check if the remaining sum can be achieved
        if (arr[n - 1] > sum) {
            return hasSubsetSum(arr, n - 1, sum);
        }
        // Either include the last element or exclude it
        return hasSubsetSum(arr, n - 1, sum - arr[n - 1]) || hasSubsetSum(arr, n - 1, sum);
    }

    public static void printSubset(int[] arr, int n, int sum) {
        if (sum == 0) {
            return;
        }
        if (n == 0) {
            return;
        }
        // If the last element was included in the subset
        if (hasSubsetSum(arr, n - 1, sum - arr[n - 1])) {
            System.out.print(arr[n - 1] + " ");
            printSubset(arr, n - 1, sum - arr[n - 1]);
        } else {
            // If the last element was excluded
            printSubset(arr, n - 1, sum);
        }
    }


    public static void main(String[] args) {
        int[] arr = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = arr.length;
        if (hasSubsetSum(arr, n, sum)) {
            System.out.println("Subset with sum " + sum + " exists.");
            System.out.print("Elements in the subset: ");
            printSubset(arr, n, sum);
        } else {
            System.out.println("No subset with sum " + sum + " found.");
        }
    }
}
