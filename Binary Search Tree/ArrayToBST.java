public class ArrayToBST {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node arrToBST(int arr[], int s, int e){
        if(s > e){
            return null;
        }

        int mid = s + (e-s)/2;

        Node root = new Node(arr[mid]);

        root.left = arrToBST(arr, s, mid-1);
        root.right = arrToBST(arr, mid+1, e);

        // inOrder(root);

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+ " ");
        inOrder(root.left);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};

        Node root = arrToBST(nums, 0, nums.length -1);
        inOrder(root);

    }
}
