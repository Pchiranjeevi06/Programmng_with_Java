package BB1;
public class coding{
    // Function to BASIC.count possible decodings
    public static int countDecodings(String digits) {
        int n = digits.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // Check if the current digit is a valid single-digit number
            if (digits.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }

            // Check if the current and previous digit form a valid double-digit number
            if (digits.charAt(i - 2) == '1' || (digits.charAt(i - 2) == '2' && digits.charAt(i - 1) <= '6')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String digits = "2742";
        int possibleDecodings = countDecodings(digits);
        System.out.println("Number of possible decodings: " + possibleDecodings);
    }
}