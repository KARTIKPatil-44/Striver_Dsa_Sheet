import java.util.HashMap;

public class java1b {
    // Tow sum Better
    // Varient one which returns YES or NO
    public static String varientOne(int arr[], int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int nums = arr[i];
            int morenum = target - nums;
            if (map.containsKey(morenum)) {
                return "YES";
            }
            map.put(arr[i], i);
        }

        return "NO";
    }

    // Varient two which returns [idx, idx] or [-1,-1] 
    // for Varient two this is only the optiomal approch
    public static int[] varientTwo(int arr[], int n, int target) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int nums = arr[i];
            int morenum = target - nums;
            if (map.containsKey(morenum)) {
                ans[0] = map.get(morenum);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 14;
        String ans1 = varientOne(arr, n, target);
        System.out.println("The answer of the varient 1:" + ans1);
        int[] ans2 = varientTwo(arr, n, target);
        System.out.println("The answer of the  variant 2: [" + ans2[0] + ", " + ans2[1] + "]");

    }
}
