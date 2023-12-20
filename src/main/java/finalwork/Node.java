package finalwork;

public class Node {

    Node next;
    Node prev;
    Stage stage;

    public Node(Node prev, Stage stage, Node next) {
        this.prev = prev;
        this.stage = stage;
        this.next = next;
    }
}