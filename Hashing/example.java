import java.util.HashMap;

public class example {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("USA", 20);

        System.out.println(hm); // Prints the list in undefined Ordered
        System.out.println(hm.get("India")); // searchs the key inside the list
        System.out.println(hm.containsKey("Indoseia")); // false
        hm.remove("USA");// remove the key from the list

        System.out.println(hm); // Dispalys the final list or HASHMAP
    } 
    // Time complexity of all Functions is O(1)
}

// size for checking the size of the Map
// IsEmpty for checking the emptiness 
    // returns False when Map is not empty
    // returns True when Map is empty
// clear 
// for deleting the nodes inside the HashMap
