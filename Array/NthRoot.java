
public class NthRoot {

    public static long power(int mid, int n){
        long ans = 1;
        while(n > 0){
            if(n % 2 == 1){
                ans = ans * mid;
                n = n - 1;
            }else{
                mid = mid * mid;
                n = n/2;
            }
        }
        return ans;
    }

    public static int root(int n, int m){
        if(n == 0 || n == 1){
            return n;
        }

        int low = 2;
        int high = n;

        while(low <= high){
            int mid = low + (high - low)/2;
            long midN = power(mid, n);
            if(power(mid, n) == m){
                return mid;
            }else if(midN < m){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(root(2, 4));
    }
}
