import java.util.ArrayList;

public class java6a{
    // Rearrange array element by Sign( varity 1  where ther are equal nums of both positive and negative numbers)
    // BruteForce

    public static int[] Rearrange(int arr[]){
        ArrayList<Integer> pos =new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n =arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }

        for(int i=0; i<n/2; i++){
            arr[2*i]= pos.get(i);
            arr[2*i+1] = neg.get(i);

        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int ans[] = Rearrange(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i]+" " );
        }
    }
}