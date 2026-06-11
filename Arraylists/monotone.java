import java.util.ArrayList;

public class monotone {

    public static boolean monotoneArrayLists(ArrayList<Integer> arr){
        boolean hasIncreasing = false;

        boolean hasDecresing = false;

        for(int i=1; i<arr.size(); i++){
            if(arr.get(i-1) < arr.get(i)){
                hasIncreasing = true;
            }

            else if(arr.get(i-1) > arr.get(i)){
                hasDecresing = true;
            }
        }

        if(hasDecresing && hasIncreasing){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 3};

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(4);

        System.out.println(monotoneArrayLists(arr));

    }
}
