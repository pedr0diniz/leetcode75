public class MergeStringsAlternately {

    // Using one char per .append() call made the algorithm run at 0ms.

    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();

        int smallestSize = word2.length();
        String longestWord = word1;
        if (word1.length() < word2.length()) {
            smallestSize = word1.length();
            longestWord = word2;
        }

        for (int i = 0; i < smallestSize; i++) {
            builder.append(word1.charAt(i)).append(word2.charAt(i));
        }

        return builder.append(longestWord.substring(smallestSize)).toString();
    }
}
