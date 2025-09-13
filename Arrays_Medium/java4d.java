public class java4d {
    // Follow up Question of the max Sub array to print only the maxsubarray
    public static int maxSubarraySum(int arr[], int n){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        
        // To track the start and end of the maximum subarray
        int start = 0, end = 0, tempStart = 0;

        for(int i = 0; i < arr.length; i++){
            currsum += arr[i];

            // Update maxsum if we find a new max
            if(currsum > maxsum){
                maxsum = currsum;
                start = tempStart;
                end = i;
            }

            // If currsum becomes negative, reset it and update tempStart
            if(currsum < 0){
                currsum = 0;
                tempStart = i + 1;
            }
        }

        // Print the subarray with the maximum sum
        System.out.print("The subarray with the maximum sum is: ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // To print a newline after the subarray

        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
