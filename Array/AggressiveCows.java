import java.util.*;

public class AggressiveCows {
    public static boolean canWePlace(int arr[], int dist, int cows){
        int count_cows = 1, last = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] - last >= dist){
                count_cows ++;
                last = arr[i];
            }
            if(count_cows >= cows){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {0, 3, 4, 7, 10, 9};

        Arrays.sort(arr);
        int k = 4;
        int low = 1;
        int n = arr.length;
        int high = arr[n-1] - arr[0];

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canWePlace(arr, mid, k) == true){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        int ans = high;

        System.out.println(ans);
    }
}
