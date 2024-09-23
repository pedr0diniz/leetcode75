import java.util.*;

public class ReverseVowelsOfAString {

    public static String reverseVowels(String s) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder vowelsInWord = new StringBuilder();
        List<Integer> vowelIndexes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            Character curr = s.charAt(i);
            if (vowels.contains(curr)) {
                vowelsInWord.append(curr);
                vowelIndexes.add(i);
            }
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < vowelsInWord.length() / 2; i++) {
            int lastIndex = vowelIndexes.size() - 1 - i;
            char temp = vowelsInWord.charAt(lastIndex);
            sb.replace(vowelIndexes.get(lastIndex), vowelIndexes.get(lastIndex) + 1, String.valueOf(vowelsInWord.charAt(i)));
            sb.replace(vowelIndexes.get(i), vowelIndexes.get(i) + 1, String.valueOf(temp));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
