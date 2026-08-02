public class AllocateBooks {
    public static int students(int arr[], int pages){
        int student = 1; // count of student
        int page_Student = 0; // pages 1 student can read
        for(int i=0; i<arr.length; i++){
            if(page_Student + arr[i] <= pages){ // add uptill mid 
                page_Student += arr[i]; 
            }else{
                student ++;
                page_Student = arr[i];
            }
        }
        return student; // returns total no of students which can read the book from array
    }
    public static void main(String[] args) {
        int arr[] ={};
        int low = 0;
        int high = 0;

        int m = 4; // no of Students 
        for(int i=0; i<arr.length; i++){
            low = Math.max(low, arr[i]); // highest no in array
            high += arr[i]; // total sum of array 
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            int no_s = students(arr, mid);

            if(no_s > m){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(low);
        
    }
}
