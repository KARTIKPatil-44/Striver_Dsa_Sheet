import java.util.ArrayList;
import java.util.Arrays;
// Sort an array of 0s, 1s and 2s [Better Approch]
public class java2a {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int cunt0 = 0, cunt1 = 0, cunt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0)
                cunt0++;
            else if (arr.get(i) == 1)
                cunt1++;
            else
                cunt2++;
        }

        // Replacing the places in the original array
        for (int i = 0; i < cunt0; i++)
            arr.set(i, 0); // replacing 0s
        for (int i = cunt0; i < cunt0 + cunt1; i++)
            arr.set(i, 1); // replacing 1s
        for (int i = cunt0 + cunt1; i < n; i++)
            arr.set(i, 2); // replacing 2s

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
