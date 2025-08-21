public class java5a {
    // Left Rotate the array by one place
    public static void leftRotateByonePlace(int arr[]){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,};
        leftRotateByonePlace(arr);

        // print the rotated array
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
