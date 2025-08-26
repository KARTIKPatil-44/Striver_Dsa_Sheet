public class java8a {
    // Find the number that appearence once and other twice 
    public static int appearesOnce(int arr[]){
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};
        int result = appearesOnce(arr);
        System.out.print("Element that appeare once is: "+result);
        
    }
    
}
