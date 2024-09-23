import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        List<String> words = new ArrayList<>(
                Arrays.stream(s.trim().split(" "))
                        .map(String::trim)
                        .filter(it -> !it.isBlank())
                        .toList()
        );

        for (int i = 0; i < words.size() / 2; i++) {
            int lastIndex = words.size() - 1 - i;
            String temp = words.get(lastIndex);

            words.set(lastIndex, words.get(i));
            words.set(i, temp);
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("The sky is blue"));
    }
}
