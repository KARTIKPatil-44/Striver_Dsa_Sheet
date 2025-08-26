public class java6c {
    // Find a missing number in an array // Opitamal Approch
    // public static int missingNum(int arr[], int n){ using sum method 
    //     int sum1 = (n*(n+1))/2;
    //     int sum2 = 0;
    //     for(int i=0; i<n-1;i++){
    //         sum2 += arr[i];
    //     }
    //     int result = sum1 - sum2;
    //     return result;
    // }


    public static int missingNum(int arr[], int n){
        int xor1 =0;
        int xor2 = 0;
        for(int i=0; i<n-1; i++){
            xor2 = xor2 ^ arr[i];
            xor1  = xor1 ^ (i+1);
        }
        xor1 = xor1 ^n;
        
        return (xor1 ^ xor2);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = 5;
        int ans = missingNum(arr, n);
        System.out.println("The missing number is : "+ans);
        
    }
    
}
