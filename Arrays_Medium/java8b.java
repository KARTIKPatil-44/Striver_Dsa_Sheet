import java.util.ArrayList;
// Leaders in an array(Optimal)
public class java8b {
    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi =Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(arr[i] > maxi){
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        ArrayList<Integer> ans = printLeadersBruteForce(arr, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
