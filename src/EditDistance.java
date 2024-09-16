public class EditDistance {

    public static int minDistance(String word1, String word2) {
        // Have a row and column for blank characteres
        // If characteres are equal, copy the value of the upper-left diagonal cell
        // If characteres are not equal, get the minimum between left, upper or upper-left cells and add 1 to it

        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        // fill the first column
        for (int i = 1; i <= word1.length(); i++) {
            dp[i][0] = i;
        }

        // fill the first row
        for (int i = 1; i <= word2.length(); i++) {
            dp[0][i] = i;
        }

        // traverse the dp grid
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                    continue;
                }

                dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
            }
        }

        return dp[word1.length()][word2.length()];
    }
}
