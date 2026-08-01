public class Days {

    public static int Day(int wt[], int capacity){
        int days = 0;
        int load = 0;
        for(int i=0; i<wt.length; i++){
            if(load + wt[i] > capacity){
                days ++;
                load = wt[i];
            }else{
                load += wt[i];
            }
        }
        return days +1;
    }
    public static void main(String[] args) {
        int wt[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = 0;
        int d = 5;

        for(int i=0; i<wt.length; i++){
            max = Math.max(max, wt[i]);
        }

        int high = 0;
        for(int i=0; i<wt.length; i++){
            high += wt[i]; 
        }
        int low = max;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(Day(wt, mid) <= d){
                System.out.println(mid);
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
    }
}
