public class java6b {
    // Find a missing number in an array // Better
    public static int missingNums(int arr[], int n){
    
        // hash array of n +1
        int hash [] = new  int[n+1];

        // storing frequencies
        for(int i=0; i< n -1; i++){
            hash[arr[i]]++;
        }
        // check the frequences for number 1 to n
        for(int i=1; i<n; i++){
            if(hash[i] == 0){
                return i;
            }
        
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = 5;
        int ans = missingNums(arr, n);
        System.out.println("The missing number is : "+ans);
    }
    
}
