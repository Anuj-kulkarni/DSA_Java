public class Sqrt {
    public static int SquareRoot(int n){
        int low = 1;
        int high = n;

        if(n == 1 || n == 0 || n == 2){
            return n;
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            if((mid * mid) == n){
                return mid;
            }else if((mid * mid) > n){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(SquareRoot(4));
    }
}
