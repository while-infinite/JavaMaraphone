package day18;

public class Task3 {

    public static void dfs(Node node) {
        if(node == null)
            return;

        dfs(node.getLeft());
        System.out.println(node.getValue() + " ");
        dfs(node.getRight());

    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.AddNode(root, 16);
        root.AddNode(root, 8);
        root.AddNode(root, 23);
        root.AddNode(root, 150);
        root.AddNode(root, 27);
        root.AddNode(root, 18);
        root.AddNode(root, 24);
        root.AddNode(root, 22);
        root.AddNode(root, 11);
        root.AddNode(root, 15);
        root.AddNode(root, 14);
        root.AddNode(root, 5);

        dfs(root);
    }
}