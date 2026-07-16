public class UpperBound {
    public static int UpBound(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5};

        System.out.println(UpBound(arr, 4)); // Output = 4

    }
}
