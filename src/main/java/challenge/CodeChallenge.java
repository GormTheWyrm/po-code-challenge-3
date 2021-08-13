package challenge;

import java.util.TreeSet;

public class CodeChallenge {

    /*
    For Java:
Write java program to do level order traversal of binary tree. You can use queue data structure to do level order traversal.
     */
    //level order traversal is clearing each level in the tree before moving deeper
//add each node's children to queue as you travese it!


    //first, create a queue associated with the class?
    //then, add a method to traverse a passed in binary tree...make sure it is NOT static
    //...how to pass in Binary tree- do I have to make that class?

    //variables
    BinaryTree tree;
    CodeChallenge(int val){
        this.tree = new BinaryTree(val);
    }

    public void traverse(TreeSet treeSet){

    }
    public class BinaryTree{ //www.baeldung.com
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
        //CONSTRUCTOR
        BinaryTree(int value){
            root = new Node(value);
        }
//        BinaryTree(){
//            root = new Node(null);
//        }




    }//end binary tree

    public static void main(String[] args) {
        //this will run the scenario
    //create new binary tree



    }

}//end coding challenge
