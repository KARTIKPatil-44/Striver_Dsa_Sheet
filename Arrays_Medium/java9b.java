import java.util.Arrays;
public class java9b {

    public static int longestSuccessiveElements(int arr[]) {
        Arrays.sort(arr); // Step 1: Sort the array
        int n = arr.length;

        int longestStreak = 1;       // To store the maximum streak
        int currentStreak = 0;       // Current streak count
        int previousElement = Integer.MIN_VALUE; // Tracks the last valid element

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == previousElement) {
                // If element continues the sequence
                currentStreak += 1;
                previousElement = arr[i];
            } else if (previousElement != arr[i]) {
                // Reset streak if it's a new number (not duplicate)
                currentStreak = 1;
                previousElement = arr[i];
            }
            // Update the longest streak
            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 1, 2, 3, 4 };
        int ans = longestSuccessiveElements(arr);
        System.out.println("The longest consecutive sequence length is " + ans);
    }
}
