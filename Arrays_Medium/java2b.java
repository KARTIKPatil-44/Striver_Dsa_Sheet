import java.util.ArrayList;
import java.util.Arrays;

public class java2b {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {             // contitinon 1
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {      // contition 2
                mid++;

            } else {                            // condition 3
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;

            }

        }
    }

    public static void main(String[] args) {
        int n = 11;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 }));
        sortArray(arr, n);
        System.out.println("After Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");

        }
        System.out.println();

    }
}
