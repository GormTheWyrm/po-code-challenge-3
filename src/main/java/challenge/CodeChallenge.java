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


    public static void main(String[] args) {
        //this will run the scenario
        BinaryTree tree = new BinaryTree();
        tree.add(13);
        tree.add(7);
        tree.add(3);
        tree.add(12);
        tree.add(21);
        tree.add(5);
        tree.levelTraversal(); //prints


    }

}//end coding challenge
