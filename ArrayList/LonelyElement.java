import java.util.HashMap;

public class LonelyElement {

    public static void LonelyArr(int [] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(i)+1);
            }else{
                hm.put(arr[i], 1);
            }
        }

        for (int num : arr) {
            if (hm.get(num) == 1 && !hm.containsKey(num + 1) && !hm.containsKey(num - 1)) {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 6, 5, 8};

        LonelyArr(arr);
    }
}
