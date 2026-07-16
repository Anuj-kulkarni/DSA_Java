
import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String args[]){

        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> me = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(me.containsKey(arr[i])){
                me.put(arr[i], me.get(arr[i])+1);
            }else{
                me.put(arr[i], 1);
            }
        }

        Set<Integer> KeySet = me.keySet();
        for(Integer Key : KeySet){
            if(me.get(Key) > arr.length/3){
                System.out.println(Key);
            }
        }
    }
}