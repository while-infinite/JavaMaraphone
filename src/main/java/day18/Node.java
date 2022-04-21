package day18;

public class Node{
    private int value;
    private Node left;
    private Node right;
    private Node parents = this;
    private boolean alreadyVisited = false;          //вводим переменюу что бы определить были на этом узле или нет
    private Node root;

    public Node(int value){
        this.value = value;
    }

    public void AddNode(Node node, int value){
        if(value < node.value){
            if(node.left == null) {
                node.left = new Node(value);
                node.left.setParents(node);
                node.left.setRoot(this);           //передаём ссылку на корневой объект
            }
            else AddNode(node.left, value);
        }
        else{
            if(node.right == null) {
                node.right = new Node(value);
                node.right.setParents(node);
                node.right.setRoot(this);          //передаём ссылку на корневой объект
            }
            else AddNode(node.right, value);
        }
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

    public void setParents(Node parents) {
        this.parents = parents;
    }

    public Node getParents() {
        return parents;
    }

    public void AlreadyVisited(boolean alreadyVisited) {
        this.alreadyVisited = alreadyVisited;
    }

    public boolean isAlreadyVisited() {
        return alreadyVisited;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node node){
        root = node;
    }
}
