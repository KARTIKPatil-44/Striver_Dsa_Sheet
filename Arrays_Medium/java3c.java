public class java3c {
    // Majority element [ > n/2] times[Optimal using Moose Voting Algo]
    public static int majorityElement(int arr[]) {
        int n = arr.length;
        int cnt = 0;
        int el = 0;

        // Moose voting algorithm
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        // checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) {
                cnt1++;
            }
            if (cnt1 > (n / 2)) {
                return el;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

}
