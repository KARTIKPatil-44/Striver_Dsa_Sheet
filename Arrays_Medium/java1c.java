import java.util.Arrays;

public class java1c {

    public static String varientOne(int arr[], int n, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) {
                left++; // move left forward to increase sum
            } else {
                right--; // move right backward to decrease sum
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 2, 6, 5, 8, 11 };
        int target = 15;
        String ans = varientOne(arr, n, target);
        System.out.println("The answer of the varient 1:"+ ans);



    }

}
