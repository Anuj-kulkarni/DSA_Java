public class SearchinBST {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean Search(Node root, int val){
        if(root == null) return false;

        if(root.data == val) return true;

        if(root.data > val){
            Search(root.left, val);
        }

        if(root.data < val){
            Search(root.right, val);
        }

        return false;
    }
    public static void main(String[] args) {
        
        Node root = new Node(1);
        System.out.println(Search(root, 1));

    }
}
