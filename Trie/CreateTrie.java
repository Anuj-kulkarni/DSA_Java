public class CreateTrie {
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

    public static void main(String[] args) {
        String words[] = {"the", "thee", "a", "any", "thier", "three"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}
