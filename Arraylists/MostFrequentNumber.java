import java.util.HashMap;

public class MostFrequentNumber{
    public static void main(String[] args) {

        int nums[] = {1, 100, 200, 1, 100};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i], 1);
            }
        }

        int mostFreq = nums[0];
        int maxcount = hm.get(mostFreq);

        for(int key: hm.keySet()){
            if(hm.get(key) > maxcount){
                maxcount = hm.get(key);
                mostFreq = key;
            }
        }

        System.out.println(mostFreq);
    }
}