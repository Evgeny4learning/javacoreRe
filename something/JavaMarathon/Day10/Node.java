package zz.something.JavaMarathon.Day10;

import javax.swing.tree.TreeNode;

public class Node {

    private final int value;
    private Node leftChild;
    private Node rightChild;
    private Node root = new Node(20);

    public Node(int value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }

    public void addNode(int value, Node root) {
        //should add node in tree by if logic
        if (root == null) {
            root = new Node(value);
        //how to stop like break
        }

    }

}
