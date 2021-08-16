package challenge;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    //www.baeldung.com
    //https://www.baeldung.com/java-binary-tree#:~:text=Implementing%20a%20Binary%20Tree%20in%20Java%201%20Introduction.,4%20Traversing%20the%20Tree.%20...%205%20Conclusion.%20
    Node root; //set in constructor


    private class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;

        }
    }
    //CONSTRUCTOR (binary tree)
    BinaryTree(int value){
        root = new Node(value);

    }
    BinaryTree(){
//            root = new Node(null);
    }
    private Node addRecursive(Node current, int value) { //used within next method to add new nodes
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value); //sets up new node value and return root node...
    }

    public void levelTraversal(){ //tree.levelTraversal
        //create a queue
//        https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
        Queue<Node> que = new LinkedList<Node>();
        //add root to que
        que.add(this.root);
        //while que is not empty, iterate through it...
        while (que.peek()!=null){
            Node currentNode = que.poll();
            System.out.println(currentNode.value);//logging values of traveral
            if (currentNode.left != null){
                que.add(currentNode.left);
            }
            if (currentNode.right != null){
                que.add(currentNode.right);
            }
        }
        //if node.left is not null ,add to que
        //if node.right is not null add to que
        //go to next node


    }

//note that deleting and finding were not implemented because I only needed to traverse the tree

}
