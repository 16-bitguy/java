import java.util.*;

public class fibonacci_recursion {
    public static int memo_fib(int arr[], int n) {
        if (arr[n] != -1)
            return arr[n];
        if (n <= 1)
            return n;
        arr[n] = memo_fib(arr, n - 2) + memo_fib(arr, n - 1);
        return arr[n];
    }

    public static int fib(int n) {
        int arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++)
            arr[i] = -1;
        return memo_fib(arr, n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n=n-1;
        int nthFibonacci = fib(n);
        System.out.println("The " + n + "-th Fibonacci number is: " + nthFibonacci);
        
        // Calculate the sum of all Fibonacci numbers up to the n-th element
        int sum = 0;
        for (int i = 0; i <= n; i++)
            sum += fib(i);
        System.out.println("The sum of Fibonacci numbers up to the " + n + "-th element is: " + sum);
    }
}

  
