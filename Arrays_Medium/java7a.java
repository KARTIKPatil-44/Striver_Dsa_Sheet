import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class java7a {
    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int n = A.size();
        int idx = -1;

        // Step 1: Find the break point:
        for (int i = n - 2; i >=0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                idx = i;
                break;
            }
        }
         
         // If break point does not exist:(Edge Case)
        if (idx == -1) {
            Collections.reverse(A);
            return A;
        }

         // Step 2: Find the next greater element
        //  and swap it with arr[idx]:
        for (int i = n - 1; i > idx; i--) {
            if (A.get(i) > A.get(idx)) {
                int temp = A.get(i);
                A.set(i, A.get(idx));
                A.set(idx, temp);
                break;
            }
        }

           // Step 3: reverse the right half:
        List<Integer> subList = A.subList(idx + 1, n);
        Collections.reverse(subList);
        return A;

    }

    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
        List<Integer> ans = nextGreaterPermutation(A);
        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }

}