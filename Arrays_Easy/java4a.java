import java.util.HashSet;

public class java4a {
    // Remove Duplicates in place from sorted Array(Brute Force)
    public static int removeDuplicate(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        //1st pass
        for(int i=0; i<arr.length;  i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x:set){
            arr[j++]= x;
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        System.out.println(removeDuplicate(arr));

    }
    
}
