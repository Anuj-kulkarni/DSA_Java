
import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Nashik");
        cities.add("Dhule");
        cities.add("Mumbai");
        cities.add("Jalgaon");

        System.out.println(cities); // order remains the same as per insertion
    }
}
