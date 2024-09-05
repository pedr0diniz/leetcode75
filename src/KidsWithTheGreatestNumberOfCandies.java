import java.util.ArrayList;
import java.util.List;

// Enhanced for-loop reduced memory usage

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int biggestNumber = Integer.MIN_VALUE;

        for (int candyAmount : candies) {
            if (candyAmount > biggestNumber) {
                biggestNumber = candyAmount;
            }
        }

        List<Boolean> result = new ArrayList<Boolean>();
        for (int candyAmount : candies) {
            if (candyAmount + extraCandies >= biggestNumber) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
