public class java5b {
    // Left Rotate the array by D place
    public static void Reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotation(int arr[], int n, int d) {
           d = d % n;  
        Reverse(arr, 0, d - 1);
        Reverse(arr, d, n - 1);
        Reverse(arr, 0, n - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        int d = 3;
        leftRotation(arr, n, d);
        System.out.print("Array after Rotationg: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

}
