public class Java1a {
    // Tow sum
    // Varient 1 whihc returns YES OR NO
    public static String varientOne(int arr[], int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                    return "YES";
            }
        }
        return "No";

    }

    // Varient 2 which returns [idx, idx] or [-1,-1];
    public static int[] varientTow(int arr[], int n, int target) {

        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }

            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 14;
        String ans1 = varientOne(arr, n, target);
        System.out.println("The answer of the varient 1: " + ans1);
        int[] ans2 = varientTow(arr, n, target);
        System.out.println("The answer of the  variant 2: [" + ans2[0] + ", " + ans2[1] + "]");

    }

}
