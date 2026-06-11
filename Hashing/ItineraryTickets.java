import java.util.HashMap;

public class ItineraryTickets {

    public static String getStatred(HashMap<String, String> tickets){

        HashMap<String, String> revMap = new HashMap<>();
        for(String Key : tickets.keySet()){
            revMap.put(tickets.get(Key), Key);
        }

        for(String Key : tickets.keySet()){
            if(!revMap.containsKey(Key)){
                return Key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStatred(tickets);
        System.out.print(start);

        for(String Key : tickets.keySet()){
            System.out.print(" -> "+ tickets.get(start) );
            start = tickets.get(start);
        }

    }
}
