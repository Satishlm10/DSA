public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.print("In-order traversal: ");
        bst.inOrderTraversal();

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));
        
        System.out.println("Removing 40");
        bst.remove(40);
        System.out.println("Search 40: " + bst.search(40));
    }
}