public class WordBreakDown {
    public static class Node{
        Node character[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                character[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;

        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.character[idx] == null){
                curr.character[idx] = new Node();
            }
            curr = curr.character[idx];
        }

        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;

        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.character[idx] == null){
                return false;
            }
            curr = curr.character[idx];
        }

        return curr.eow == true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0) return true;

        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }

        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
