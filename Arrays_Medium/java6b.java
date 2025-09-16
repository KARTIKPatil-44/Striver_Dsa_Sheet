public class java6b {
    // Rearrange array element by Sign( varity 1  where ther are equal nums of both positive and negative numbers)
    // Better
    public static int[]  Rearrange(int arr[]){
        int n = arr.length;
        int ans [] = new int[n];
        int posIdx = 0;
        int negIdx = 1;

        for(int i=0; i<n; i++){
            if(arr[i] >0){
                ans[posIdx] = arr[i];
                posIdx +=2;
            }else{
                ans[negIdx] =arr[i];
                negIdx +=2;
            }
        }
        return ans;
    }
 public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int ans[] = Rearrange(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i]+" " );
        }
    }  
}
