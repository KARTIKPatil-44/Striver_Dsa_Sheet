public class java4b {
    // Maximum subArray[Better]
    public static int maxSubarraySum(int arr[], int n) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                // current subarray = arr[i.....j]

                // add the current element arr[j]
                // to the sum i.e. sum of arr[i...j-1]
                sum += arr[j];
                maxi = Math.max(maxi, sum);

            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

}
