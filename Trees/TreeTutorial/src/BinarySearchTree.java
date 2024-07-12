public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left_child = insertRec(root.left_child, data);
        } else if (data > root.data) {
            root.right_child = insertRec(root.right_child, data);
        }
        return root;
    }


    public boolean search(int data) {
        return searchRec(root, data) != null;
    }

    private TreeNode searchRec(TreeNode root, int data) {
        if (root == null || root.data == data) {
            return root;
        }
        if (data < root.data) {
            return searchRec(root.left_child, data);
        }
        return searchRec(root.right_child, data);
    }


    public void remove(int data) {
        root = removeRec(root, data);
    }

    private TreeNode removeRec(TreeNode root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.data) {
            root.left_child = removeRec(root.left_child, data);
        } else if (data > root.data) {
            root.right_child = removeRec(root.right_child, data);
        } else {

            if (root.left_child == null) {
                return root.right_child;
            } else if (root.right_child == null) {
                return root.left_child;
            }

            root.data = minValue(root.right_child);

            root.right_child = removeRec(root.right_child, root.data);
        }

        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.data;
        while (root.left_child != null) {
            minValue = root.left_child.data;
            root = root.left_child;
        }
        return minValue;
    }


    public void inOrderTraversal() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left_child);
            System.out.print(root.data + " ");
            inOrderRec(root.right_child);
        }
    }


}
