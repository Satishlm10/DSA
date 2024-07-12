/*
 The node of a tree consists of three things:
 1. Value of the node
 2. Left child (optional)
 3. Right child (optional)

 a value of node is must
 a node can have 0,1 or 2 children left and right child are initialized to null
 */


public class TreeNode
{
     int data;
    TreeNode left_child;

    TreeNode right_child;

    public  TreeNode(int value){
        this.data = value;
        this.left_child = null;
        this.right_child = null;
    }

    public int getValue() {
        return data;
    }
}
