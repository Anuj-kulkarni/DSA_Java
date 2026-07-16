
import java.util.HashMap;
import java.util.Set;

public class Iterations {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);
        
        Set<String> keys = hm.keySet();

        System.out.println(keys);

        for (String k : keys) { // foreach loop
            System.out.println("Key="+ k + ", Value="+ hm.get(k));
        }
    }
}
