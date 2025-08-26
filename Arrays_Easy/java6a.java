public class java6a {
// Find a missing number in an array // Brute Force
public static int  missingNumber (int arr[], int n){
    
    for(int i=1; i<=n; i++){  //1 to 5
        int flag =0;
        for(int j=0; j<n-1; j++){ // 0 to 4
            if(arr[j] == i){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return i;
        }
    }
    return -1;

}
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = 5;
        int ans = missingNumber(arr, n);
        System.out.println("The missing number is : "+ans);
        
    }
}