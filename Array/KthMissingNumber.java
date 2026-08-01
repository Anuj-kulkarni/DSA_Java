public class KthMissingNumber {
    public static int kth(int arr[], int k){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            int missing = arr[mid] - (mid + 1);

            if(missing < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return (low + k);
    }
    public static void main(String[] args) {
        int arr[] = {4, 7, 8};

        System.out.println(kth(arr, 3));


    }
}
