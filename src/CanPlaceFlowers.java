import java.util.Arrays;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 0, 0};
        canPlaceFlowers(arr, 2);

        System.out.println(Arrays.toString(arr));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) return flowerbed[0] == 0;

        for (int i = 0; i < flowerbed.length; i++) {
            int lastIndex = flowerbed.length - 1;
            if (i == 0) {
                if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                    flowerbed[0] = 1;
                    n--;
                }
            } else if (i == lastIndex) {
                if (flowerbed[lastIndex - 1] == 0 && flowerbed[lastIndex] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }

            if (n == 0) return true;
        }

        return false;
    }
}
