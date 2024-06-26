import java.util.Scanner;

public class LongestPalindromicSubsequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Integer[][] dp = new Integer[s.length()][s.length()];
        System.out.println(helper(0, s.length() - 1, s, dp));
    }

    public static int helper(int start, int end, String s, Integer[][] dp) {
        if (start > end)
            return 0;
        if (start == end)
            return 1;
        if (dp[start][end] != null)
            return dp[start][end];
        if (s.charAt(start) == s.charAt(end))
            return dp[start][end] = 2 + helper(start + 1, end - 1, s, dp);
        return dp[start][end] = Math.max(helper(start + 1, end, s, dp), helper(start, end - 1, s, dp));
    }
}
