public class PeakElement {
    public static int Peak(int arr[]){
        int n = arr.length;

        int low = 0;
        int high = n-1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(n == 1){
                return 0;
            }

            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] < arr[mid+1]){
                low = mid +1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        System.out.println(Peak(arr));
    }
}
