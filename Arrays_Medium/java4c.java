public class java4c {
     // Maximum subArray[Kadans Algorithm]
    public static int maxSubarraySum(int arr[], int n){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currsum = currsum + arr[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    
}
