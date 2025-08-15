import java.util.*;

// Program: Find the second largest element in an array (Brute Force Approach)
public class java2a {
    public static void main(String[] args) {
        
        // Input array
        int arr[] = {1, 2, 4, 7, 7, 5};
        int n = arr.length; // Store the size of the array
        
        // Step 1: Sort the array in ascending order
        Arrays.sort(arr); // Example after sorting: [1, 2, 4, 5, 7, 7]
        
        // Step 2: The last element is the largest element
        int largest = arr[n - 1];
        
        // Step 3: Traverse backwards from the second last element
        // to find the first element smaller than 'largest'
        int i;
        for (i = n - 2; i >= 0; i--) { // Fixed >= so index 0 is checked
            if (arr[i] != largest) {
                break; // Found the second largest
            }
        }
        
        // Step 4: Print the second largest element
        System.out.println(arr[i]);
    }
}
