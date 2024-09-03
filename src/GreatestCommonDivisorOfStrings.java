public class GreatestCommonDivisorOfStrings {
//    public static String gcdOfStrings(String str1, String str2) {
//        String largestString = str1;
//        String smallestString = str2;
//
//        if (str1.length() < str2.length()) {
//            largestString = str2;
//            smallestString = str1;
//        }
//
//        String output = "";
//        for (int i = 0; i < smallestString.length(); i++) {
//            int currSize = i + 1;
//            String currSubstring = smallestString.substring(0, currSize);
//            boolean shouldAppend = true;
//
//            if (!largestString.contains(currSubstring) ||
//                    (largestString.length() % currSize != 0) ||
//                    (smallestString.length() % currSize != 0)) {
//                continue;
//            }
//
//            for (int j = 0; j < largestString.length(); j += currSize) {
//                if (!largestString.substring(j, j + currSize).equals(currSubstring) ||
//                        ((j + currSize <= smallestString.length()) &&
//                                !smallestString.substring(j, j + currSize).equals(currSubstring))) {
//                    shouldAppend = false;
//                    break;
//                }
//            }
//
//            if (shouldAppend) output = currSubstring;
//        }
//
//        return output;
//    }

    // CODE ABOVE WAS ACHIEVED AFTER MY FIRST TRY
    // CODE BELOW JUST CHECKS IF CONCATENATION ORDER AFFECTS THE STRINGS AND THEN
        // CALCULATES GCD AND JUST GETS THE SUBSTRING OF ITS SIZE AFTERWARDS
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int gcd = 0;
        if (str1.length() > str2.length()) gcd = getGcd(str1.length(), str2.length());
        else gcd = getGcd(str2.length(), str1.length());

        return str1.substring(0, gcd);
    }

    public static int getGcd(int a, int b) {
        if (a % b == 0) return b;
        if (a > b) return getGcd(b, a % b);
        return getGcd(a, b % a);
    }


    public static void main(String[] args) {
        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        System.out.println(gcdOfStrings("AAAAAAAAA", "AAACCC"));
    }
}
