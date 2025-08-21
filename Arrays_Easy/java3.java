public class java3 {
// Check if arry is soted
    public static boolean sortArray(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i] >= arr[i-1]){

            }
            else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean result = sortArray(arr);
        if(result){
            System.out.println("the array is in sotred");
        }else{
            System.out.println(" the array is not sorted");
        }
    }
}
