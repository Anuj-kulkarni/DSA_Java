

public class MinInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int low = 0;
        int high = arr.length - 1;

        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }else{
                high = mid - 1;
                ans = Math.min(ans, arr[mid]);
            }
        }

        System.out.println(ans);
    }
}
