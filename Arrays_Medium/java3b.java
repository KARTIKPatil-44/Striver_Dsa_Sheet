import java.util.HashMap;
import java.util.Map;

public class java3b {
    // Majority element [ > n/2] times[Better using HashMap]
    public static int majorityElement(int[] arr) {
        int n = arr.length;

        // declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        // searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
