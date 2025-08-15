// Program: Find the second largest element in an array (Optimal Single-Pass Approach)
public class java2c {
    public static void main(String[] args) {
        
        // Input array
        int arr[] = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        
        // Initialize largest and second largest
        int largest = arr[0];      // Assume first element is largest
        int slargest = -1;         // Initialize second largest to -1 (or Integer.MIN_VALUE)
        
        // Traverse the array starting from index 1
        for (int i = 1; i < n; i++) {
            
            if (arr[i] > largest) {
                // Current element is new largest
                // Old largest becomes second largest
                slargest = largest;
                largest = arr[i];
                
            } else if (arr[i] < largest && arr[i] > slargest) {
                // Current element is smaller than largest but bigger than current second largest
                slargest = arr[i];
            }
        }
        
        // Print the second largest element
        System.out.println(slargest);
    }
}
