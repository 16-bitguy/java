import java.util.Scanner;
public class LongestCommonSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		Integer[][] dp = new Integer[str1.length()][str2.length()];
		System.out.println(helper(0, 0, str1, str2, dp));
	}
	public static int helper(int i, int j, String str1, String str2, Integer[][] dp) {
		if (i == str1.length() || j == str2.length())
			return 0;
		if (dp[i][j] != null)
			return dp[i][j];
		if (str1.charAt(i) == str2.charAt(j))
			return 1 + helper(i + 1, j + 1, str1, str2, dp);
		int first = helper(i + 1, j, str1, str2, dp);
		int second = helper(i, j + 1, str1, str2, dp);
		int answer = Math.max(first, second);
		dp[i][j] = answer;
		return answer;}}
