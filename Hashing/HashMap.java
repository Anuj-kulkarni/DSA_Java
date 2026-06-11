
import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("USA", 40);

        System.out.println(hm);
    }
}
