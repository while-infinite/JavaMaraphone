package day18;

public class Node{
    private int value;
    private Node left;
    private Node right;

    public Node(int value){
        this.value = value;
    }

    public void AddNode(Node root, int value){
        if(root == null)
            throw new IllegalArgumentException("Корневой узел должен ыть не null");
        Node nextNode = root;
        Node current = null;

        while(nextNode != null){
            current = nextNode;

            if(value < current.getValue())
                nextNode = current.getLeft();
            else
                nextNode = current.getRight();
        }

        if(value < current.getValue())
            current.setLeft(new Node(value));
        else
            current.setRight(new Node(value));

    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
