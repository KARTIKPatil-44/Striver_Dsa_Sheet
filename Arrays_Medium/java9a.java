public class java9a {
// Longest Consecutive sequence(Brut Force)
    public static boolean lenearSearch(int arr[], int num) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int longestSuccessiveElements(int arr[]) {
        int n = arr.length;
        int longest = 1;
        // pick a element and search for its
        // consecutive numbers:
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int cnt = 1;
            // search for consecutive numbers
            // using linear search:
            while (lenearSearch(arr, x + 1) == true) {
                x = x + 1;
                cnt = cnt + 1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 1, 2, 3, 4 };
        int ans = longestSuccessiveElements(arr);
        System.out.println("The longest consecutive sequence is " + ans);
    }

}
