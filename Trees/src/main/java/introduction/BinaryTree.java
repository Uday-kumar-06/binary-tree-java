package introduction;

import java.util.Scanner;

public class BinaryTree {

    private static class Node{
        int value;
        Node right;
        Node left;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;
    //insert element
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of" + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
    }


    public static void main(String [] args){

    }
}
