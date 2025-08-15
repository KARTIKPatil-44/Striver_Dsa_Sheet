// Program: Find the largest element in an array (Optimal Approach)
public class java1b {

    public static void main(String[] args) {
        
        // Initialize the array
        int arr[] = {3, 2, 1, 5, 2};
        
        // Assume the first element is the largest initially
        int largest = arr[0];
        
        // Loop through the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than 'largest'
            if (arr[i] > largest) {
                // Update 'largest' with the current element
                largest = arr[i];
            }
        }
        
        // Print the largest element found
        System.out.println(largest);
    }
}
