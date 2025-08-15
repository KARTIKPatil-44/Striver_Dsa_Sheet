import java.util.*;
// argest_element_in_array_BruteForce
public class java1a {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 2};

        // Step 1: Sort array
        Arrays.sort(arr);

        // Step 2: Print last element (largest number)
        System.out.println(arr[arr.length - 1]);
    }
}
