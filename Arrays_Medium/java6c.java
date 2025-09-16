import java.util.ArrayList;

public class java6c {
    // Rearrange array element by Sign( varity 2 where ther is not equal nums of
    // both positive and negative numbers)
    // BruteForce

    public static int[]Rearrange(int arr[]){
        int n =arr.length;
        int ans[] = new int[n];
         ArrayList<Integer> pos =new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
          // separate positive and negative numbers
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);

            }else{
                neg.add(arr[i]);

            }
        }
        // case1 more positive
        if(pos.size() > neg.size()){
            for(int i=0; i<neg.size(); i++){
                ans[2*i] = pos.get(i);
                ans[2*i+1] = neg.get(i);
            }
            // put the remaning positives
            int idx = neg.size()*2;
            for(int i= neg.size(); i<pos.size(); i++){
                ans[idx] = pos.get(i);
                idx++;
            }
        }else{
             //  case2  more negative (or equal)
             for(int i=0; i<pos.size(); i++){
                ans[2*i] = pos.get(i);
                ans[2*i+1] =neg.get(i);
             }
             int idx = pos.size()*2;
             for(int i= pos.size(); i<neg.size(); i++){
                ans[idx] = neg.get(i);
                idx++;

             }

        }

    return ans;
    }
    public static void main(String[] args) {
        int arr[] = { -1,2,3,4,-3,1};
        int ans[] = Rearrange(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }

}
