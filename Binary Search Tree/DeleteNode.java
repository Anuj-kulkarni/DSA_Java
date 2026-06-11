public class DeleteNode {

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

    public static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val){
        if(root == null){
            return null;
        }

        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{

            if(root.left == null && root.right ==null){
                return null;
            }

            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            Node IS = findInOrderSuccessor(root.right);

            root.data = IS.data;
            root.right = delete(root.right, val);
        }

        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        delete(root, 3);
    }
}
