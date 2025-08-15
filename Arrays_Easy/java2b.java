// Program: Find the second largest element in an array (Better Approach)
public class java2b {
    public static void main(String[] args) {
        
        // Input array
        int arr[] = {1, 2, 4, 7, 7, 5};
        int n = arr.length; // Store the size of the array

        // -------------------------
        // 1st pass: Find the largest element
        // -------------------------
        int largest = arr[0]; // Assume first element is largest
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }

        // -------------------------
        // 2nd pass: Find the second largest element
        // -------------------------
        int slargest = -1; // Initialize second largest to -1 (or Integer.MIN_VALUE)
        for (int i = 0; i < n; i++) {
            // Update slargest if current element is smaller than largest and greater than current slargest
            if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }

        // Print the second largest element
        System.out.println(slargest);
    }
}
