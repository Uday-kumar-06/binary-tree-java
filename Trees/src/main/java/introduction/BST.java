package introduction;

public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
//            this.height = height;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST(){

    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void display(){
        display(root,"Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, "Left child of" + node.getValue()+ ":");
        display(node.right, "Right child of" + node.getValue()+ ":");

    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){

    }

    private Node insert(int value, Node node){

        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.getValue()){
            node.left = insert(value, node.left);
        }

        if(value > node.getValue()){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

}
