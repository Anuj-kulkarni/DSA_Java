
import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(2);
        h.add(null);
        h.add(1);
        h.add(1);

        System.out.println(h);

        h.clear();
        System.out.println(h);

        // Iterations 
        // 1) using Iterators
        HashSet<String> cities = new HashSet<>();

        cities.add("Nashik");
        cities.add("Mumbai");
        cities.add("Dhule");
        cities.add("Jalgoan");

        Iterator itr = cities.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // 2) using Enhanced For Loop

        for(String city : cities){
            System.out.println(city);
        }
    }
}
