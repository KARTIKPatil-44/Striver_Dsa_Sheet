public class java7a {
    
    // Maximum consecutive once (Optimal )
    public static int maxConsecutive(int arr[]){
        int maxi = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                maxi = Math.max(maxi, count);
            }else {
                count = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        int result = maxConsecutive(arr);
        System.out.println("The maximum consecutive number is: "+result);
        
    }
}  